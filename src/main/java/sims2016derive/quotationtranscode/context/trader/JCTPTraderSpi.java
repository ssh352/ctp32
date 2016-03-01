package sims2016derive.quotationtranscode.context.trader;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import sims2016derive.common.log.ext.BizLogger;
import sims2016derive.common.log.ext.BizLoggerFactory;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcAccountregisterField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcBrokerTradingAlgosField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcBrokerTradingParamsField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcCFMMCTradingAccountKeyField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcCancelAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcChangeAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcContractBankField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcDepthMarketDataField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcEWarrantOffsetField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcErrorConditionalOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcExchangeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInputOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInputOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentCommissionRateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentMarginRateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentStatusField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorPositionCombineDetailField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorPositionDetailField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorPositionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcNoticeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcNotifyQueryAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcOpenAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQueryMaxOrderVolumeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRemoveParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRemoveParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqQueryAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqRepealField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqTransferField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspAuthenticateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspRepealField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspTransferField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSettlementInfoConfirmField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSettlementInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingAccountPasswordUpdateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingCodeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingNoticeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingNoticeInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTransferBankField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTransferSerialField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserPasswordUpdateField;
import sims2016derive.quotationtranscode.context.util.JCTPContants;
import sims2016derive.quotationtranscode.context.util.JCTPUtil;
import sims2016derive.quotationtranscode.context.util.JConfigRole;

/**
 * <pre>
 * ���ߣ�wengqf
 * ��Ŀ��sims2016derive-quotationtranscode-ctp32
 * ��˵������װ��
 * ���ڣ�2016��1��21��
 * ��ע��
 * </pre>
 */
public class JCTPTraderSpi {
    private BizLogger logger = BizLoggerFactory.getLogger(JCTPTraderSpi.class);
    private BlockingQueue<Boolean> blockingQueue = new ArrayBlockingQueue<Boolean>(10);
    private JCTPTraderApi traderApi = null;

    private int requestID = 0;//�����
    private boolean isBackThread;//�Ǻ�̨�̲߳�ѯ
    private JConfigRole configRole;
    private int instrumentCount = 0;
    private long beginTime = System.currentTimeMillis();

    public JCTPTraderSpi() {
        super();
    }

