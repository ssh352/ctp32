package sims2016derive.quotationtranscode.context.mdapi;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import sims2016derive.quotationtranscode.context.struct.CThostFtdcDepthMarketDataField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSpecificInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;
@Library("thostmduserapi") 
public class CThostFtdcMdSpi extends CPPObject {
	public CThostFtdcMdSpi() {
		super();
	}
	@Virtual(0)
	public void OnFrontConnected() {
	}
	@Virtual(1) 
	native public void OnFrontDisconnected(int nReason);
	@Virtual(2) 
	native public void OnHeartBeatWarning(int nTimeLapse);
	@Virtual(3) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(4) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(5) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(6) 
	public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(7) 
	public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
	}
	@Virtual(8) 
	public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData) {
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
    public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
}
