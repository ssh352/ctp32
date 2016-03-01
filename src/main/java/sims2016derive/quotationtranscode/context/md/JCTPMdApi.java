package sims2016derive.quotationtranscode.context.md;

import org.bridj.BridJ;
import org.bridj.Pointer;

import sims2016derive.quotationtranscode.context.mdapi.CThostFtdcMdApi;
import sims2016derive.quotationtranscode.context.mdapi.CThostFtdcMdSpi;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;
import sims2016derive.quotationtranscode.context.util.JCTPLibraryUtil;

public class JCTPMdApi {
    static {
        JCTPLibraryUtil.initLibrary();
        BridJ.register(CThostFtdcMdApi.class);
    }

    //CTP md API
    CThostFtdcMdApi mdApi;//用了组合的方式

    public JCTPMdApi(CThostFtdcMdApi mdApi) {
        this.mdApi = mdApi;
    }

    public static JCTPMdApi createFtdcMdApi() {
        return createFtdcMdApi("", false);
    }

    public static JCTPMdApi createFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp) {
        Pointer<CThostFtdcMdApi> mdApiPtr = CThostFtdcMdApi.CreateFtdcMdApi(Pointer.pointerToCString(pszFlowPath), false);
        CThostFtdcMdApi cThostFtdcMdApi = mdApiPtr.get();
        return new JCTPMdApi(cThostFtdcMdApi);
    }

    public void release() {
        mdApi.Release();
        JCTPLibraryUtil.release();
    }

    public void init() {
        mdApi.Init();
    }

    public int join() {
        return mdApi.Join();
    }

    public String getTradingDay() {
        Pointer<Byte> tradingDay = mdApi.GetTradingDay();
        return tradingDay.getCString();
    }

    public void registerFront(String pszFrontAddress) {
        mdApi.RegisterFront(Pointer.pointerToCString(pszFrontAddress));
    }

    public void registerNameServer(String pszNsAddress) {
        mdApi.RegisterNameServer(Pointer.pointerToCString(pszNsAddress));
    }

    public void registerSpi(JCTPMdSpi pSpi) {
        CThostFtdcMdSpi mdSpi = new JCTPMdSpiAdapter(pSpi);
        mdApi.RegisterSpi(Pointer.pointerTo(mdSpi));
    }

    /**
     * 登录成功后，才可以进行行情的订阅。
     * 客户端使用函数 SubscribeMarketData 进行行情订阅。第一个参数是一个包含所有要订阅的合约的数组， 第二个参数是该数组的长度。
     * @param ppInstrumentID
     * @return
     */
    public int subscribeMarketData(String... ppInstrumentID) {
        return mdApi.SubscribeMarketData(Pointer.pointerToCStrings(ppInstrumentID), ppInstrumentID.length);
    }

    public int unSubscribeMarketData(String... ppInstrumentID) {
        return mdApi.UnSubscribeMarketData(Pointer.pointerToCStrings(ppInstrumentID), ppInstrumentID.length);
    }

    public int reqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
        return mdApi.ReqUserLogin(Pointer.pointerTo(pReqUserLoginField), nRequestID);
    }

    public int reqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
        return mdApi.ReqUserLogout(Pointer.pointerTo(pUserLogout), nRequestID);
    }
}
