package sims2016derive.quotationtranscode.context.trader;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;

import sims2016derive.quotationtranscode.context.datatype.ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInputOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInputOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryAccountregisterField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryBrokerTradingAlgosField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryBrokerTradingParamsField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryCFMMCTradingAccountKeyField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryContractBankField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryDepthMarketDataField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryEWarrantOffsetField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryExchangeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInstrumentCommissionRateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInstrumentMarginRateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInvestorField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInvestorPositionCombineDetailField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInvestorPositionDetailField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryInvestorPositionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryNoticeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQrySettlementInfoConfirmField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQrySettlementInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryTradeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryTradingAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryTradingCodeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryTradingNoticeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryTransferBankField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQryTransferSerialField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQueryMaxOrderVolumeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRemoveParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRemoveParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqAuthenticateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqQueryAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqTransferField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSettlementInfoConfirmField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingAccountPasswordUpdateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserPasswordUpdateField;
import sims2016derive.quotationtranscode.context.tradeapi.CThostFtdcTraderApi;
import sims2016derive.quotationtranscode.context.tradeapi.CThostFtdcTraderSpi;
import sims2016derive.quotationtranscode.context.util.JCTPLibraryUtil;

public class JCTPTraderApi {
    static {
        JCTPLibraryUtil.initLibrary();
        BridJ.register(CThostFtdcTraderApi.class);
    }

    CThostFtdcTraderApi traderApi;//用了组合的方式

    public JCTPTraderApi(CThostFtdcTraderApi traderApi) {
        this.traderApi = traderApi;
    }

    public static JCTPTraderApi createFtdcTraderApi() {
        return createFtdcTraderApi("");
    }

    public static JCTPTraderApi createFtdcTraderApi(String pszFlowPath) {
        Pointer<CThostFtdcTraderApi> traderApiPtr = CThostFtdcTraderApi.CreateFtdcTraderApi(Pointer.pointerToCString(pszFlowPath), false);
        CThostFtdcTraderApi cThostFtdcTraderApi = traderApiPtr.get();
        return new JCTPTraderApi(cThostFtdcTraderApi);
    }

    public void release() {
        traderApi.Release();
    }

    public void init() {
        traderApi.Init();
    }

    public int join() {
        return traderApi.Join();
    }

    public String getTradingDay() {
        Pointer<Byte> tradingDay = traderApi.GetTradingDay();
        return tradingDay.getCString();
    }

    public void registerFront(String pszFrontAddress) {
        traderApi.RegisterFront(Pointer.pointerToCString(pszFrontAddress));
    }

    public void registerNameServer(String pszNsAddress) {
        traderApi.RegisterNameServer(Pointer.pointerToCString(pszNsAddress));
    }

    public void registerSpi(JCTPTraderSpi pSpi) {
        CThostFtdcTraderSpi spiAdapter = new JCTPTraderSpiAdapter(pSpi);
        traderApi.RegisterSpi(Pointer.pointerTo(spiAdapter));
    }

    public void subscribePrivateTopic(IntValuedEnum<THOST_TE_RESUME_TYPE> nResumeType) {
        traderApi.SubscribePrivateTopic(nResumeType);
    }

    public void subscribePublicTopic(IntValuedEnum<THOST_TE_RESUME_TYPE> nResumeType) {
        traderApi.SubscribePublicTopic(nResumeType);
    }

    public int reqAuthenticate(CThostFtdcReqAuthenticateField pReqAuthenticateField, int nRequestID) {
        return traderApi.ReqAuthenticate(Pointer.pointerTo(pReqAuthenticateField), nRequestID);
    }