    /**
     * ��ѯ��̨��Լ���浽��Լ�б�
     * 
     * @param backQuery ture��ʾ��̨��ѯ��ÿ��5�ֲ�ѯһ�Σ�false��ʾǰ̨��ѯ��ǰ̨��ѯ��������ʱ��ѯһ��
     * @return
     */
    public boolean getInstrumentID(JConfigRole role, boolean backThread) {
        configRole = role;
        isBackThread = backThread;
        //(1)���� APIʵ��
        //(2)�� APIʵ��ע�� SPIʵ��
        //(3)ע�ύ��ǰ�õ�ַ
        //(4)��ʼ��
        if (null == traderApi) {
            traderApi = JCTPTraderApi.createFtdcTraderApi();
            if (null == traderApi) {
                logger.error("���׷���(createFtdcTraderApi)ʧ��!");
                return false;
            }
        }
        traderApi.registerSpi(this);
        traderApi.registerFront("tcp://" + configRole.getTradeAddr());
        traderApi.init();

        //֮���ִ������:
        //(1)��OnFrontConnected�е�½,
        //(2)��OnRspUserLogin�в�ѯ��ԼID,
        //(3)��OnRspSubMarketData�з��ز�ѯ��ԼID�ɹ����,���ɹ��Ѻ�ԼID�洢����ά�����С�
        //(4)��ȴ�60�뻽��                 
        try {
            blockingQueue.poll(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            blockingQueue = null;
        }

        if (null != traderApi) {
            traderApi.release();
            traderApi = null;
        }

        return true;
    }

    /**
     * ���ͻ����뽻�׺�̨������ͨ������ʱ����δ��¼ǰ��,�÷��������á�
     */
    public void onFrontConnected() {
        logger.info("���׷���(onFrontConnected):���ӽ���ǰ�û��ɹ�!");

        //��¼���׷���
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID(configRole.getBrokerID());
        userLoginField.setUserID(configRole.getUserID());
        userLoginField.setPassword(configRole.getPassword());

        if (requestID >= JCTPUtil.MAX_INT_VALUE) {
            requestID = 0;
        }

        String userInfo = "BorkerID:" + configRole.getBrokerID() + ",UserID:" + configRole.getUserID();
        if (traderApi.reqUserLogin(userLoginField, requestID++) != 0) {
            logger.info("���׷���(onFrontConnected):���͵�¼����ʧ��:" + userInfo);
        } else {
            logger.info("���׷���(onFrontConnected):���͵�¼����ɹ�:" + userInfo);
        }
    }

    /**
     * ���ͻ����뽻�׺�̨ͨ�����ӶϿ�ʱ,�÷��������á���������������,API���Զ���������,�ͻ��˿ɲ�������
     * 0x1001 �����ʧ��
     * 0x1002 ����дʧ��
     * 0x2001 ����������ʱ
     * 0x2002 ��������ʧ��
     * 0x2003 �յ�������
     * @param nReason
     */
    public void onFrontDisconnected(int nReason) {
        logger.info("���׷���(onFrontDisconnected):�ͻ����뽻�׷���Ͽ�����,ԭ��=" + JCTPUtil.getReasonTraderMsg(nReason));
    }

    /**
     * ��¼������Ӧ
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspUserLogin(CThostFtdcRspUserLoginField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

        //��¼��־����ֵ
        if (null != pRspInfo) {
            logger.error("���׷���(OnRspUserLogin):���׷�������¼�ɹ�.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        } else {
            logger.info("���׷���(OnRspUserLogin):���׷�������¼ʧ��");
        }

        //��¼Ӧ����־
        if (null != pOutInfo) {
            logger.info("���׷���(OnRspUserLogin):" + pOutInfo.toString());
        }

        //��ѯ��������Լ�����鶩��ʹ��
        if (isLast) {
            CThostFtdcQryInstrumentField stInstrument = new CThostFtdcQryInstrumentField();
            if (requestID >= JCTPUtil.MAX_INT_VALUE) {
                requestID = 0;
            }

            //��ʱ�����ˣ�ִ��ȫ����ѯ
            stInstrument.setExchangeID("");
//            stInstrument.setInstrumentID("IF1603");
            if (0 != traderApi.reqQryInstrument(stInstrument, requestID++)) {
                logger.info("���׷���(ReqQryInstrument):���Ͳ�ѯ��Լ����ʧ��");
            } else {
                logger.info("���׷���(ReqQryInstrument):���Ͳ�ѯ��Լ����ɹ�");
            }
        }
    }

    /**
    * �����ѯ��Լ��Ӧ
    * @param pOutInfo
    * @param pRspInfo
    * @param nRequestID
    * @param isLast
    */
    public void onRspQryInstrument(CThostFtdcInstrumentField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

        //��¼��־����ֵ
        if (null != pRspInfo) {
            logger.error("���׷���(onRspQryInstrument):��ѯ��Լ��Ӧʧ��.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        }

        instrumentCount++;
        boolean addSuccess = false;

        //����ѯ���ĺ�Լ�ŵ�map��,����ֵ��д����������
        if (null != pOutInfo) {

            if (configRole.getCffex().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPCFFEX)) {//�н���
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCCFFEX);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getCffexFutures(), configRole.getCffexOptions(),
                        configRole.getCffexCombination(), configRole.getCffexSpot(), configRole.getCffexEfp(), configRole.getCffexSpotoption());

            } else if (configRole.getShfe().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPSHFE)) {//������ 
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCSHFE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getShfeFutures(), configRole.getShfeOptions(),
                        configRole.getShfeCombination(), configRole.getShfeSpot(), configRole.getShfeEfp(), configRole.getShfeSpotoption());

            } else if (configRole.getDce().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPDCE)) { //������
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCDCE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getDceFutures(), configRole.getDceOptions(),
                        configRole.getDceCombination(), configRole.getDceSpot(), configRole.getDceEfp(), configRole.getDceSpotoption());

            } else if (configRole.getCzce().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPCZCE)) {//֣����
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCCZCE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getCzceFutures(), configRole.getCzceOptions(),
                        configRole.getCzceCombination(), configRole.getCzceSpot(), configRole.getCzceEfp(), configRole.getCzceSpotoption());

            } else if (configRole.getIne().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPXSGE)) {//��Դ��
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCXSGE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getIneFutures(), configRole.getIneOptions(),
                        configRole.getIneCombination(), configRole.getIneSpot(), configRole.getIneEfp(), configRole.getIneSpotoption());
            } else {
                //                logger.error("���׷���(onRspQryInstrument):����������δ����" + pOutInfo.getExchangeID() + "������Ϣ:" + pOutInfo.toString());
            }
        } else {
            logger.error("���׷���(onRspQryInstrument):��ѯ��Լ��Ӧ" + "��" + instrumentCount + "��������Ϊ��.");
        }

        //��¼��־,ֻҪ�����ӱ���д��־
        if (addSuccess && null != pOutInfo) {
            logger.info("���׷���(onRspQryInstrument):��" + JCTPContants.instrumentSet.size() + "����Լ��ѯ�ɹ�!" + pOutInfo.toString());
        }

        //�����ǰ̨��ѯ��¼����������Ǻ�̨��ѯ��¼��ѯ�������Ƿ�������
        if (isLast) {
            double diffTime = (System.currentTimeMillis() - beginTime) / 1000.0;
            logger.info("���׷���(onRspQryInstrument):���ι���ѯ" + instrumentCount + "��,�����б�" + JCTPContants.instrumentSet.size() + "��.��ʱ" + diffTime);

            //������Ϣ��
            try {
                blockingQueue.put(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ��������ж��Ƿ�Ҫ������Ȩ��Լ
     * �ڻ�futures '1'�ڻ���Ȩoptions'2'���combination '3'����spot'4'��ת��efp'5'�ֻ���Ȩspotoption'6'
     * ע��ǰ̨��ѯ���̨��ѯ,�鵽�ĺ�ԼID�������Ӧ�Ľ�����ID����ŵ�λ�ò�ͬ��
     * ǰ̨��ѯ��������ʱ�������飬��̨��ѯ��������ʱУ�����鶩���Ƿ�©��
     * @param pRspInstrument
     * @param bPuTong
     * @param bQiQuan
     * @param bBackThread
     * @return
     */
    public boolean addInstrumentID(String instrumentID, char productClass, String futures, String options, String combination, String spot, String efp,
            String spotoption) {
        boolean result = false;
        boolean addInstrument = false;

        if (futures.equals(JCTPUtil.YES) && JCTPUtil.FUTURE_1 == productClass) {
            addInstrument = true;
        } else if (options.equals(JCTPUtil.YES) && JCTPUtil.OPTION_2 == productClass) {
            addInstrument = true;
        } else if (combination.equals(JCTPUtil.YES) && JCTPUtil.FUTURE_3 == productClass) {
            addInstrument = true;
        } else if (spot.equals(JCTPUtil.YES) && JCTPUtil.FUTURE_4 == productClass) {
            addInstrument = true;
        } else if (efp.equals(JCTPUtil.YES) && JCTPUtil.FUTURE_5 == productClass) {
            addInstrument = true;
        } else if (spotoption.equals(JCTPUtil.YES) && JCTPUtil.OPTION_6 == productClass) {
            addInstrument = true;
        }

        if (addInstrument) {
            if (isBackThread) {
                JCTPContants.compareInstrumentMap.put(instrumentID, false);
            } else {
                result = JCTPContants.instrumentSet.add(instrumentID);
            }
        }

        return result;
    }

    /**
     * ��Զ���ᷢ�����Ѿ��� API �û������˸���Ӧ
     * @param nTimeLapse
     */
    public void onHeartBeatWarning(int nTimeLapse) {
        logger.warn("���׷���(onHeartBeatWarning):������ʱ" + nTimeLapse + "��,����!");
    }

    /**
     * �������ϵͳ�޷�ʶ��ͻ��˷��͵�������Ϣ�� ��ͨ������������ش�����Ϣ��
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        if (null != pRspInfo) {
            logger.error("���׷���(onRspError):CTP����֪ͨ,ErrCode=" + pRspInfo.getErrorID() + "|ErrMsg=" + pRspInfo.getErrorMsg());
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //                                 �����ݲ���Ҫʵ��                                                                                                  //
    ///////////////////////////////////////////////////////////////////////////////////

    public void onRspAuthenticate(CThostFtdcRspAuthenticateField pRspAuthenticateField, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryInstrumentMarginRate(CThostFtdcInstrumentMarginRateField pInstrumentMarginRate, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, CThostFtdcRspInfoField pRspInfo,
            int nRequestID, boolean isLast) {

    }

    public void onRspOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspQryOrder(CThostFtdcOrderField pOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryTrade(CThostFtdcTradeField pTrade, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryInvestorPosition(CThostFtdcInvestorPositionField pInvestorPosition, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryTradingAccount(CThostFtdcTradingAccountField pTradingAccount, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryInvestor(CThostFtdcInvestorField pInvestor, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryTradingCode(CThostFtdcTradingCodeField pTradingCode, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryInstrumentCommissionRate(CThostFtdcInstrumentCommissionRateField pInstrumentCommissionRate, CThostFtdcRspInfoField pRspInfo,
            int nRequestID, boolean isLast) {

    }

    public void onRspQryExchange(CThostFtdcExchangeField pExchange, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQrySettlementInfo(CThostFtdcSettlementInfoField pSettlementInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryTransferBank(CThostFtdcTransferBankField pTransferBank, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryInvestorPositionDetail(CThostFtdcInvestorPositionDetailField pInvestorPositionDetail, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspQryNotice(CThostFtdcNoticeField pNotice, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQrySettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspQryInvestorPositionCombineDetail(CThostFtdcInvestorPositionCombineDetailField pInvestorPositionCombineDetail,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryCFMMCTradingAccountKey(CThostFtdcCFMMCTradingAccountKeyField pCFMMCTradingAccountKey, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspQryEWarrantOffset(CThostFtdcEWarrantOffsetField pEWarrantOffset, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryTransferSerial(CThostFtdcTransferSerialField pTransferSerial, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryAccountregister(CThostFtdcAccountregisterField pAccountregister, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRtnOrder(CThostFtdcOrderField pOrder) {

    }

    public void onRtnTrade(CThostFtdcTradeField pTrade) {

    }

    public void onErrRtnOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onErrRtnOrderAction(CThostFtdcOrderActionField pOrderAction, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onRtnInstrumentStatus(CThostFtdcInstrumentStatusField pInstrumentStatus) {

    }

    public void onRtnTradingNotice(CThostFtdcTradingNoticeInfoField pTradingNoticeInfo) {

    }

    public void onRtnErrorConditionalOrder(CThostFtdcErrorConditionalOrderField pErrorConditionalOrder) {

    }

    public void onRspQryContractBank(CThostFtdcContractBankField pContractBank, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryParkedOrder(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspQryTradingNotice(CThostFtdcTradingNoticeField pTradingNotice, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQryBrokerTradingParams(CThostFtdcBrokerTradingParamsField pBrokerTradingParams, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRspQryBrokerTradingAlgos(CThostFtdcBrokerTradingAlgosField pBrokerTradingAlgos, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRtnFromBankToFutureByBank(CThostFtdcRspTransferField pRspTransfer) {

    }

    public void onRtnFromFutureToBankByBank(CThostFtdcRspTransferField pRspTransfer) {

    }

    public void onRtnRepealFromBankToFutureByBank(CThostFtdcRspRepealField pRspRepeal) {

    }

    public void onRtnRepealFromFutureToBankByBank(CThostFtdcRspRepealField pRspRepeal) {

    }

    public void onRtnFromBankToFutureByFuture(CThostFtdcRspTransferField pRspTransfer) {

    }

    public void onRtnFromFutureToBankByFuture(CThostFtdcRspTransferField pRspTransfer) {

    }

    public void onRtnRepealFromBankToFutureByFutureManual(CThostFtdcRspRepealField pRspRepeal) {

    }

    public void onRtnRepealFromFutureToBankByFutureManual(CThostFtdcRspRepealField pRspRepeal) {

    }

    public void onRtnQueryBankBalanceByFuture(CThostFtdcNotifyQueryAccountField pNotifyQueryAccount) {

    }

    public void onErrRtnBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onErrRtnFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onErrRtnRepealBankToFutureByFutureManual(CThostFtdcReqRepealField pReqRepeal, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onErrRtnRepealFutureToBankByFutureManual(CThostFtdcReqRepealField pReqRepeal, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onErrRtnQueryBankBalanceByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, CThostFtdcRspInfoField pRspInfo) {

    }

    public void onRtnRepealFromBankToFutureByFuture(CThostFtdcRspRepealField pRspRepeal) {

    }

    public void onRtnRepealFromFutureToBankByFuture(CThostFtdcRspRepealField pRspRepeal) {

    }

    public void onRspFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

    }

    public void onRspQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean isLast) {

    }

    public void onRtnOpenAccountByBank(CThostFtdcOpenAccountField pOpenAccount) {

    }

    public void onRtnCancelAccountByBank(CThostFtdcCancelAccountField pCancelAccount) {

    }

    public void onRtnChangeAccountByBank(CThostFtdcChangeAccountField pChangeAccount) {

    }

}
