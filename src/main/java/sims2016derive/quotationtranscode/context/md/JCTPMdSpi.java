package sims2016derive.quotationtranscode.context.md;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import sims2016derive.common.log.ext.BizLogger;
import sims2016derive.common.log.ext.BizLoggerFactory;
import sims2016derive.common.util.DateUtils;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcDepthMarketDataField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSpecificInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;
import sims2016derive.quotationtranscode.context.trader.JCTPTraderSpi;
import sims2016derive.quotationtranscode.context.util.JCTPContants;
import sims2016derive.quotationtranscode.context.util.JCTPUtil;
import sims2016derive.quotationtranscode.context.util.JConfigRole;
import sims2016derive.quotationtranscode.description.QuotationSourceRingBufferDescription;
import sims2016derive.quotationtranscode.description.QuotationTranscodeDescription;
import sims2016derive.role.quotation.DepthQuotationRole;

/**
 * <pre>
 * ���ߣ�wengqf
 * ��Ŀ��sims2016derive-quotationtranscode-ctp32
 * ��˵������װ��
 * ���ڣ�2016��1��21��
 * ��ע��
 * </pre>
 */
public class JCTPMdSpi {
    private BizLogger logger = BizLoggerFactory.getLogger(JCTPMdSpi.class);
    private static final BigDecimal ZERO = BigDecimal.ZERO;
    private static final Long QTY = 0L;//����
    private String[] instrumentIDs;//��ź�Լ������
    private JCTPMdApi mdApi = null;
    private int sucessIDCount = 0;//�ɹ����ĵĺ�Լ����
    private int requestID = 0;
    private String exchCode = "";
    private JConfigRole configRole = null;
    private QuotationSourceRingBufferDescription quotationSourRingBufDesc = null;//������
    private QuotationTranscodeDescription quotationTranscodeDesc = null;//ת������
    private boolean flag = false;//��ر�ʶ

    public JCTPMdSpi() {
    }

    /**
     * �������鶩������
     * ��1��������Լ��ѯ
     * ��2���������鶩��
     */
    public boolean startMDSpi(JConfigRole configRole, QuotationSourceRingBufferDescription quotationSrcDesc,
            QuotationTranscodeDescription quotationTranscodeDesc) {
        logger.error("�������(startMDSpi):����......");

        if (null == configRole || null == quotationSrcDesc || null == quotationTranscodeDesc) {
            logger.error("�������(startMDSpi):����ʧ�ܣ��ؼ����Ϊ��......");
            return false;
        }

        this.configRole = configRole;
        this.quotationSourRingBufDesc = quotationSrcDesc;
        this.quotationTranscodeDesc = quotationTranscodeDesc;

        JCTPTraderSpi traderSpi = new JCTPTraderSpi();
        traderSpi.getInstrumentID(configRole, false);

        //���� APIʵ��
        //�� APIʵ��ע�� SPIʵ��
        //ע�ύ��ǰ�õ�ַ
        //��ʼ��
        if (null == mdApi) {
            mdApi = JCTPMdApi.createFtdcMdApi();
            if (null == mdApi) {
                logger.error("�������(startMDSpi):createFtdcMdApiʧ��!");
                return false;
            }
        }
        mdApi.registerSpi(this);
        mdApi.registerFront("tcp://" + configRole.getMarketAddr());
        mdApi.init();
        logger.error("�������(startMDSpi):�����ɹ�.");

        //������̨�̲߳�ѯ��Լ��δʵ��
        return true;
    }

    /**
     * �ر����鶩��
     */
    public void stopMDSpi() {
        if (null != mdApi) {
            mdApi.release();
            mdApi = null;
        }
    }

