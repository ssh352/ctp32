package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;


public class CThostFtdcReqUserLoginField extends StructObject {
	public CThostFtdcReqUserLoginField() {
		super();
	}

	/**
	 * \u4ea4\u6613\u65e5
	 */
	/**
	 * \u4ea4\u6613\u65e5
	 */
	@Array({9}) 
	@Field(0) 
	private Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 0);
	}

	@Array({9})
	@Field(0)
	public void setTradingDay(String tradingDay) {
		this.io.getPointerField(this, 0).setCString(tradingDay);
	}

	public String getTradingDay() {
		return TradingDay().getCString();
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
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(2) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({16})
	@Field(2)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 2).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	
	/**
	 * \u5bc6\u7801
	 */
	@Array({41}) 
	@Field(3) 
	private Pointer<Byte> Password() {
		return this.io.getPointerField(this, 3);
	}

	@Array({41})
	@Field(3)
	public void setPassword(String password) {
		this.io.getPointerField(this, 3).setCString(password);
	}

	public String getPassword() {
		return Password().getCString();
	}

	
	/**
	 * \u7528\u6237\u7aef\u4ea7\u54c1\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(4) 
	private Pointer<Byte> UserProductInfo() {
		return this.io.getPointerField(this, 4);
	}

	@Array({11})
	@Field(4)
	public void setUserProductInfo(String userProductInfo) {
		this.io.getPointerField(this, 4).setCString(userProductInfo);
	}

	public String getUserProductInfo() {
		return UserProductInfo().getCString();
	}

	/**
	 * \u63a5\u53e3\u7aef\u4ea7\u54c1\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(5) 
	private Pointer<Byte> InterfaceProductInfo() {
		return this.io.getPointerField(this, 5);
	}

	@Array({11})
	@Field(5)
	public void setInterfaceProductInfo(String interfaceProductInfo) {
		this.io.getPointerField(this, 5).setCString(interfaceProductInfo);
	}

	public String getInterfaceProductInfo() {
		return InterfaceProductInfo().getCString();
	}

	/**
	 * \u534f\u8bae\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(6) 
	private Pointer<Byte> ProtocolInfo() {
		return this.io.getPointerField(this, 6);
	}

	@Array({11})
	@Field(6)
	public void setProtocolInfo(String protocolInfo) {
		this.io.getPointerField(this, 6).setCString(protocolInfo);
	}

	public String getProtocolInfo() {
		return ProtocolInfo().getCString();
	}

	/// Mac\u5730\u5740
	@Array({21}) 
	@Field(7) 
	private Pointer<Byte> MacAddress() {
		return this.io.getPointerField(this, 7);
	}

	@Array({21})
	@Field(7)
	public void setMacAddress(String macAddress) {
		this.io.getPointerField(this, 7).setCString(macAddress);
	}

	public String getMacAddress() {
		return MacAddress().getCString();
	}

	/**
	 * \u52a8\u6001\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(8) 
	private Pointer<Byte> OneTimePassword() {
		return this.io.getPointerField(this, 8);
	}

	@Array({41})
	@Field(8)
	public void setOneTimePassword(String oneTimePassword) {
		this.io.getPointerField(this, 8).setCString(oneTimePassword);
	}

	public String getOneTimePassword() {
		return OneTimePassword().getCString();
	}

	/**
	 * \u7ec8\u7aefIP\u5730\u5740
	 */
	@Array({16}) 
	@Field(9) 
	private Pointer<Byte> ClientIPAddress() {
		return this.io.getPointerField(this, 9);
	}

	@Array({16})
	@Field(9)
	public void setClientIPAddress(String clientIPAddress) {
		this.io.getPointerField(this, 9).setCString(clientIPAddress);
	}

	public String getClientIPAddress() {
		return ClientIPAddress().getCString();
	}

	public CThostFtdcReqUserLoginField(Pointer pointer) {
		super(pointer);
	}

}