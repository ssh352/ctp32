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
 * 作者：wengqf
 * 项目：sims2016derive-quotationtranscode-ctp32
 * 类说明：封装类
 * 日期：2016年1月21日
 * 备注：
 * </pre>
 */
public class JCTPMdSpi {
    private BizLogger logger = BizLoggerFactory.getLogger(JCTPMdSpi.class);
    private static final BigDecimal ZERO = BigDecimal.ZERO;
    private static final Long QTY = 0L;//常量
    private String[] instrumentIDs;//存放合约的数组
    private JCTPMdApi mdApi = null;
    private int sucessIDCount = 0;//成功订阅的合约计数
    private int requestID = 0;
    private String exchCode = "";
    private JConfigRole configRole = null;
    private QuotationSourceRingBufferDescription quotationSourRingBufDesc = null;//环描述
    private QuotationTranscodeDescription quotationTranscodeDesc = null;//转码描述
    private boolean flag = false;//监控标识

    public JCTPMdSpi() {
    }

    /**
     * 启动行情订阅流程
     * （1）启动合约查询
     * （2）启动行情订阅
     */
    public boolean startMDSpi(JConfigRole configRole, QuotationSourceRingBufferDescription quotationSrcDesc,
            QuotationTranscodeDescription quotationTranscodeDesc) {
        logger.error("行情服务(startMDSpi):启动......");

        if (null == configRole || null == quotationSrcDesc || null == quotationTranscodeDesc) {
            logger.error("行情服务(startMDSpi):启动失败，关键句柄为空......");
            return false;
        }

        this.configRole = configRole;
        this.quotationSourRingBufDesc = quotationSrcDesc;
        this.quotationTranscodeDesc = quotationTranscodeDesc;

        JCTPTraderSpi traderSpi = new JCTPTraderSpi();
        traderSpi.getInstrumentID(configRole, false);

        //创建 API实例
        //向 API实例注册 SPI实例
        //注册交易前置地址
        //初始化
        if (null == mdApi) {
            mdApi = JCTPMdApi.createFtdcMdApi();
            if (null == mdApi) {
                logger.error("行情服务(startMDSpi):createFtdcMdApi失败!");
                return false;
            }
        }
        mdApi.registerSpi(this);
        mdApi.registerFront("tcp://" + configRole.getMarketAddr());
        mdApi.init();
        logger.error("行情服务(startMDSpi):启动成功.");

        //启动后台线程查询合约暂未实现
        return true;
    }

    /**
     * 关闭行情订阅
     */
    public void stopMDSpi() {
        if (null != mdApi) {
            mdApi.release();
            mdApi = null;
        }
    }

    /**
     * 客户端与行情前置机建立连接，调用行情登录进行身份验证
     */
    public void onFrontConnected() {
        logger.info("行情服务(onFrontConnected):连接行情前置机成功!");

        //行情登录
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID(configRole.getBrokerID());
        userLoginField.setUserID(configRole.getUserID());
        userLoginField.setPassword(configRole.getPassword());
        //该函数将会返回一个整数值，标志该请求是否被成功发送出去，而不代表该请求是否会被服务端处理。
        if (requestID >= JCTPUtil.MAX_INT_VALUE) {
            requestID = 0;
        }
        String userInfo = "BorkerID:" + configRole.getBrokerID() + ",UserID:" + configRole.getUserID();
        if (mdApi.reqUserLogin(userLoginField, requestID++) != 0) {
            logger.info("行情服务(onFrontConnected):发送登录请求失败:" + userInfo);
        } else {
            logger.info("行情服务(onFrontConnected):发送登录请求成功:" + userInfo);
        }
    }

    /**
     * 如果客户端到行情前置的无身份验证连接建立失败， 这个函数被调用。其中的参数说明连接失败的原因。
     * @param nReason
     */
    public void onFrontDisconnected(int nReason) {
        logger.info("行情服务(onFrontDisconnected):当客户端与交易后台通信连接断开时," + JCTPUtil.getReasonTraderMsg(nReason));
    }

    /**
     * 如果超过一定时间在客户端和系统之间没有任何消息交换发生， 这个函数会发送心跳用来说明客户端到系统服务器之
     * 间的连接是活跃的。
     * @param nTimeLapse
     */
    public void onHeartBeatWarning(int nTimeLapse) {
        logger.warn("行情服务(onHeartBeatWarning):心跳超时" + nTimeLapse + "秒,警告!");
    }

