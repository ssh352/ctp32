package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcParkedOrderActionField extends StructObject {
	public CThostFtdcParkedOrderActionField() {
		super();
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(0) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 0);
	}

	@Array({11})
	@Field(0)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 0).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(1) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13})
	@Field(1)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 1).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u62a5\u5355\u64cd\u4f5c\u5f15\u7528
	 */
	@Field(2) 
	private int OrderActionRef() {
		return this.io.getIntField(this, 2);
	}

	public int getOrderActionRef() {
		return OrderActionRef();
	}

	/**
	 * \u62a5\u5355\u64cd\u4f5c\u5f15\u7528
	 */
	@Field(2) 
	private CThostFtdcParkedOrderActionField OrderActionRef(int OrderActionRef) {
		this.io.setIntField(this, 2, OrderActionRef);
		return this;
	}

	public void setOrderActionRef(int orderActionRef) {
		OrderActionRef(orderActionRef);
	}

	/**
	 * \u62a5\u5355\u5f15\u7528
	 */
	@Array({13}) 
	@Field(3) 
	private Pointer<Byte> OrderRef() {
		return this.io.getPointerField(this, 3);
	}

	@Array({13})
	@Field(3)
	public void setOrderRef(String orderRef) {
		this.io.getPointerField(this, 3).setCString(orderRef);
	}

	public String getOrderRef() {
		return OrderRef().getCString();
	}

	/**
	 * \u8bf7\u6c42\u7f16\u53f7
	 */
	@Field(4) 
	private int RequestID() {
		return this.io.getIntField(this, 4);
	}

	public int getRequestID() {
		return RequestID();
	}

	/**
	 * \u8bf7\u6c42\u7f16\u53f7
	 */
	@Field(4) 
	private CThostFtdcParkedOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}

	public void setRequestID(int requestID) {
		RequestID(requestID);
	}

	/**
	 * \u524d\u7f6e\u7f16\u53f7
	 */
	@Field(5) 
	private int FrontID() {
		return this.io.getIntField(this, 5);
	}

	public int getFrontID() {
		return FrontID();
	}

	/**
	 * \u524d\u7f6e\u7f16\u53f7
	 */
	@Field(5) 
	private CThostFtdcParkedOrderActionField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}

	public void setFrontID(int frontID) {
		FrontID(frontID);
	}

	/**
	 * \u4f1a\u8bdd\u7f16\u53f7
	 */
	@Field(6) 
	private int SessionID() {
		return this.io.getIntField(this, 6);
	}

	public int getSessionID() {
		return SessionID();
	}

	/**
	 * \u4f1a\u8bdd\u7f16\u53f7
	 */
	@Field(6) 
	private CThostFtdcParkedOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}

	public void setSessionID(int sessionID) {
		SessionID(sessionID);
	}

	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801
	 */
	@Array({9}) 
	@Field(7) 
	private Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 7);
	}

	@Array({9})
	@Field(7)
	public void setExchangeID(String exchangeID) {
		this.io.getPointerField(this, 7).setCString(exchangeID);
	}

	public String getExchangeID() {
		return ExchangeID().getCString();
	}

	/**
	 * \u62a5\u5355\u7f16\u53f7
	 */
	@Array({21}) 
	@Field(8) 
	private Pointer<Byte> OrderSysID() {
		return this.io.getPointerField(this, 8);
	}

	@Array({21})
	@Field(8)
	public void setOrderSysID(String orderSysID) {
		this.io.getPointerField(this, 8).setCString(orderSysID);
	}

	public String getOrderSysID() {
		return OrderSysID().getCString();
	}

	/**
	 * \u64cd\u4f5c\u6807\u5fd7
	 */
	@Field(9) 
	private byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}

	public char getActionFlag() {
		return (char)ActionFlag();
	}

	/**
	 * \u64cd\u4f5c\u6807\u5fd7
	 */
	@Field(9) 
	private CThostFtdcParkedOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}

	public void setActionFlag(char actionFlag) {
		ActionFlag((byte)actionFlag);
	}

	/**
	 * \u4ef7\u683c
	 */
	@Field(10) 
	private double LimitPrice() {
		return this.io.getDoubleField(this, 10);
	}

	public double getLimitPrice() {
		return LimitPrice();
	}

	/**
	 * \u4ef7\u683c
	 */
	@Field(10) 
	private CThostFtdcParkedOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 10, LimitPrice);
		return this;
	}

	public void setLimitPrice(double limitPrice) {
		LimitPrice(limitPrice);
	}

	/**
	 * \u6570\u91cf\u53d8\u5316
	 */
	@Field(11) 
	private int VolumeChange() {
		return this.io.getIntField(this, 11);
	}

	public int getVolumeChange() {
		return VolumeChange();
	}

	/**
	 * \u6570\u91cf\u53d8\u5316
	 */
	@Field(11) 
	private CThostFtdcParkedOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 11, VolumeChange);
		return this;
	}

	public void setVolumeChange(int volumeChange) {
		VolumeChange(volumeChange);
	}

	/**
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(12) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 12);
	}

	@Array({16})
	@Field(12)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 12).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	/**
	 * \u5408\u7ea6\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(13) 
	private Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 13);
	}

	@Array({31})
	@Field(13)
	public void setInstrumentID(String instrumentID) {
		this.io.getPointerField(this, 13).setCString(instrumentID);
	}

	public String getInstrumentID() {
		return InstrumentID().getCString();
	}

	/**
	 * \u9884\u57cb\u64a4\u5355\u5355\u7f16\u53f7
	 */
	@Array({13}) 
	@Field(14) 
	private Pointer<Byte> ParkedOrderActionID() {
		return this.io.getPointerField(this, 14);
	}

	@Array({13})
	@Field(14)
	public void setParkedOrderActionID(String parkedOrderActionID) {
		this.io.getPointerField(this, 14).setCString(parkedOrderActionID);
	}

	public String getParkedOrderActionID() {
		return ParkedOrderActionID().getCString();
	}

	/**
	 * \u7528\u6237\u7c7b\u578b
	 */
	@Field(15) 
	private byte UserType() {
		return this.io.getByteField(this, 15);
	}

	public char getUserType() {
		return (char)UserType();
	}

	/**
	 * \u7528\u6237\u7c7b\u578b
	 */
	@Field(15) 
	private CThostFtdcParkedOrderActionField UserType(byte UserType) {
		this.io.setByteField(this, 15, UserType);
		return this;
	}

	public void setUserType(char userType) {
		UserType((byte)userType);
	}

	/**
	 * \u9884\u57cb\u64a4\u5355\u72b6\u6001
	 */
	@Field(16) 
	private byte Status() {
		return this.io.getByteField(this, 16);
	}

	public char getStatus() {
		return (char)Status();
	}

	/**
	 * \u9884\u57cb\u64a4\u5355\u72b6\u6001
	 */
	@Field(16) 
	private CThostFtdcParkedOrderActionField Status(byte Status) {
		this.io.setByteField(this, 16, Status);
		return this;
	}

	public void setStatus(char status) {
		Status((byte)status);
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(17) 
	private int ErrorID() {
		return this.io.getIntField(this, 17);
	}

	public int getErrorID() {
		return ErrorID();
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(17) 
	private CThostFtdcParkedOrderActionField ErrorID(int ErrorID) {
		this.io.setIntField(this, 17, ErrorID);
		return this;
	}

	public void setErrorID(int errorID) {
		ErrorID(errorID);
	}

	/**
	 * \u9519\u8bef\u4fe1\u606f
	 */
	@Array({81}) 
	@Field(18) 
	private Pointer<Byte> ErrorMsg() {
		return this.io.getPointerField(this, 18);
	}

	@Array({81})
	@Field(18)
	public void setErrorMsg(String errorMsg) {
		this.io.getPointerField(this, 18).setCString(errorMsg);
	}

	public String getErrorMsg() {
		return ErrorMsg().getCString();
	}

	public CThostFtdcParkedOrderActionField(Pointer pointer) {
		super(pointer);
	}

}
