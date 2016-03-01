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
 * 作者：wengqf
 * 项目：sims2016derive-quotationtranscode-ctp32
 * 类说明：包装类
 * 日期：2016年1月21日
 * 备注：
 * </pre>
 */
public class JCTPTraderSpi {
    private BizLogger logger = BizLoggerFactory.getLogger(JCTPTraderSpi.class);
    private BlockingQueue<Boolean> blockingQueue = new ArrayBlockingQueue<Boolean>(10);
    private JCTPTraderApi traderApi = null;

    private int requestID = 0;//请求号
    private boolean isBackThread;//是后台线程查询
    private JConfigRole configRole;
    private int instrumentCount = 0;
    private long beginTime = System.currentTimeMillis();

    public JCTPTraderSpi() {
        super();
    }

    /**
     * 查询柜台合约保存到合约列表
     * 
     * @param backQuery ture表示后台查询，每隔5分查询一次；false表示前台查询，前台查询程序启动时查询一次
     * @return
     */
    public boolean getInstrumentID(JConfigRole role, boolean backThread) {
        configRole = role;
        isBackThread = backThread;
        //(1)创建 API实例
        //(2)向 API实例注册 SPI实例
        //(3)注册交易前置地址
        //(4)初始化
        if (null == traderApi) {
            traderApi = JCTPTraderApi.createFtdcTraderApi();
            if (null == traderApi) {
                logger.error("交易服务(createFtdcTraderApi)失败!");
                return false;
            }
        }
        traderApi.registerSpi(this);
        traderApi.registerFront("tcp://" + configRole.getTradeAddr());
        traderApi.init();

        //之后的执行流程:
        //(1)在OnFrontConnected中登陆,
        //(2)在OnRspUserLogin中查询合约ID,
        //(3)在OnRspSubMarketData中返回查询合约ID成功与否,若成功把合约ID存储到二维数组中。
        //(4)最长等待60秒唤醒                 
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
     * 当客户端与交易后台建立起通信连接时（还未登录前）,该方法被调用。
     */
    public void onFrontConnected() {
        logger.info("交易服务(onFrontConnected):连接交易前置机成功!");

        //登录交易服务
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID(configRole.getBrokerID());
        userLoginField.setUserID(configRole.getUserID());
        userLoginField.setPassword(configRole.getPassword());

        if (requestID >= JCTPUtil.MAX_INT_VALUE) {
            requestID = 0;
        }

        String userInfo = "BorkerID:" + configRole.getBrokerID() + ",UserID:" + configRole.getUserID();
        if (traderApi.reqUserLogin(userLoginField, requestID++) != 0) {
            logger.info("交易服务(onFrontConnected):发送登录请求失败:" + userInfo);
        } else {
            logger.info("交易服务(onFrontConnected):发送登录请求成功:" + userInfo);
        }
    }

    /**
     * 当客户端与交易后台通信连接断开时,该方法被调用。当发生这个情况后,API会自动重新连接,客户端可不做处理。
     * 0x1001 网络读失败
     * 0x1002 网络写失败
     * 0x2001 接收心跳超时
     * 0x2002 发送心跳失败
     * 0x2003 收到错误报文
     * @param nReason
     */
    public void onFrontDisconnected(int nReason) {
        logger.info("交易服务(onFrontDisconnected):客户端与交易服务断开连接,原因=" + JCTPUtil.getReasonTraderMsg(nReason));
    }

    /**
     * 登录请求响应
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspUserLogin(CThostFtdcRspUserLoginField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

        //记录日志返回值
        if (null != pRspInfo) {
            logger.error("交易服务(OnRspUserLogin):交易服务器登录成功.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        } else {
            logger.info("交易服务(OnRspUserLogin):交易服务器登录失败");
        }

        //记录应答日志
        if (null != pOutInfo) {
            logger.info("交易服务(OnRspUserLogin):" + pOutInfo.toString());
        }

        //查询交易所合约供行情订阅使用
        if (isLast) {
            CThostFtdcQryInstrumentField stInstrument = new CThostFtdcQryInstrumentField();
            if (requestID >= JCTPUtil.MAX_INT_VALUE) {
                requestID = 0;
            }

            //暂时不过滤，执行全部查询
            stInstrument.setExchangeID("");
//            stInstrument.setInstrumentID("IF1603");
            if (0 != traderApi.reqQryInstrument(stInstrument, requestID++)) {
                logger.info("交易服务(ReqQryInstrument):发送查询合约请求失败");
            } else {
                logger.info("交易服务(ReqQryInstrument):发送查询合约请求成功");
            }
        }
    }

    /**
    * 请求查询合约响应
    * @param pOutInfo
    * @param pRspInfo
    * @param nRequestID
    * @param isLast
    */
    public void onRspQryInstrument(CThostFtdcInstrumentField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

        //记录日志返回值
        if (null != pRspInfo) {
            logger.error("交易服务(onRspQryInstrument):查询合约响应失败.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        }

        instrumentCount++;
        boolean addSuccess = false;

        //将查询到的合约放到map中,并赋值简写交易所代码
        if (null != pOutInfo) {

            if (configRole.getCffex().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPCFFEX)) {//中金所
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCCFFEX);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getCffexFutures(), configRole.getCffexOptions(),
                        configRole.getCffexCombination(), configRole.getCffexSpot(), configRole.getCffexEfp(), configRole.getCffexSpotoption());

            } else if (configRole.getShfe().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPSHFE)) {//上期所 
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCSHFE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getShfeFutures(), configRole.getShfeOptions(),
                        configRole.getShfeCombination(), configRole.getShfeSpot(), configRole.getShfeEfp(), configRole.getShfeSpotoption());

            } else if (configRole.getDce().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPDCE)) { //大商所
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCDCE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getDceFutures(), configRole.getDceOptions(),
                        configRole.getDceCombination(), configRole.getDceSpot(), configRole.getDceEfp(), configRole.getDceSpotoption());

            } else if (configRole.getCzce().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPCZCE)) {//郑商所
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCCZCE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getCzceFutures(), configRole.getCzceOptions(),
                        configRole.getCzceCombination(), configRole.getCzceSpot(), configRole.getCzceEfp(), configRole.getCzceSpotoption());

            } else if (configRole.getIne().equals(JCTPUtil.YES) && pOutInfo.getExchangeID().equals(JCTPUtil.CTPXSGE)) {//能源所
                JCTPContants.exchangeMap.put(pOutInfo.getInstrumentID(), JCTPUtil.MCXSGE);
                addSuccess = addInstrumentID(pOutInfo.getInstrumentID(), pOutInfo.getProductClass(), configRole.getIneFutures(), configRole.getIneOptions(),
                        configRole.getIneCombination(), configRole.getIneSpot(), configRole.getIneEfp(), configRole.getIneSpotoption());
            } else {
                //                logger.error("交易服务(onRspQryInstrument):交易所代码未处理" + pOutInfo.getExchangeID() + "行情信息:" + pOutInfo.toString());
            }
        } else {
            logger.error("交易服务(onRspQryInstrument):查询合约响应" + "第" + instrumentCount + "次输出句柄为空.");
        }

        //记录日志,只要有增加必须写日志
        if (addSuccess && null != pOutInfo) {
            logger.info("交易服务(onRspQryInstrument):第" + JCTPContants.instrumentSet.size() + "条合约查询成功!" + pOutInfo.toString());
        }

        //如果是前台查询记录总数，如果是后台查询记录查询总数和是否有新增
        if (isLast) {
            double diffTime = (System.currentTimeMillis() - beginTime) / 1000.0;
            logger.info("交易服务(onRspQryInstrument):本次共查询" + instrumentCount + "条,订阅列表" + JCTPContants.instrumentSet.size() + "条.耗时" + diffTime);

            //激活信息量
            try {
                blockingQueue.put(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 根据入参判断是否要订阅期权合约
     * 期货futures '1'期货期权options'2'组合combination '3'即期spot'4'期转现efp'5'现货期权spotoption'6'
     * 注意前台查询与后台查询,查到的合约ID及其与对应的交易所ID所存放的位置不同。
     * 前台查询用于启动时订阅行情，后台查询用于运行时校验行情订阅是否漏订
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
     * 永远不会发生，已经对 API 用户屏蔽了该响应
     * @param nTimeLapse
     */
    public void onHeartBeatWarning(int nTimeLapse) {
        logger.warn("交易服务(onHeartBeatWarning):心跳超时" + nTimeLapse + "秒,警告!");
    }

    /**
     * 如果交易系统无法识别客户端发送的请求消息， 就通过这个函数返回错误信息。
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        if (null != pRspInfo) {
            logger.error("交易服务(onRspError):CTP错误通知,ErrCode=" + pRspInfo.getErrorID() + "|ErrMsg=" + pRspInfo.getErrorMsg());
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //                                 以下暂不需要实现                                                                                                  //
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