    /**
     * �ͻ���������ǰ�û��������ӣ����������¼���������֤
     */
    public void onFrontConnected() {
        logger.info("�������(onFrontConnected):��������ǰ�û��ɹ�!");

        //�����¼
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID(configRole.getBrokerID());
        userLoginField.setUserID(configRole.getUserID());
        userLoginField.setPassword(configRole.getPassword());
        //�ú������᷵��һ������ֵ����־�������Ƿ񱻳ɹ����ͳ�ȥ����������������Ƿ�ᱻ����˴���
        if (requestID >= JCTPUtil.MAX_INT_VALUE) {
            requestID = 0;
        }
        String userInfo = "BorkerID:" + configRole.getBrokerID() + ",UserID:" + configRole.getUserID();
        if (mdApi.reqUserLogin(userLoginField, requestID++) != 0) {
            logger.info("�������(onFrontConnected):���͵�¼����ʧ��:" + userInfo);
        } else {
            logger.info("�������(onFrontConnected):���͵�¼����ɹ�:" + userInfo);
        }
    }

    /**
     * ����ͻ��˵�����ǰ�õ��������֤���ӽ���ʧ�ܣ� ������������á����еĲ���˵������ʧ�ܵ�ԭ��
     * @param nReason
     */
    public void onFrontDisconnected(int nReason) {
        logger.info("�������(onFrontDisconnected):���ͻ����뽻�׺�̨ͨ�����ӶϿ�ʱ," + JCTPUtil.getReasonTraderMsg(nReason));
    }

    /**
     * �������һ��ʱ���ڿͻ��˺�ϵͳ֮��û���κ���Ϣ���������� ��������ᷢ����������˵���ͻ��˵�ϵͳ������֮
     * ��������ǻ�Ծ�ġ�
     * @param nTimeLapse
     */
    public void onHeartBeatWarning(int nTimeLapse) {
        logger.warn("�������(onHeartBeatWarning):������ʱ" + nTimeLapse + "��,����!");
    }

