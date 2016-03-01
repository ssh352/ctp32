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
 * 作者：wengqf
 * 项目：sims2016derive-quotationtranscode-ctp32
 * 类说明：CTP的行情处理
 * 日期：2016年1月21日
 * 备注：
 * </pre>
 */
public class QuotationSourceCtpApi extends AbstractContext implements QuotaAbstractCommonContext {
    JCTPMdSpi mdSpi = null;
    private QuotationSourceRingBufferDescription quotationSourRingBufDesc = null;//环描述
    private QuotationTranscodeDescription quotationTranscodeDesc = null;//转码描述
    private BizLogger bizlogger = BizLoggerFactory.getLogger(QuotationSourceCtpApi.class);//业务日志

    @Autowired
    private JConfigRole configRole;

    @Override
    protected void doInit() {

        bizlogger.info("CTP行情(QuotationSourceCtpApi):加载行情配置:" + configRole);

        //加载描述
        if (!loadDesc()) {
            return;
        }
        if (!initMd()) {
            return;
        }
        bizlogger.info("CTP行情(QuotationSourceCtpApi):初始化完成");
        //监控
        monitorQuotation();

    }

    /**
     * 行情监控
     * @return
     */
    private boolean monitorQuotation() {
        new Thread() {
            public void run() {

                //判断父场景是否都初始化
                while (!getParent().isInited()) {
                    try {
                        bizlogger.error("父场景未初始化,3秒后尝试...");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (!isInterrupted()) {

                    //时间监控
                    if (!timeMonitor()) {
                        //时间配置有误,不在开市时间内
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    //行情监控
                    if (!mdSpi.isFlag()) {
                        int count = 1;//秒计时
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
                            bizlogger.info("30秒钟未收到行情");
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
     * 时间监控
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
        //在开市时间内
        if (configRole.getMonitorStartOneTime().compareTo(curTime) <= 0 && configRole.getMonitorEndOneTime().compareTo(curTime) >= 0
                || configRole.getMonitorStartTwoTime().compareTo(curTime) <= 0 && configRole.getMonitorEndTwoTime().compareTo(curTime) >= 0
                || configRole.getMonitorStartThreeTime().compareTo(curTime) <= 0 && configRole.getMonitorEndThreeTime().compareTo(curTime) >= 0
                || configRole.getMonitorStartFourTime().compareTo(curTime) <= 0 && configRole.getMonitorEndFourTime().compareTo(curTime) >= 0) {
            return true;
            //不在开市时间内
        } else {
            return false;
        }
    }

    /**
     * 字符串是否为空判断
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
        bizlogger.info("CTP行情(QuotationSourceCtpApi):退出完成");
    }

    /**
     * 启动行情订阅
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
            bizlogger.error("CTP行情(QuotationSourceCtpApi):加载行情订阅失败");
        }
        return result;
    }

    /**
     * 加载描述
     */
    private boolean loadDesc() {
        quotationTranscodeDesc = (QuotationTranscodeDescription) getDescription("quotationTranscodeDesc");
        if (null == quotationTranscodeDesc) {
            bizlogger.error("CTP行情(QuotationSourceCtpApi):加载行情转码描述失败");
            return false;
        } else {
            bizlogger.info("CTP行情(QuotationSourceCtpApi):加载行情转码描述成功");
        }
        quotationSourRingBufDesc = (QuotationSourceRingBufferDescription) getDescription("quotationSrcDesc");
        if (null == quotationSourRingBufDesc) {
            bizlogger.error("CTP行情(QuotationSourceCtpApi):加载行情转码环描述失败");
            return false;
        } else {
            bizlogger.info("CTP行情(QuotationSourceCtpApi):加载行情转码环描述成功");
        }

        bizlogger.error("CTP行情(QuotationSourceCtpApi):加载行情总描述成功");
        return true;
    }

    /**
     * (1) 通过CTP交易API查询合约存入列表
     * (2) 启动CTP行情API订阅行情
     * (3) 启动后台线程每隔5分钟查询一次合约与订阅合约比较是否存在漏订
     * 
     */
    //    private boolean startquotationConvert() {
    //
    //        return true;
    //    }

}
