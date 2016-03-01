package sims2016derive.quotationtranscode.context.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import jframework.common.utils.ConcurrentHashSet;
import sims2016derive.role.quotation.DepthQuotationRole;

/**
 * <pre>
 * 作者：wengqf
 * 项目：sims2016derive-quotationtranscode-ctp32
 * 类说明：存放行情信息的容器类
 * 日期：2016年1月21日
 * 备注：
 * </pre>
 */
public class JCTPContants {
    
    /**
     * 存储CTP行情信息
     */
    private static List<DepthQuotationRole> ctpQuotationList = new ArrayList<DepthQuotationRole>();
    
    /**
     * 同步锁
     * @return
     */
    public synchronized static List<DepthQuotationRole> getCtpquotationlist() {
        return ctpQuotationList;
    }
    /**
     * 以合约ID为键，以铭创交易所代码为值，保存所有合约ID到铭创交易所代码的映射
     */
    public static final Map<String, String> exchangeMap = new ConcurrentHashMap<String, String>();
    
    /**
     * 订阅响应合约ID的Set
     */
    public static final Set<String> instrumentRspSet = new ConcurrentHashSet<String>();
    
    /**
     * 查询合约ID数
     */
    public static final Set<String> instrumentSet = new ConcurrentHashSet<String>();
    
    /**
     * 后台查询合约ID,用来与最初查到的比较,true表示合约ID用于订阅过
     */
    
    public static final Map<String, Boolean> compareInstrumentMap = new ConcurrentHashMap<String, Boolean>();
    /**
     * 后台查询交易所代码
     */
    public static final Map<String, String> compareExchangeMap = new ConcurrentHashMap<String, String>();
    
}