    /**
     * ����ϵͳ�Կͻ��˵������¼��Ϣ��������Ӧ�� ��¼������Ӧ
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspUserLogin(CThostFtdcRspUserLoginField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        //��¼��־����ֵ
        if (null != pRspInfo) {
            logger.error("�������(OnRspUserLogin):���׷�������¼�ɹ�.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        } else {
            logger.info("�������(OnRspUserLogin):���׷�������¼ʧ��");
        }

        //��¼Ӧ����־
        if (null != pOutInfo) {
            logger.info("�������(onRspUserLogin):" + pOutInfo.toString());
        }

        //���ݲ�ѯ���ĺ�Լ���ж���
        if (isLast) {
            instrumentIDs = new String[JCTPContants.instrumentSet.size()];
            int index = 0;
            for (String instrumentID : JCTPContants.instrumentSet) {
                instrumentIDs[index++] = instrumentID;
            }
            int subResult = mdApi.subscribeMarketData(instrumentIDs);
            if (JCTPContants.instrumentSet.size() != 0 && subResult != 0) {
                logger.info("�������(onRspUserLogin):������" + index + "������,�������鶩������ʧ��.");
            } else {
                logger.info("�������(onRspUserLogin):������" + index + "������,�������鶩������ɹ�.");
            }
        }
    }

    /**
     * �˳���¼
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspUserLogout(CThostFtdcUserLogoutField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        //��¼��־����ֵ
        if (null == pRspInfo) {
            logger.info("�������(onRspUserLogout):����������ǳ��ɹ�");
        } else {
            logger.error("�������(onRspUserLogout):����������ǳ�ʧ��.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        }

        //��¼Ӧ����־
        if (null != pOutInfo) {
            logger.info("�������(onRspUserLogout):" + pOutInfo.toString());
        }
    }

    /**
     * �������ϵͳ�޷�ʶ��ͻ��˷��͵�������Ϣ�� ��ͨ������������ش�����Ϣ��
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        if (null != pRspInfo) {
            logger.error("�������(onRspError):����֪ͨ.ErrCode=" + pRspInfo.getErrorID() + "|ErrMsg=" + pRspInfo.getErrorMsg());
        }
    }

    /**
     * ����ͻ��˶�������������ǲ��Ϸ��ģ��ú������ط������˸����Ĵ�����Ϣ��pRspInfo������ʹ�ͻ��˷�
     * �͵Ķ��������ǺϷ��ģ��ú���Ҳ�ᱻ���ã������ص���Ϣ���ǡ�CTP��No Error����
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspSubMarketData(CThostFtdcSpecificInstrumentField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        //��¼��־����ֵ
        if (null == pRspInfo) {
            logger.info("�������(onRspSubMarketData):���鶩�Ĵ���.");
        }

        if (null != pOutInfo) {
            sucessIDCount++;
            JCTPContants.instrumentRspSet.add(pOutInfo.getInstrumentID());
            logger.info("�������(onRspSubMarketData):���ĳɹ�,��" + sucessIDCount + "��,��Լ���룺" + pOutInfo.getInstrumentID());
        }

        //(1)ÿ����Ӧ111��,��Ӧ����111���������
        //(2)��ѯ��Լ������Ӧ��Լ����ͬ��ʾȫ�����ĳɹ�����ͬ��ʾ�в��ֶ���ʧ�ܣ�����¼����ʧ�ܺ�Լ������
        //(3)��ѯ��Լ����Զ���ڵ�����Ӧ��Լ��,��������Ӧ��Լset�������ɹ��ĺ�Լ��ʾ����ʧ�ܣ�set����������ͬԪ�أ�
        //(4)��������,�´δ�ͷ���� 
        if (isLast) {
            logger.info("�������(onRspSubMarketData):���κ�Լ���Ĺ��ɹ�" + sucessIDCount + "��");
            if (sucessIDCount != JCTPUtil.RESPONNUM) {
                if (JCTPContants.instrumentRspSet.size() != JCTPContants.instrumentSet.size()) {//(2)
                    for (String instrumentIDstr : JCTPContants.instrumentSet) {//(3)
                        if (JCTPContants.instrumentRspSet.add(instrumentIDstr)) {
                            logger.error("�������(onRspSubMarketData):��Լ����ʧ��:" + instrumentIDstr);
                        }
                    } //end for
                } else {
                    logger.error("�������(onRspSubMarketData):�ܶ��ĺ�Լ�ɹ�:" + JCTPContants.instrumentSet.size() + "��");
                }
                JCTPContants.instrumentRspSet.clear();
            } //end (sucessIDCount != JCTPUtil.RESPONNUM)
            sucessIDCount = 0;//(4)       
        } //end if (isLast)

    }

    /**
     * ȡ����������Ӧ��
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param bIsLast
     */
    public void onRspUnSubMarketData(CThostFtdcSpecificInstrumentField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

        //��¼��־
        if (null != pRspInfo) {
            logger.info("�������(onRspUnSubMarketData):�˶���Լʧ��ErrorCode=" + pRspInfo.getErrorID() + "|ErrorMsg" + pRspInfo.getErrorMsg());
        }
        if (null != pOutInfo) {
            logger.info("�������(onRspUnSubMarketData):�˶���Լ�ɹ�!��Լ���룺 " + pOutInfo.getInstrumentID());
        }

    }
    