    public int reqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
        return traderApi.ReqUserLogin(Pointer.pointerTo(pReqUserLoginField), nRequestID);
    }

    public int reqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
        return traderApi.ReqUserLogout(Pointer.pointerTo(pUserLogout), nRequestID);
    }

    public int reqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, int nRequestID) {
        return traderApi.ReqUserPasswordUpdate(Pointer.pointerTo(pUserPasswordUpdate), nRequestID);
    }

    public int reqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, int nRequestID) {
        return traderApi.ReqTradingAccountPasswordUpdate(Pointer.pointerTo(pTradingAccountPasswordUpdate), nRequestID);
    }

    public int reqOrderInsert(CThostFtdcInputOrderField pInputOrder, int nRequestID) {
        return traderApi.ReqOrderInsert(Pointer.pointerTo(pInputOrder), nRequestID);
    }

    public int reqParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, int nRequestID) {
        return traderApi.ReqParkedOrderInsert(Pointer.pointerTo(pParkedOrder), nRequestID);
    }

    public int reqParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, int nRequestID) {
        return traderApi.ReqParkedOrderAction(Pointer.pointerTo(pParkedOrderAction), nRequestID);
    }

    public int reqOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, int nRequestID) {

        return traderApi.ReqOrderAction(Pointer.pointerTo(pInputOrderAction), nRequestID);
    }

    public int reqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, int nRequestID) {

        return traderApi.ReqQueryMaxOrderVolume(Pointer.pointerTo(pQueryMaxOrderVolume), nRequestID);
    }

    public int reqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, int nRequestID) {

        return traderApi.ReqSettlementInfoConfirm(Pointer.pointerTo(pSettlementInfoConfirm), nRequestID);
    }

    public int reqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, int nRequestID) {

        return traderApi.ReqRemoveParkedOrder(Pointer.pointerTo(pRemoveParkedOrder), nRequestID);
    }

    public int reqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, int nRequestID) {

        return traderApi.ReqRemoveParkedOrderAction(Pointer.pointerTo(pRemoveParkedOrderAction), nRequestID);
    }

    public int reqQryOrder(CThostFtdcQryOrderField pQryOrder, int nRequestID) {

        return traderApi.ReqQryOrder(Pointer.pointerTo(pQryOrder), nRequestID);
    }

    public int reqQryTrade(CThostFtdcQryTradeField pQryTrade, int nRequestID) {

        return traderApi.ReqQryTrade(Pointer.pointerTo(pQryTrade), nRequestID);
    }

    public int reqQryInvestorPosition(CThostFtdcQryInvestorPositionField pQryInvestorPosition, int nRequestID) {

        return traderApi.ReqQryInvestorPosition(Pointer.pointerTo(pQryInvestorPosition), nRequestID);
    }

    public int reqQryTradingAccount(CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {

        return traderApi.ReqQryTradingAccount(Pointer.pointerTo(pQryTradingAccount), nRequestID);
    }

    public int reqQryInvestor(CThostFtdcQryInvestorField pQryInvestor, int nRequestID) {

        return traderApi.ReqQryInvestor(Pointer.pointerTo(pQryInvestor), nRequestID);
    }

    public int reqQryTradingCode(CThostFtdcQryTradingCodeField pQryTradingCode, int nRequestID) {

        return traderApi.ReqQryTradingCode(Pointer.pointerTo(pQryTradingCode), nRequestID);
    }

    public int reqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate, int nRequestID) {

        return traderApi.ReqQryInstrumentMarginRate(Pointer.pointerTo(pQryInstrumentMarginRate), nRequestID);
    }

    public int reqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate, int nRequestID) {

        return traderApi.ReqQryInstrumentCommissionRate(Pointer.pointerTo(pQryInstrumentCommissionRate), nRequestID);
    }

    public int reqQryExchange(CThostFtdcQryExchangeField pQryExchange, int nRequestID) {

        return traderApi.ReqQryExchange(Pointer.pointerTo(pQryExchange), nRequestID);
    }

    public int reqQryInstrument(CThostFtdcQryInstrumentField pQryInstrument, int nRequestID) {

        return traderApi.ReqQryInstrument(Pointer.pointerTo(pQryInstrument), nRequestID);
    }

    public int reqQryDepthMarketData(CThostFtdcQryDepthMarketDataField pQryDepthMarketData, int nRequestID) {

        return traderApi.ReqQryDepthMarketData(Pointer.pointerTo(pQryDepthMarketData), nRequestID);
    }

    public int reqQrySettlementInfo(CThostFtdcQrySettlementInfoField pQrySettlementInfo, int nRequestID) {

        return traderApi.ReqQrySettlementInfo(Pointer.pointerTo(pQrySettlementInfo), nRequestID);
    }

    public int reqQryTransferBank(CThostFtdcQryTransferBankField pQryTransferBank, int nRequestID) {

        return traderApi.ReqQryTransferBank(Pointer.pointerTo(pQryTransferBank), nRequestID);
    }

    public int reqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail, int nRequestID) {

        return traderApi.ReqQryInvestorPositionDetail(Pointer.pointerTo(pQryInvestorPositionDetail), nRequestID);
    }

    public int reqQryNotice(CThostFtdcQryNoticeField pQryNotice, int nRequestID) {

        return traderApi.ReqQryNotice(Pointer.pointerTo(pQryNotice), nRequestID);
    }

    public int reqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm, int nRequestID) {

        return traderApi.ReqQrySettlementInfoConfirm(Pointer.pointerTo(pQrySettlementInfoConfirm), nRequestID);
    }

    public int reqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail, int nRequestID) {

        return traderApi.ReqQryInvestorPositionCombineDetail(Pointer.pointerTo(pQryInvestorPositionCombineDetail), nRequestID);
    }

    public int reqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey, int nRequestID) {

        return traderApi.ReqQryCFMMCTradingAccountKey(Pointer.pointerTo(pQryCFMMCTradingAccountKey), nRequestID);
    }

    public int reqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, int nRequestID) {

        return traderApi.ReqQryEWarrantOffset(Pointer.pointerTo(pQryEWarrantOffset), nRequestID);
    }

    public int reqQryTransferSerial(CThostFtdcQryTransferSerialField pQryTransferSerial, int nRequestID) {

        return traderApi.ReqQryTransferSerial(Pointer.pointerTo(pQryTransferSerial), nRequestID);
    }

    public int reqQryAccountregister(CThostFtdcQryAccountregisterField pQryAccountregister, int nRequestID) {

        return traderApi.ReqQryAccountregister(Pointer.pointerTo(pQryAccountregister), nRequestID);
    }

    public int reqQryContractBank(CThostFtdcQryContractBankField pQryContractBank, int nRequestID) {

        return traderApi.ReqQryContractBank(Pointer.pointerTo(pQryContractBank), nRequestID);
    }

    public int reqQryParkedOrder(CThostFtdcQryParkedOrderField pQryParkedOrder, int nRequestID) {

        return traderApi.ReqQryParkedOrder(Pointer.pointerTo(pQryParkedOrder), nRequestID);
    }

    public int reqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField pQryParkedOrderAction, int nRequestID) {

        return traderApi.ReqQryParkedOrderAction(Pointer.pointerTo(pQryParkedOrderAction), nRequestID);
    }

    public int reqQryTradingNotice(CThostFtdcQryTradingNoticeField pQryTradingNotice, int nRequestID) {
        return traderApi.ReqQryTradingNotice(Pointer.pointerTo(pQryTradingNotice), nRequestID);
    }

    public int reqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams, int nRequestID) {
        return traderApi.ReqQryBrokerTradingParams(Pointer.pointerTo(pQryBrokerTradingParams), nRequestID);
    }

    public int reqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos, int nRequestID) {
        return traderApi.ReqQryBrokerTradingAlgos(Pointer.pointerTo(pQryBrokerTradingAlgos), nRequestID);
    }

    public int reqFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
        return traderApi.ReqFromBankToFutureByFuture(Pointer.pointerTo(pReqTransfer), nRequestID);
    }

    public int reqFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
        return traderApi.ReqFromFutureToBankByFuture(Pointer.pointerTo(pReqTransfer), nRequestID);
    }

    public int reqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, int nRequestID) {
        return traderApi.ReqQueryBankAccountMoneyByFuture(Pointer.pointerTo(pReqQueryAccount), nRequestID);
    }
}
