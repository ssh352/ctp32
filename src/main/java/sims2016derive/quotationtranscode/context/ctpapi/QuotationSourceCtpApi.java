package sims2016derive.quotationtranscode.context.ctpapi;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import jframework.fourcolor.AbstractContext;
import sims2016derive.common.log.ext.BizLogger;
import sims2016derive.common.log.ext.BizLoggerFactory;
import sims2016derive.common.util.DateUtils;
import sims2016derive.quotationtranscode.context.common.QuotaAbstractCommonContext;
import sims2016derive.quotationtranscode.context.md.JCTPMdSpi;
import sims2016derive.quotationtranscode.context.util.JConfigRole;
import sims2016derive.quotationtranscode.description.QuotationSourceRingBufferDescription;
import sims2016derive.quotationtranscode.description.QuotationTranscodeDescription;

/**
 * <pre>
 * ���ߣ�wengqf
 * ��Ŀ��sims2016derive-quotationtranscode-ctp32
 * ��˵����CTP�����鴦��
 * ���ڣ�2016��1��21��
 * ��ע��
 * </pre>
 */
public class QuotationSourceCtpApi extends AbstractContext implements QuotaAbstractCommonContext {
    JCTPMdSpi mdSpi = null;
    private QuotationSourceRingBufferDescription quotationSourRingBufDesc = null;//������
    private QuotationTranscodeDescription quotationTranscodeDesc = null;//ת������
    private BizLogger bizlogger = BizLoggerFactory.getLogger(QuotationSourceCtpApi.class);//ҵ����־

    @Autowired
    private JConfigRole configRole;

    @Override
    protected void doInit() {

        bizlogger.info("CTP����(QuotationSourceCtpApi):������������:" + configRole);

        //��������
        if (!loadDesc()) {
            return;
        }
        if (!initMd()) {
            return;
        }
        bizlogger.info("CTP����(QuotationSourceCtpApi):��ʼ�����");
        //���
        monitorQuotation();

    }

    /**
     * ������
     * @return
     */
    private boolean monitorQuotation() {
        new Thread() {
            public void run() {

                //�жϸ������Ƿ񶼳�ʼ��
                while (!getParent().isInited()) {
                    try {
                        bizlogger.error("������δ��ʼ��,3�����...");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (!isInterrupted()) {

                    //ʱ����
                    if (!timeMonitor()) {
                        //ʱ����������,���ڿ���ʱ����
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    //������
                    if (!mdSpi.isFlag()) {
                        int count = 1;//���ʱ
                        for (int i = 0; i < 30 && (!isInterrupted()); i++) {
                            try {
                                Thread.sleep(1000);
                                if (mdSpi.isFlag()) {
                                    break;
                                } else {
                                    count++;
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if(count == 30){
                            bizlogger.info("30����δ�յ�����");
                        }
                    } else {
                        mdSpi.setFlag(false);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        return true;
    }

    /**
     * ʱ����
     */
    protected boolean timeMonitor() {

        if (emptyJudge(configRole.getMonitorStartOneTime()) || emptyJudge(configRole.getMonitorEndOneTime())) {
            return false;
        } else if (emptyJudge(configRole.getMonitorStartTwoTime()) || emptyJudge(configRole.getMonitorEndTwoTime())) {
            return false;
        } else if (emptyJudge(configRole.getMonitorStartThreeTime()) || emptyJudge(configRole.getMonitorEndThreeTime())) {
            return false;
        } else if (emptyJudge(configRole.getMonitorStartFourTime()) || emptyJudge(configRole.getMonitorEndFourTime())) {
            return false;
        }

        String curTime = DateUtils.HHMMSS(new Date());
        //�ڿ���ʱ����
        if (configRole.getMonitorStartOneTime().compareTo(curTime) <= 0 && configRole.getMonitorEndOneTime().compareTo(curTime) >= 0
                || configRole.getMonitorStartTwoTime().compareTo(curTime) <= 0 && configRole.getMonitorEndTwoTime().compareTo(curTime) >= 0
                || configRole.getMonitorStartThreeTime().compareTo(curTime) <= 0 && configRole.getMonitorEndThreeTime().compareTo(curTime) >= 0
                || configRole.getMonitorStartFourTime().compareTo(curTime) <= 0 && configRole.getMonitorEndFourTime().compareTo(curTime) >= 0) {
            return true;
            //���ڿ���ʱ����
        } else {
            return false;
        }
    }

    /**
     * �ַ����Ƿ�Ϊ���ж�
     * @param datetime
     * @return
     */
    private boolean emptyJudge(String datetime) {
        return StringUtils.isBlank(datetime);
    }

    @Override
    protected void doUnInit() {
        if (null != mdSpi) {
            mdSpi.stopMDSpi();
            mdSpi = null;
        }
        bizlogger.info("CTP����(QuotationSourceCtpApi):�˳����");
    }

    /**
     * �������鶩��
     */
    private boolean initMd() {
        if (null != mdSpi) {
            mdSpi.stopMDSpi();
            mdSpi = null;
        }

        boolean result = false;
        if (null == mdSpi) {
            mdSpi = new JCTPMdSpi();
            if (null != mdSpi) {
                result = mdSpi.startMDSpi(configRole, quotationSourRingBufDesc, quotationTranscodeDesc);
            }
        }
        if (!result) {
            bizlogger.error("CTP����(QuotationSourceCtpApi):�������鶩��ʧ��");
        }
        return result;
    }

    /**
     * ��������
     */
    private boolean loadDesc() {
        quotationTranscodeDesc = (QuotationTranscodeDescription) getDescription("quotationTranscodeDesc");
        if (null == quotationTranscodeDesc) {
            bizlogger.error("CTP����(QuotationSourceCtpApi):��������ת������ʧ��");
            return false;
        } else {
            bizlogger.info("CTP����(QuotationSourceCtpApi):��������ת�������ɹ�");
        }
        quotationSourRingBufDesc = (QuotationSourceRingBufferDescription) getDescription("quotationSrcDesc");
        if (null == quotationSourRingBufDesc) {
            bizlogger.error("CTP����(QuotationSourceCtpApi):��������ת�뻷����ʧ��");
            return false;
        } else {
            bizlogger.info("CTP����(QuotationSourceCtpApi):��������ת�뻷�����ɹ�");
        }

        bizlogger.error("CTP����(QuotationSourceCtpApi):���������������ɹ�");
        return true;
    }

    /**
     * (1) ͨ��CTP����API��ѯ��Լ�����б�
     * (2) ����CTP����API��������
     * (3) ������̨�߳�ÿ��5���Ӳ�ѯһ�κ�Լ�붩�ĺ�Լ�Ƚ��Ƿ����©��
     * 
     */
    //    private boolean startquotationConvert() {
    //
    //        return true;
    //    }

}
