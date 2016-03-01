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

public class CThostFtdcSyncingTradingCodeField extends StructObject {
	public CThostFtdcSyncingTradingCodeField() {
		super();
	}

	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(0) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 0);
	}

	@Array({13})
	@Field(0)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 0).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(1) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({11})
	@Field(1)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 1).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801
	 */
	@Array({9}) 
	@Field(2) 
	private Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({9})
	@Field(2)
	public void setExchangeID(String exchangeID) {
		this.io.getPointerField(this, 2).setCString(exchangeID);
	}

	public String getExchangeID() {
		return ExchangeID().getCString();
	}

	/**
	 * \u5ba2\u6237\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(3) 
	private Pointer<Byte> ClientID() {
		return this.io.getPointerField(this, 3);
	}

	@Array({11})
	@Field(3)
	public void setClientID(String clientID) {
		this.io.getPointerField(this, 3).setCString(clientID);
	}

	public String getClientID() {
		return ClientID().getCString();
	}

	/**
	 * \u662f\u5426\u6d3b\u8dc3
	 */
	@Field(4) 
	private int IsActive() {
		return this.io.getIntField(this, 4);
	}

	public int getIsActive() {
		return IsActive();
	}

	/**
	 * \u662f\u5426\u6d3b\u8dc3
	 */
	@Field(4) 
	private CThostFtdcSyncingTradingCodeField IsActive(int IsActive) {
		this.io.setIntField(this, 4, IsActive);
		return this;
	}

	public void setIsActive(int isActive) {
		IsActive(isActive);
	}

	/**
	 * \u4ea4\u6613\u7f16\u7801\u7c7b\u578b
	 */
	@Field(5) 
	private byte ClientIDType() {
		return this.io.getByteField(this, 5);
	}

	public char getClientIDType() {
		return (char)ClientIDType();
	}

	/**
	 * \u4ea4\u6613\u7f16\u7801\u7c7b\u578b
	 */
	@Field(5) 
	private CThostFtdcSyncingTradingCodeField ClientIDType(byte ClientIDType) {
		this.io.setByteField(this, 5, ClientIDType);
		return this;
	}

	public void setClientIDType(char clientIDType) {
		ClientIDType((byte)clientIDType);
	}

	public CThostFtdcSyncingTradingCodeField(Pointer pointer) {
		super(pointer);
	}

}

