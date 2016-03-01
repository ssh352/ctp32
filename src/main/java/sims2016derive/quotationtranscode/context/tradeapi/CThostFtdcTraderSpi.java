package sims2016derive.quotationtranscode.context.tradeapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import sims2016derive.quotationtranscode.context.struct.CThostFtdcAccountregisterField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcBrokerTradingAlgosField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcBrokerTradingParamsField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcCFMMCTradingAccountKeyField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcCancelAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcChangeAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcContractBankField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcDepthMarketDataField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcEWarrantOffsetField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcErrorConditionalOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcExchangeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInputOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInputOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentCommissionRateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentMarginRateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInstrumentStatusField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorPositionCombineDetailField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorPositionDetailField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcInvestorPositionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcNoticeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcNotifyQueryAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcOpenAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcQueryMaxOrderVolumeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRemoveParkedOrderActionField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRemoveParkedOrderField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqQueryAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqRepealField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcReqTransferField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspAuthenticateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspRepealField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspTransferField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSettlementInfoConfirmField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSettlementInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingAccountField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingAccountPasswordUpdateField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingCodeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingNoticeField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTradingNoticeInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTransferBankField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcTransferSerialField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserPasswordUpdateField;


@Library("thosttraderapi") 
public class CThostFtdcTraderSpi extends CPPObject {
	public CThostFtdcTraderSpi() {
		super();
		BridJ.protectFromGC(this);
	}
	
