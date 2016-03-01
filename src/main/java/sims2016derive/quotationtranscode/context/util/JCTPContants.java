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
 * ���ߣ�wengqf
 * ��Ŀ��sims2016derive-quotationtranscode-ctp32
 * ��˵�������������Ϣ��������
 * ���ڣ�2016��1��21��
 * ��ע��
 * </pre>
 */
public class JCTPContants {
    
    /**
     * �洢CTP������Ϣ
     */
    private static List<DepthQuotationRole> ctpQuotationList = new ArrayList<DepthQuotationRole>();
    
    /**
     * ͬ����
     * @return
     */
    public synchronized static List<DepthQuotationRole> getCtpquotationlist() {
        return ctpQuotationList;
    }
    /**
     * �Ժ�ԼIDΪ��������������������Ϊֵ���������к�ԼID�����������������ӳ��
     */
    public static final Map<String, String> exchangeMap = new ConcurrentHashMap<String, String>();
    
    /**
     * ������Ӧ��ԼID��Set
     */
    public static final Set<String> instrumentRspSet = new ConcurrentHashSet<String>();
    
    /**
     * ��ѯ��ԼID��
     */
    public static final Set<String> instrumentSet = new ConcurrentHashSet<String>();
    
    /**
     * ��̨��ѯ��ԼID,����������鵽�ıȽ�,true��ʾ��ԼID���ڶ��Ĺ�
     */
    
    public static final Map<String, Boolean> compareInstrumentMap = new ConcurrentHashMap<String, Boolean>();
    /**
     * ��̨��ѯ����������
     */
    public static final Map<String, String> compareExchangeMap = new ConcurrentHashMap<String, String>();
    
}