    /**
     * 交易系统对客户端的请求登录消息作出的响应。 登录请求响应
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspUserLogin(CThostFtdcRspUserLoginField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        //记录日志返回值
        if (null != pRspInfo) {
            logger.error("行情服务(OnRspUserLogin):交易服务器登录成功.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        } else {
            logger.info("行情服务(OnRspUserLogin):交易服务器登录失败");
        }

        //记录应答日志
        if (null != pOutInfo) {
            logger.info("行情服务(onRspUserLogin):" + pOutInfo.toString());
        }

        //根据查询到的合约进行订阅
        if (isLast) {
            instrumentIDs = new String[JCTPContants.instrumentSet.size()];
            int index = 0;
            for (String instrumentID : JCTPContants.instrumentSet) {
                instrumentIDs[index++] = instrumentID;
            }
            int subResult = mdApi.subscribeMarketData(instrumentIDs);
            if (JCTPContants.instrumentSet.size() != 0 && subResult != 0) {
                logger.info("行情服务(onRspUserLogin):共订阅" + index + "个行情,发送行情订阅请求失败.");
            } else {
                logger.info("行情服务(onRspUserLogin):共订阅" + index + "个行情,发送行情订阅请求成功.");
            }
        }
    }

    /**
     * 退出登录
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspUserLogout(CThostFtdcUserLogoutField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        //记录日志返回值
        if (null == pRspInfo) {
            logger.info("行情服务(onRspUserLogout):行情服务器登出成功");
        } else {
            logger.error("行情服务(onRspUserLogout):行情服务器登出失败.ErrCode=" + pRspInfo.getErrorID() + "|ErrorMsg=" + pRspInfo.getErrorMsg());
        }

        //记录应答日志
        if (null != pOutInfo) {
            logger.info("行情服务(onRspUserLogout):" + pOutInfo.toString());
        }
    }

    /**
     * 如果交易系统无法识别客户端发送的请求消息， 就通过这个函数返回错误信息。
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        if (null != pRspInfo) {
            logger.error("行情服务(onRspError):错误通知.ErrCode=" + pRspInfo.getErrorID() + "|ErrMsg=" + pRspInfo.getErrorMsg());
        }
    }

    /**
     * 如果客户端订阅行情的请求是不合法的，该函数返回服务器端给出的错误信息（pRspInfo）。即使客户端发
     * 送的订阅请求是合法的，该函数也会被调用，而返回的信息则是“CTP：No Error”。
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param isLast
     */
    public void onRspSubMarketData(CThostFtdcSpecificInstrumentField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {
        //记录日志返回值
        if (null == pRspInfo) {
            logger.info("行情服务(onRspSubMarketData):行情订阅错误.");
        }

        if (null != pOutInfo) {
            sucessIDCount++;
            JCTPContants.instrumentRspSet.add(pOutInfo.getInstrumentID());
            logger.info("行情服务(onRspSubMarketData):订阅成功,第" + sucessIDCount + "条,合约代码：" + pOutInfo.getInstrumentID());
        }

        //(1)每次响应111条,响应不足111条代表结束
        //(2)查询合约数和响应合约数相同表示全部订阅成功，不同表示有部分订阅失败，并记录订阅失败合约供分析
        //(3)查询合约数永远大于等于响应合约数,所以在响应合约set集马插入成功的合约表示订阅失败（set集不允许相同元素）
        //(4)计数清零,下次从头计数 
        if (isLast) {
            logger.info("行情服务(onRspSubMarketData):本次合约订阅共成功" + sucessIDCount + "条");
            if (sucessIDCount != JCTPUtil.RESPONNUM) {
                if (JCTPContants.instrumentRspSet.size() != JCTPContants.instrumentSet.size()) {//(2)
                    for (String instrumentIDstr : JCTPContants.instrumentSet) {//(3)
                        if (JCTPContants.instrumentRspSet.add(instrumentIDstr)) {
                            logger.error("行情服务(onRspSubMarketData):合约订阅失败:" + instrumentIDstr);
                        }
                    } //end for
                } else {
                    logger.error("行情服务(onRspSubMarketData):总订阅合约成功:" + JCTPContants.instrumentSet.size() + "条");
                }
                JCTPContants.instrumentRspSet.clear();
            } //end (sucessIDCount != JCTPUtil.RESPONNUM)
            sucessIDCount = 0;//(4)       
        } //end if (isLast)

    }

    /**
     * 取消订阅行情应答
     * @param pOutInfo
     * @param pRspInfo
     * @param nRequestID
     * @param bIsLast
     */
    public void onRspUnSubMarketData(CThostFtdcSpecificInstrumentField pOutInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean isLast) {

        //记录日志
        if (null != pRspInfo) {
            logger.info("行情服务(onRspUnSubMarketData):退订合约失败ErrorCode=" + pRspInfo.getErrorID() + "|ErrorMsg" + pRspInfo.getErrorMsg());
        }
        if (null != pOutInfo) {
            logger.info("行情服务(onRspUnSubMarketData):退订合约成功!合约代码： " + pOutInfo.getInstrumentID());
        }

    }
    
    /**
     * 行情订阅请求是合法的，服务端直接返回某合约的市场行情。频率是 每秒两次
     * @param pOutInfo
     */
    public void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pOutInfo) {
        flag = true;
        //入参合法性验证
        if (null == pOutInfo) {
            logger.error("行情服务(onRtnDepthMarketData):接收行情有误,传入参数行情地址为空.");
            return;
        }
        DepthQuotationRole role = new DepthQuotationRole();
        role.setQuotationDate(DateUtils.YYYY_MM_DD(new Date()));
        role.setSecurityStatusCode("000000");
        role.setQuotationTime(DateUtils.HHMMSS_SSS(new Date()));
        exchCode = JCTPContants.exchangeMap.get(pOutInfo.getInstrumentID());//交易所代码
        if (StringUtils.isBlank(exchCode)) {
            logger.error("行情服务(onRtnDepthMarketData):交易所代码为空:" + pOutInfo.toString());
            return;
        }
        role.setExchangeCode(exchCode);//交易所代码
        role.setSecurityCode(pOutInfo.getInstrumentID());//合约代码
        role.setPrevClosePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getPreClosePrice()));//昨日收盘价
        role.setPrevSettlePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getPreSettlementPrice()));//昨日结算价
        role.setPrevDeltaValue(JCTPUtil.convertToBigDeicmal(pOutInfo.getPreDelta()));//昨虚实度
        role.setDeltaValue(JCTPUtil.convertToBigDeicmal(pOutInfo.getCurrDelta()));//今虚实度
        role.setClosePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getClosePrice()));//今收盘
        role.setPrevTotalLongPosiQty(JCTPUtil.convertToLong(pOutInfo.getPreOpenInterest()));//昨持仓量
        role.setSettlePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getSettlementPrice()));//本次结算价
        role.setTotalLongPosiQty(JCTPUtil.convertToLong(pOutInfo.getOpenInterest()));//持仓量
        role.setOpenPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getOpenPrice()));//开盘价
        role.setUpperLimitPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getUpperLimitPrice()));//涨停价
        role.setLowerLimitPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getLowerLimitPrice()));//跌停价
        role.setHighestPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getHighestPrice()));//最高价
        role.setLowestPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getLowestPrice()));//最低价
        role.setLastestPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getLastPrice()));//最新价
        role.setIopvValue(ZERO);//市盈率
        role.setPrevIOPVValue(ZERO);//昨日市盈率
        role.setTotalTickCount(QTY);//成交笔数
        role.setTotalMatchQty(JCTPUtil.convertToLong(pOutInfo.getVolume()));//数量
        role.setTotalMatchAmt(JCTPUtil.convertToBigDeicmal(pOutInfo.getTurnover()));//成交金额
        role.setCallOnePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice1()));//申买价一
        role.setCallTwoPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice2()));//申买价二
        role.setCallThreePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice3()));//申买价三
        role.setCallFourPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice4()));//申买价四
        role.setCallFivePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getBidPrice5()));//申买价五
        role.setCallSixPrice(ZERO);
        role.setCallSevenPrice(ZERO);
        role.setCallEightPrice(ZERO);
        role.setCallNinePrice(ZERO);
        role.setCallTenPrice(ZERO);
        role.setCallOneQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume1()));//申买量一
        role.setCallTwoQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume2()));//申买量二
        role.setCallThreeQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume3()));//申买量三
        role.setCallFourQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume4()));//申买量四
        role.setCallFiveQty(JCTPUtil.convertToLong(pOutInfo.getBidVolume5()));//申买量五
        role.setCallSixQty(QTY);
        role.setCallSevenQty(QTY);
        role.setCallEightQty(QTY);
        role.setCallNineQty(QTY);
        role.setCallTenQty(QTY);
        role.setPutOnePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice1()));//申卖价一
        role.setPutTwoPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice2()));//申卖价二
        role.setPutThreePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice3()));//申卖三
        role.setPutFourPrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice4()));//申卖价四
        role.setPutFivePrice(JCTPUtil.convertToBigDeicmal(pOutInfo.getAskPrice5()));//申卖价五
        role.setPutSixPrice(ZERO);
        role.setPutSevenPrice(ZERO);
        role.setPutEightPrice(ZERO);
        role.setPutNinePrice(ZERO);
        role.setPutTenPrice(ZERO);
        role.setPutOneQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume1()));//申卖量一  
        role.setPutTwoQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume2()));//申卖量二  
        role.setPutThreeQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume3()));//申卖量三
        role.setPutFourQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume4()));//申卖量四 
        role.setPutFiveQty(JCTPUtil.convertToLong(pOutInfo.getAskVolume5()));//申卖量五 
        role.setPutSixQty(QTY);
        role.setPutSevenQty(QTY);
        role.setPutEightQty(QTY);
        role.setPutNineQty(QTY);
        role.setPutTenQty(QTY);
        if (!quotationTranscodeDesc.putQuotationSrcRingBuffer(role, quotationSourRingBufDesc)) {
            logger.info("行情服务(onRtnDepthMarketData):向行情队列增加失败" + "丢弃行情:" + role.toString());
        }
    }
    
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