	@Virtual(0) 
	public void OnFrontConnected() {
	}
	@Virtual(1) 
	public void OnFrontDisconnected(int nReason) {
	}
	@Virtual(2) 
	public void OnHeartBeatWarning(int nTimeLapse) {
	}
	@Virtual(3) 
	public void OnRspAuthenticate(Pointer<CThostFtdcRspAuthenticateField > pRspAuthenticateField, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(4) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(5) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(6) 
	public void OnRspUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField > pUserPasswordUpdate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(7) 
	public void OnRspTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField > pTradingAccountPasswordUpdate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(8) 
	public void OnRspOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(9) 
	public void OnRspParkedOrderInsert(Pointer<CThostFtdcParkedOrderField > pParkedOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(10) 
	public void OnRspParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(11) 
	public void OnRspOrderAction(Pointer<CThostFtdcInputOrderActionField > pInputOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(12) 
	public void OnRspQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField > pQueryMaxOrderVolume, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(13) 
	public void OnRspSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(14) 
	public void OnRspRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField > pRemoveParkedOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(15) 
	public void OnRspRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField > pRemoveParkedOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(16) 
	public void OnRspQryOrder(Pointer<CThostFtdcOrderField > pOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(17) 
	public void OnRspQryTrade(Pointer<CThostFtdcTradeField > pTrade, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(18) 
	public void OnRspQryInvestorPosition(Pointer<CThostFtdcInvestorPositionField > pInvestorPosition, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(19) 
	public void OnRspQryTradingAccount(Pointer<CThostFtdcTradingAccountField > pTradingAccount, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(20) 
	public void OnRspQryInvestor(Pointer<CThostFtdcInvestorField > pInvestor, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(21) 
	public void OnRspQryTradingCode(Pointer<CThostFtdcTradingCodeField > pTradingCode, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(22) 
	public void OnRspQryInstrumentMarginRate(Pointer<CThostFtdcInstrumentMarginRateField > pInstrumentMarginRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(23) 
	public void OnRspQryInstrumentCommissionRate(Pointer<CThostFtdcInstrumentCommissionRateField > pInstrumentCommissionRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(24) 
	public void OnRspQryExchange(Pointer<CThostFtdcExchangeField > pExchange, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(25) 
	public void OnRspQryInstrument(Pointer<CThostFtdcInstrumentField > pInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(26) 
	public void OnRspQryDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(27) 
	public void OnRspQrySettlementInfo(Pointer<CThostFtdcSettlementInfoField > pSettlementInfo, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(28) 
	public void OnRspQryTransferBank(Pointer<CThostFtdcTransferBankField > pTransferBank, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(29) 
	public void OnRspQryInvestorPositionDetail(Pointer<CThostFtdcInvestorPositionDetailField > pInvestorPositionDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(30) 
	public void OnRspQryNotice(Pointer<CThostFtdcNoticeField > pNotice, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(31) 
	public void OnRspQrySettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(32) 
	public void OnRspQryInvestorPositionCombineDetail(Pointer<CThostFtdcInvestorPositionCombineDetailField > pInvestorPositionCombineDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(33) 
	public void OnRspQryCFMMCTradingAccountKey(Pointer<CThostFtdcCFMMCTradingAccountKeyField > pCFMMCTradingAccountKey, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(34) 
	public void OnRspQryEWarrantOffset(Pointer<CThostFtdcEWarrantOffsetField > pEWarrantOffset, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(35) 
	public void OnRspQryTransferSerial(Pointer<CThostFtdcTransferSerialField > pTransferSerial, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(36) 
	public void OnRspQryAccountregister(Pointer<CThostFtdcAccountregisterField > pAccountregister, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(37) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(38) 
	public void OnRtnOrder(Pointer<CThostFtdcOrderField > pOrder) {
	}
	@Virtual(39) 
	public void OnRtnTrade(Pointer<CThostFtdcTradeField > pTrade) {
	}
	@Virtual(40) 
	public void OnErrRtnOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(41) 
	public void OnErrRtnOrderAction(Pointer<CThostFtdcOrderActionField > pOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(42) 
	public void OnRtnInstrumentStatus(Pointer<CThostFtdcInstrumentStatusField > pInstrumentStatus) {
	}
	@Virtual(43) 
	public void OnRtnTradingNotice(Pointer<CThostFtdcTradingNoticeInfoField > pTradingNoticeInfo) {
	}
	@Virtual(44) 
	public void OnRtnErrorConditionalOrder(Pointer<CThostFtdcErrorConditionalOrderField > pErrorConditionalOrder) {
	}
	@Virtual(45) 
	public void OnRspQryContractBank(Pointer<CThostFtdcContractBankField > pContractBank, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(46) 
	public void OnRspQryParkedOrder(Pointer<CThostFtdcParkedOrderField > pParkedOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(47) 
	public void OnRspQryParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(48) 
	public void OnRspQryTradingNotice(Pointer<CThostFtdcTradingNoticeField > pTradingNotice, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(49) 
	public void OnRspQryBrokerTradingParams(Pointer<CThostFtdcBrokerTradingParamsField > pBrokerTradingParams, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(50) 
	public void OnRspQryBrokerTradingAlgos(Pointer<CThostFtdcBrokerTradingAlgosField > pBrokerTradingAlgos, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(51) 
	public void OnRtnFromBankToFutureByBank(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
	}
	@Virtual(52) 
	public void OnRtnFromFutureToBankByBank(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
	}
	@Virtual(53) 
	public void OnRtnRepealFromBankToFutureByBank(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
	}
	@Virtual(54) 
	public void OnRtnRepealFromFutureToBankByBank(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
	}
	@Virtual(55) 
	public void OnRtnFromBankToFutureByFuture(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
	}
	@Virtual(56) 
	public void OnRtnFromFutureToBankByFuture(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
	}
	@Virtual(57) 
	public void OnRtnRepealFromBankToFutureByFutureManual(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
	}
	@Virtual(58) 
	public void OnRtnRepealFromFutureToBankByFutureManual(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
	}
	@Virtual(59) 
	public void OnRtnQueryBankBalanceByFuture(Pointer<CThostFtdcNotifyQueryAccountField > pNotifyQueryAccount) {
	}
	@Virtual(60) 
	public void OnErrRtnBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(61) 
	public void OnErrRtnFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(62) 
	public void OnErrRtnRepealBankToFutureByFutureManual(Pointer<CThostFtdcReqRepealField > pReqRepeal, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(63) 
	public void OnErrRtnRepealFutureToBankByFutureManual(Pointer<CThostFtdcReqRepealField > pReqRepeal, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(64) 
	public void OnErrRtnQueryBankBalanceByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, Pointer<CThostFtdcRspInfoField > pRspInfo) {
	}
	@Virtual(65) 
	public void OnRtnRepealFromBankToFutureByFuture(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
	}
	@Virtual(66) 
	public void OnRtnRepealFromFutureToBankByFuture(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
	}
	@Virtual(67) 
	public void OnRspFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(68) 
	public void OnRspFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(69) 
	public void OnRspQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(70) 
	public void OnRtnOpenAccountByBank(Pointer<CThostFtdcOpenAccountField > pOpenAccount) {
	}
	@Virtual(71) 
	public void OnRtnCancelAccountByBank(Pointer<CThostFtdcCancelAccountField > pCancelAccount) {
	}
	@Virtual(72) 
	public void OnRtnChangeAccountByBank(Pointer<CThostFtdcChangeAccountField > pChangeAccount) {
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
    public CThostFtdcTraderSpi(Pointer pointer) {
		super(pointer);
	}
}
