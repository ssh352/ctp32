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
    CThostFtdcMdApi mdApi;//������ϵķ�ʽ

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
     * ��¼�ɹ��󣬲ſ��Խ�������Ķ��ġ�
     * �ͻ���ʹ�ú��� SubscribeMarketData �������鶩�ġ���һ��������һ����������Ҫ���ĵĺ�Լ�����飬 �ڶ��������Ǹ�����ĳ��ȡ�
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
