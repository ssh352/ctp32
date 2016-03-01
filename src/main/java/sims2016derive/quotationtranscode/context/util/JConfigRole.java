package sims2016derive.quotationtranscode.context.util;

/**
 * 可选参数配置
 * @author wengqf
 * TODO 
 */
public class JConfigRole {
    //base config
    private String marketAddr = "";
    private String tradeAddr = "";
    private String userID = "";
    private String password = "";
    private String brokerID = "";

    //subscribe config
    //期货futures|期货期权options|组合combination|即期spot|期转现efp|现货期权spotoption|

    //中金所cffex
    private String cffex = "YES";
    private String cffexFutures = "YES";
    private String cffexOptions = "NO";
    private String cffexCombination = "NO";
    private String cffexSpot = "NO";
    private String cffexEfp = "NO";
    private String cffexSpotoption = "NO";

    //上期所shfe
    private String shfe = "NO";
    private String shfeFutures = "NO";
    private String shfeOptions = "NO";
    private String shfeCombination = "NO";
    private String shfeSpot = "NO";
    private String shfeEfp = "NO";
    private String shfeSpotoption = "NO";

    //大商所dce
    private String dce = "NO";
    private String dceFutures = "NO";
    private String dceOptions = "NO";
    private String dceCombination = "NO";
    private String dceSpot = "NO";
    private String dceEfp = "NO";
    private String dceSpotoption = "NO";

    //郑商所czce
    private String czce = "NO";
    private String czceFutures = "NO";
    private String czceOptions = "NO";
    private String czceCombination = "NO";
    private String czceSpot = "NO";
    private String czceEfp = "NO";
    private String czceSpotoption = "NO";

    //能源所ine
    private String ine = "NO";
    private String ineFutures = "NO";
    private String ineOptions = "NO";
    private String ineCombination = "NO";
    private String ineSpot = "NO";
    private String ineEfp = "NO";
    private String ineSpotoption = "NO";

    //detail log config
    private String log = "NO";
    private String beginTime = "15:00:00";
    private String endTime = "15:30:00";

    //监控时间
    private String monitorStartOneTime = "9:30:00";
    private String monitorEndOneTime = "11:30:00";
    private String monitorStartTwoTime = "13:00:00";
    private String monitorEndTwoTime = "15:00:00";
    private String monitorStartThreeTime = "";//不判断
    private String monitorEndThreeTime = "";
    private String monitorStartFourTime = "";
    private String monitorEndFourTime = "";

    public JConfigRole() {
        super();
    }

    public String getMarketAddr() {
        return marketAddr;
    }

    public void setMarketAddr(String marketAddr) {
        this.marketAddr = marketAddr;
    }

    public String getTradeAddr() {
        return tradeAddr;
    }

