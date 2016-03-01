package sims2016derive.quotationtranscode.context.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <pre>
 * ���ߣ�wengqf
 * ��Ŀ��sims2016derive-quotationtranscode-ctp32
 * ��˵�����������ݹ���
 * ���ڣ�2016��1��21��
 * ��ע��
 * </pre>
 */
public class JCTPUtil {

    //�ͻ����뽻�׺�̨ͨ�����ӶϿ�ԭ��
    public static final int BYWLAN = -1;//������ԭ����ʧ��
    public static final int REQNUMMAX = -2;//δ���������������������
    public static final int MISREQMAX = -3;//ÿ�뷢��������������

    public static final int NETREADFAIL = 0x1001;//�����ʧ��
    public static final int NETWRITEFAIL = 0x1002;//����дʧ��
    public static final int HEARTOUT = 0x2001;//����������ʱ
    public static final int HEARTFAIL = 0x2002;//��������ʧ��
    public static final int ERRORMSG = 0x2003;//�յ�������

    public static int MAX_INT_VALUE = 2100000000;//�����ֵ��

    //CTP�������������������������
    public static final String YES = "YES"; //�շ�ѡ
    public static final String CTPDCE = "DCE"; //CTP������
    public static final String MCDCE = "XDCE"; //MC������

    public static final String CTPCFFEX = "CFFEX";//CTP�н���
    public static final String MCCFFEX = "CCFX";//MC�н���

    public static final String CTPSHFE = "SHFE";//CTP������
    public static final String MCSHFE = "XSGF";//MC������

    public static final String CTPCZCE = "CZCE";//CTP֣����
    public static final String MCCZCE = "XZCE";//MC֣����

    public static final String CTPXSGE = "INE";//CTP��Դ��
    public static final String MCXSGE = "XSGE";//MC��Դ��

    //��Ȩ��Լ��Ʒ����
    public static final char OPTION_2 = '2';
    public static final char OPTION_6 = '6';

    //�ڻ���Լ��Ʒ����
    public static final char FUTURE_1 = '1';
    public static final char FUTURE_3 = '3';
    public static final char FUTURE_4 = '4';
    public static final char FUTURE_5 = '5';

    //����洢��ֵ
    public static final int RESPONNUM = 111;//ÿ����Ӧ111��,��Ӧ����111���������
    private static final float MAXFLOATVALUE = 1e11f;//�쳣ֵ��

    /**
     * @param obj
     * @return
     * �ο���ֵ��������Խ
     * ��doubleת��ΪBigDecimal
     */
    public static BigDecimal convertToBigDeicmal(double obj) {
        double amount = obj > MAXFLOATVALUE ? 0 : obj;
        return new BigDecimal(amount).setScale(1, RoundingMode.HALF_UP);
    }

    /**
     * @param obj
     * @return
     * �ο���ֵ��������Խ
     * ��int��double������ת��Ϊlong
     */
    public static Long convertToLong(Object obj) {
        if (obj == null) {
            return 0l;
        } else {
            return new BigDecimal(obj.toString()).floatValue() > MAXFLOATVALUE ? 0 : new BigDecimal(obj.toString()).longValue();
        }
    }

    /**
     * ��ǰ�û��Ͽ�ԭ��
     * @param reason
     * @return
     */
    public static String getReasonMsg(int reason) {
        String returnMsg;
        switch (reason) {
        case JCTPUtil.BYWLAN:
            returnMsg = "������ԭ����ʧ��.";
            break;
        case JCTPUtil.REQNUMMAX:
            returnMsg = "δ���������������������.";
            break;
        case JCTPUtil.MISREQMAX:
            returnMsg = "ÿ�뷢��������������.";
            break;
        default:
            returnMsg = "δ֪ԭ�����: " + reason;
            break;
        }
        return returnMsg;
    }

    public static String getReasonTraderMsg(int nReason) {
        String returnMsg;
        switch (nReason) {
        case JCTPUtil.NETREADFAIL:
            returnMsg = "�����ʧ��.";
            break;
        case JCTPUtil.NETWRITEFAIL:
            returnMsg = "����дʧ��.";
            break;
        case JCTPUtil.HEARTOUT:
            returnMsg = "����������ʱ.";
            break;
        case JCTPUtil.HEARTFAIL:
            returnMsg = "��������ʧ��.";
            break;
        case JCTPUtil.ERRORMSG:
            returnMsg = "�յ�������.";
            break;
        default:
            returnMsg = "δ֪ԭ�����: " + nReason;
            break;
        }
        return returnMsg;
    }

}