    /**
     * ���鶩�������ǺϷ��ģ������ֱ�ӷ���ĳ��Լ���г����顣Ƶ���� ÿ������
     * @param pOutInfo
     */
    public void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pOutInfo) {
        flag = true;
        //��κϷ�����֤
        if (null == pOutInfo) {
            logger.error("�������(onRtnDepthMarketData):������������,������������ַΪ��.");
            return;
        }
        DepthQuotationRole role = new DepthQuotationRole();
        role.setQuotationDate(DateUtils.YYYY_MM_DD(new Date()));
        role.setSecurityStatusCode("000000");
        role.setQuotationTime(DateUtils.HHMMSS_SSS(new Date()));
        exchCode = JCTPContants.exchangeMap.get(pOutInfo.getInstrumentID());//����������
        if (StringUtils.isBlank(exchCode)) {
            logger.error("�������(onRtnDepthMarketData):����������Ϊ��:" + pOutInfo.toString());
            return;
        }
        role.setExchangeCode(exchCode);//����������
        role.setSecurityCode(pOutInfo.getInstrumentID());//��Լ����
        role.setPrevClosePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getPreClosePrice()));//�������̼�
        role.setPrevSettlePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getPreSettlementPrice()));//���ս����
        role.setPrevDeltaValue(JCTPUtil.convertToBigDeicmal(pOutInfo.getPreDelta()));//����ʵ��
        role.setDeltaValue(JCTPUtil.convertToBigDeicmal(pOutInfo.getCurrDelta()));//����ʵ��
        role.setClosePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getClosePrice()));//������
        role.setPrevTotalLongPosiQty(JCTPUtil.convertToLong(pOutInfo.getPreOpenInterest()));//��ֲ���
        role.setSettlePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getSettlementPrice()));//���ν����
        role.setTotalLongPosiQty(JCTPUtil.convertToLong(pOutInfo.getOpenInterest()));//�ֲ���
        role.setOpenPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getOpenPrice()));//���̼�
        role.setUpperLimitPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getUpperLimitPrice()));//��ͣ��
        role.setLowerLimitPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getLowerLimitPrice()));//��ͣ��
        role.setHighestPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getHighestPrice()));//��߼�
        role.setLowestPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getLowestPrice()));//��ͼ�
        role.setLastestPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getLastPrice()));//���¼�
        role.setIopvValue(ZERO);//��ӯ��
        role.setPrevIOPVValue(ZERO);//������ӯ��
        role.setTotalTickCount(QTY);//�ɽ�����
        role.setTotalMatchQty(JCTPUtil.convertToLong(pOutInfo.getVolume()));//����
        role.setTotalMatchAmt(JCTPUtil.convertToBigDeicmal(pOutInfo.getTurnover()));//�ɽ����
        role.setCallOnePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice1()));//�����һ
        role.setCallTwoPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice2()));//����۶�
        role.setCallThreePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice3()));//�������
        role.setCallFourPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice4()));//�������
        role.setCallFivePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice5()));//�������
        role.setCallSixPrice(ZERO);
        role.setCallSevenPrice(ZERO);
        role.setCallEightPrice(ZERO);
        role.setCallNinePrice(ZERO);
        role.setCallTenPrice(ZERO);
        role.setCallOneQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume1()));//������һ
        role.setCallTwoQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume2()));//��������
        role.setCallThreeQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume3()));//��������
        role.setCallFourQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume4()));//��������
        role.setCallFiveQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume5()));//��������
        role.setCallSixQty(QTY);
        role.setCallSevenQty(QTY);
        role.setCallEightQty(QTY);
        role.setCallNineQty(QTY);
        role.setCallTenQty(QTY);
        role.setPutOnePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice1()));//������һ
        role.setPutTwoPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice2()));//�����۶�
        role.setPutThreePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice3()));//������
        role.setPutFourPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice4()));//��������
        role.setPutFivePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice5()));//��������
        role.setPutSixPrice(ZERO);
        role.setPutSevenPrice(ZERO);
        role.setPutEightPrice(ZERO);
        role.setPutNinePrice(ZERO);
        role.setPutTenPrice(ZERO);
        role.setPutOneQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume1()));//������һ  
        role.setPutTwoQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume2()));//��������  
        role.setPutThreeQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume3()));//��������
        role.setPutFourQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume4()));//�������� 
        role.setPutFiveQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume5()));//�������� 
        role.setPutSixQty(QTY);
        role.setPutSevenQty(QTY);
        role.setPutEightQty(QTY);
        role.setPutNineQty(QTY);
        role.setPutTenQty(QTY);
        if (!quotationTranscodeDesc.putQuotationSrcRingBuffer(role, quotationSourRingBufDesc)) {
            logger.info("�������(onRtnDepthMarketData):�������������ʧ��" + "��������:" + role.toString());
        }
    }
    
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