    public void setTradeAddr(String tradeAddr) {
        this.tradeAddr = tradeAddr;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBrokerID() {
        return brokerID;
    }

    public void setBrokerID(String brokerID) {
        this.brokerID = brokerID;
    }

    public String getCffex() {
        return cffex;
    }

    public void setCffex(String cffex) {
        this.cffex = cffex;
    }

    public String getCffexFutures() {
        return cffexFutures;
    }

    public void setCffexFutures(String cffexFutures) {
        this.cffexFutures = cffexFutures;
    }

    public String getCffexOptions() {
        return cffexOptions;
    }

    public void setCffexOptions(String cffexOptions) {
        this.cffexOptions = cffexOptions;
    }

    public String getCffexCombination() {
        return cffexCombination;
    }

    public void setCffexCombination(String cffexCombination) {
        this.cffexCombination = cffexCombination;
    }

    public String getCffexSpot() {
        return cffexSpot;
    }

    public void setCffexSpot(String cffexSpot) {
        this.cffexSpot = cffexSpot;
    }

    public String getCffexEfp() {
        return cffexEfp;
    }

    public void setCffexEfp(String cffexEfp) {
        this.cffexEfp = cffexEfp;
    }

    public String getCffexSpotoption() {
        return cffexSpotoption;
    }

    public void setCffexSpotoption(String cffexSpotoption) {
        this.cffexSpotoption = cffexSpotoption;
    }

    public String getShfe() {
        return shfe;
    }

    public void setShfe(String shfe) {
        this.shfe = shfe;
    }

    public String getShfeFutures() {
        return shfeFutures;
    }

    public void setShfeFutures(String shfeFutures) {
        this.shfeFutures = shfeFutures;
    }

    public String getShfeOptions() {
        return shfeOptions;
    }

    public void setShfeOptions(String shfeOptions) {
        this.shfeOptions = shfeOptions;
    }

    public String getShfeCombination() {
        return shfeCombination;
    }

    public void setShfeCombination(String shfeCombination) {
        this.shfeCombination = shfeCombination;
    }

    public String getShfeSpot() {
        return shfeSpot;
    }

    public void setShfeSpot(String shfeSpot) {
        this.shfeSpot = shfeSpot;
    }

    public String getShfeEfp() {
        return shfeEfp;
    }

    public void setShfeEfp(String shfeEfp) {
        this.shfeEfp = shfeEfp;
    }

    public String getShfeSpotoption() {
        return shfeSpotoption;
    }

    public void setShfeSpotoption(String shfeSpotoption) {
        this.shfeSpotoption = shfeSpotoption;
    }

    public String getDce() {
        return dce;
    }

    public void setDce(String dce) {
        this.dce = dce;
    }

    public String getDceFutures() {
        return dceFutures;
    }

    public void setDceFutures(String dceFutures) {
        this.dceFutures = dceFutures;
    }

    public String getDceOptions() {
        return dceOptions;
    }

    public void setDceOptions(String dceOptions) {
        this.dceOptions = dceOptions;
    }

    public String getDceCombination() {
        return dceCombination;
    }

    public void setDceCombination(String dceCombination) {
        this.dceCombination = dceCombination;
    }

    public String getDceSpot() {
        return dceSpot;
    }

    public void setDceSpot(String dceSpot) {
        this.dceSpot = dceSpot;
    }

    public String getDceEfp() {
        return dceEfp;
    }

    public void setDceEfp(String dceEfp) {
        this.dceEfp = dceEfp;
    }

    public String getDceSpotoption() {
        return dceSpotoption;
    }

    public void setDceSpotoption(String dceSpotoption) {
        this.dceSpotoption = dceSpotoption;
    }

    public String getCzce() {
        return czce;
    }

    public void setCzce(String czce) {
        this.czce = czce;
    }

    public String getCzceFutures() {
        return czceFutures;
    }

    public void setCzceFutures(String czceFutures) {
        this.czceFutures = czceFutures;
    }

    public String getCzceOptions() {
        return czceOptions;
    }

    public void setCzceOptions(String czceOptions) {
        this.czceOptions = czceOptions;
    }

    public String getCzceCombination() {
        return czceCombination;
    }

    public void setCzceCombination(String czceCombination) {
        this.czceCombination = czceCombination;
    }

    public String getCzceSpot() {
        return czceSpot;
    }

    public void setCzceSpot(String czceSpot) {
        this.czceSpot = czceSpot;
    }

    public String getCzceEfp() {
        return czceEfp;
    }

    public void setCzceEfp(String czceEfp) {
        this.czceEfp = czceEfp;
    }

    public String getCzceSpotoption() {
        return czceSpotoption;
    }

    public void setCzceSpotoption(String czceSpotoption) {
        this.czceSpotoption = czceSpotoption;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public String getIneFutures() {
        return ineFutures;
    }

    public void setIneFutures(String ineFutures) {
        this.ineFutures = ineFutures;
    }

    public String getIneOptions() {
        return ineOptions;
    }

    public void setIneOptions(String ineOptions) {
        this.ineOptions = ineOptions;
    }

    public String getIneCombination() {
        return ineCombination;
    }

    public void setIneCombination(String ineCombination) {
        this.ineCombination = ineCombination;
    }

    public String getIneSpot() {
        return ineSpot;
    }

    public void setIneSpot(String ineSpot) {
        this.ineSpot = ineSpot;
    }

    public String getIneEfp() {
        return ineEfp;
    }

    public void setIneEfp(String ineEfp) {
        this.ineEfp = ineEfp;
    }

    public String getIneSpotoption() {
        return ineSpotoption;
    }

    public void setIneSpotoption(String ineSpotoption) {
        this.ineSpotoption = ineSpotoption;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMonitorStartOneTime() {
        return monitorStartOneTime;
    }

    public void setMonitorStartOneTime(String monitorStartOneTime) {
        this.monitorStartOneTime = monitorStartOneTime;
    }

    public String getMonitorEndOneTime() {
        return monitorEndOneTime;
    }

    public void setMonitorEndOneTime(String monitorEndOneTime) {
        this.monitorEndOneTime = monitorEndOneTime;
    }

    public String getMonitorStartTwoTime() {
        return monitorStartTwoTime;
    }

    public void setMonitorStartTwoTime(String monitorStartTwoTime) {
        this.monitorStartTwoTime = monitorStartTwoTime;
    }

    public String getMonitorEndTwoTime() {
        return monitorEndTwoTime;
    }

    public void setMonitorEndTwoTime(String monitorEndTwoTime) {
        this.monitorEndTwoTime = monitorEndTwoTime;
    }

    public String getMonitorStartThreeTime() {
        return monitorStartThreeTime;
    }

    public void setMonitorStartThreeTime(String monitorStartThreeTime) {
        this.monitorStartThreeTime = monitorStartThreeTime;
    }

    public String getMonitorEndThreeTime() {
        return monitorEndThreeTime;
    }

    public void setMonitorEndThreeTime(String monitorEndThreeTime) {
        this.monitorEndThreeTime = monitorEndThreeTime;
    }

    public String getMonitorStartFourTime() {
        return monitorStartFourTime;
    }

    public void setMonitorStartFourTime(String monitorStartFourTime) {
        this.monitorStartFourTime = monitorStartFourTime;
    }

    public String getMonitorEndFourTime() {
        return monitorEndFourTime;
    }

    public void setMonitorEndFourTime(String monitorEndFourTime) {
        this.monitorEndFourTime = monitorEndFourTime;
    }

    @Override
    public String toString() {
        return "JConfigRole [marketAddr=" + marketAddr + ", tradeAddr=" + tradeAddr + ", userID=" + userID + ", password=" + password + ", brokerID=" + brokerID
                + ", cffex=" + cffex + ", cffexFutures=" + cffexFutures + ", cffexOptions=" + cffexOptions + ", cffexCombination=" + cffexCombination
                + ", cffexSpot=" + cffexSpot + ", cffexEfp=" + cffexEfp + ", cffexSpotoption=" + cffexSpotoption + ", shfe=" + shfe + ", shfeFutures="
                + shfeFutures + ", shfeOptions=" + shfeOptions + ", shfeCombination=" + shfeCombination + ", shfeSpot=" + shfeSpot + ", shfeEfp=" + shfeEfp
                + ", shfeSpotoption=" + shfeSpotoption + ", dce=" + dce + ", dceFutures=" + dceFutures + ", dceOptions=" + dceOptions + ", dceCombination="
                + dceCombination + ", dceSpot=" + dceSpot + ", dceEfp=" + dceEfp + ", dceSpotoption=" + dceSpotoption + ", czce=" + czce + ", czceFutures="
                + czceFutures + ", czceOptions=" + czceOptions + ", czceCombination=" + czceCombination + ", czceSpot=" + czceSpot + ", czceEfp=" + czceEfp
                + ", czceSpotoption=" + czceSpotoption + ", ine=" + ine + ", ineFutures=" + ineFutures + ", ineOptions=" + ineOptions + ", ineCombination="
                + ineCombination + ", ineSpot=" + ineSpot + ", ineEfp=" + ineEfp + ", ineSpotoption=" + ineSpotoption + ", log=" + log + ", beginTime="
                + beginTime + ", endTime=" + endTime + ", monitorStartOneTime=" + monitorStartOneTime + ", monitorEndOneTime=" + monitorEndOneTime
                + ", monitorStartTwoTime=" + monitorStartTwoTime + ", monitorEndTwoTime=" + monitorEndTwoTime + ", monitorStartThreeTime="
                + monitorStartThreeTime + ", monitorEndThreeTime=" + monitorEndThreeTime + ", monitorStartFourTime=" + monitorStartFourTime
                + ", monitorEndFourTime=" + monitorEndFourTime + "]";
    }

}
