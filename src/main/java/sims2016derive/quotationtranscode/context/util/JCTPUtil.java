package sims2016derive.quotationtranscode.context.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <pre>
 * 作者：wengqf
 * 项目：sims2016derive-quotationtranscode-ctp32
 * 类说明：常量数据管理
 * 日期：2016年1月21日
 * 备注：
 * </pre>
 */
public class JCTPUtil {

    //客户端与交易后台通信连接断开原因
    public static final int BYWLAN = -1;//因网络原因发送失败
    public static final int REQNUMMAX = -2;//未处理请求队列总数量超限
    public static final int MISREQMAX = -3;//每秒发送请求数量超限

    public static final int NETREADFAIL = 0x1001;//网络读失败
    public static final int NETWRITEFAIL = 0x1002;//网络写失败
    public static final int HEARTOUT = 0x2001;//接收心跳超时
    public static final int HEARTFAIL = 0x2002;//发送心跳失败
    public static final int ERRORMSG = 0x2003;//收到错误报文

    public static int MAX_INT_VALUE = 2100000000;//请求号值阈

    //CTP交易所定义和铭创交易所定义
    public static final String YES = "YES"; //收否勾选
    public static final String CTPDCE = "DCE"; //CTP大商所
    public static final String MCDCE = "XDCE"; //MC大商所

    public static final String CTPCFFEX = "CFFEX";//CTP中金所
    public static final String MCCFFEX = "CCFX";//MC中金所

    public static final String CTPSHFE = "SHFE";//CTP上期所
    public static final String MCSHFE = "XSGF";//MC上期所

    public static final String CTPCZCE = "CZCE";//CTP郑商所
    public static final String MCCZCE = "XZCE";//MC郑商所

    public static final String CTPXSGE = "INE";//CTP能源所
    public static final String MCXSGE = "XSGE";//MC能源所

    //期权合约产品代号
    public static final char OPTION_2 = '2';
    public static final char OPTION_6 = '6';

    //期货合约产品代号
    public static final char FUTURE_1 = '1';
    public static final char FUTURE_3 = '3';
    public static final char FUTURE_4 = '4';
    public static final char FUTURE_5 = '5';

    //行情存储阀值
    public static final int RESPONNUM = 111;//每次响应111条,响应不足111条代表结束
    private static final float MAXFLOATVALUE = 1e11f;//异常值阀

    /**
     * @param obj
     * @return
     * 参考阈值，不可逾越
     * 将double转换为BigDecimal
     */
    public static BigDecimal convertToBigDeicmal(double obj) {
        double amount = obj > MAXFLOATVALUE ? 0 : obj;
        return new BigDecimal(amount).setScale(1, RoundingMode.HALF_UP);
    }

    /**
     * @param obj
     * @return
     * 参考阈值，不可逾越
     * 讲int，double等类型转换为long
     */
    public static Long convertToLong(Object obj) {
        if (obj == null) {
            return 0l;
        } else {
            return new BigDecimal(obj.toString()).floatValue() > MAXFLOATVALUE ? 0 : new BigDecimal(obj.toString()).longValue();
        }
    }

    /**
     * 与前置机断开原因
     * @param reason
     * @return
     */
    public static String getReasonMsg(int reason) {
        String returnMsg;
        switch (reason) {
        case JCTPUtil.BYWLAN:
            returnMsg = "因网络原因发送失败.";
            break;
        case JCTPUtil.REQNUMMAX:
            returnMsg = "未处理请求队列总数量超限.";
            break;
        case JCTPUtil.MISREQMAX:
            returnMsg = "每秒发送请求数量超限.";
            break;
        default:
            returnMsg = "未知原因代码: " + reason;
            break;
        }
        return returnMsg;
    }

    public static String getReasonTraderMsg(int nReason) {
        String returnMsg;
        switch (nReason) {
        case JCTPUtil.NETREADFAIL:
            returnMsg = "网络读失败.";
            break;
        case JCTPUtil.NETWRITEFAIL:
            returnMsg = "网络写失败.";
            break;
        case JCTPUtil.HEARTOUT:
            returnMsg = "接收心跳超时.";
            break;
        case JCTPUtil.HEARTFAIL:
            returnMsg = "发送心跳失败.";
            break;
        case JCTPUtil.ERRORMSG:
            returnMsg = "收到错误报文.";
            break;
        default:
            returnMsg = "未知原因代码: " + nReason;
            break;
        }
        return returnMsg;
    }

}
