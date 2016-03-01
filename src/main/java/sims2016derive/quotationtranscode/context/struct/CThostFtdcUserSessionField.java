package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcUserSessionField extends StructObject {
	public CThostFtdcUserSessionField() {
		super();
	}

	/**
	 * \u524d\u7f6e\u7f16\u53f7
	 */
	@Field(0) 
	private int FrontID() {
		return this.io.getIntField(this, 0);
	}

	public int getFrontID() {
		return FrontID();
	}

	/**
	 * \u524d\u7f6e\u7f16\u53f7
	 */
	@Field(0) 
	private CThostFtdcUserSessionField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}

	public void setFrontID(int frontID) {
		FrontID(frontID);
	}

	/**
	 * \u4f1a\u8bdd\u7f16\u53f7
	 */
	@Field(1) 
	private int SessionID() {
		return this.io.getIntField(this, 1);
	}

	public int getSessionID() {
		return SessionID();
	}

	/**
	 * \u4f1a\u8bdd\u7f16\u53f7
	 */
	@Field(1) 
	private CThostFtdcUserSessionField SessionID(int SessionID) {
		this.io.setIntField(this, 1, SessionID);
		return this;
	}

	public void setSessionID(int sessionID) {
		SessionID(sessionID);
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(2) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({11})
	@Field(2)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 2).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	/**
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(3) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 3);
	}

	@Array({16})
	@Field(3)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 3).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	/**
	 * \u767b\u5f55\u65e5\u671f
	 */
	@Array({9}) 
	@Field(4) 
	private Pointer<Byte> LoginDate() {
		return this.io.getPointerField(this, 4);
	}

	@Array({9})
	@Field(4)
	public void setLoginDate(String loginDate) {
		this.io.getPointerField(this, 4).setCString(loginDate);
	}

	public String getLoginDate() {
		return LoginDate().getCString();
	}

	/**
	 * \u767b\u5f55\u65f6\u95f4
	 */
	@Array({9}) 
	@Field(5) 
	private Pointer<Byte> LoginTime() {
		return this.io.getPointerField(this, 5);
	}

	@Array({9})
	@Field(5)
	public void setLoginTime(String loginTime) {
		this.io.getPointerField(this, 5).setCString(loginTime);
	}

	public String getLoginTime() {
		return LoginTime().getCString();
	}

	/// IP\u5730\u5740
	@Array({16}) 
	@Field(6) 
	private Pointer<Byte> IPAddress() {
		return this.io.getPointerField(this, 6);
	}

	@Array({16})
	@Field(6)
	public void setIPAddress(String iPAddress) {
		this.io.getPointerField(this, 6).setCString(iPAddress);
	}

	public String getIPAddress() {
		return IPAddress().getCString();
	}

	/**
	 * \u7528\u6237\u7aef\u4ea7\u54c1\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(7) 
	private Pointer<Byte> UserProductInfo() {
		return this.io.getPointerField(this, 7);
	}

	@Array({11})
	@Field(7)
	public void setUserProductInfo(String userProductInfo) {
		this.io.getPointerField(this, 7).setCString(userProductInfo);
	}

	public String getUserProductInfo() {
		return UserProductInfo().getCString();
	}

	/**
	 * \u63a5\u53e3\u7aef\u4ea7\u54c1\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(8) 
	private Pointer<Byte> InterfaceProductInfo() {
		return this.io.getPointerField(this, 8);
	}

	@Array({11})
	@Field(8)
	public void setInterfaceProductInfo(String interfaceProductInfo) {
		this.io.getPointerField(this, 8).setCString(interfaceProductInfo);
	}

	public String getInterfaceProductInfo() {
		return InterfaceProductInfo().getCString();
	}

	/**
	 * \u534f\u8bae\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(9) 
	private Pointer<Byte> ProtocolInfo() {
		return this.io.getPointerField(this, 9);
	}

	@Array({11})
	@Field(9)
	public void setProtocolInfo(String protocolInfo) {
		this.io.getPointerField(this, 9).setCString(protocolInfo);
	}

	public String getProtocolInfo() {
		return ProtocolInfo().getCString();
	}

	/// Mac\u5730\u5740
	@Array({21}) 
	@Field(10) 
	private Pointer<Byte> MacAddress() {
		return this.io.getPointerField(this, 10);
	}

	@Array({21})
	@Field(10)
	public void setMacAddress(String macAddress) {
		this.io.getPointerField(this, 10).setCString(macAddress);
	}

	public String getMacAddress() {
		return MacAddress().getCString();
	}

	public CThostFtdcUserSessionField(Pointer pointer) {
		super(pointer);
	}

}

