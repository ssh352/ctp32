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

public class CThostFtdcExchangeOrderActionField extends StructObject {
	public CThostFtdcExchangeOrderActionField() {
		super();
	}

	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801
	 */
	@Array({9}) 
	@Field(0) 
	private Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 0);
	}

	@Array({9})
	@Field(0)
	public void setExchangeID(String exchangeID) {
		this.io.getPointerField(this, 0).setCString(exchangeID);
	}

	public String getExchangeID() {
		return ExchangeID().getCString();
	}

	/**
	 * \u62a5\u5355\u7f16\u53f7
	 */
	@Array({21}) 
	@Field(1) 
	private Pointer<Byte> OrderSysID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({21})
	@Field(1)
	public void setOrderSysID(String orderSysID) {
		this.io.getPointerField(this, 1).setCString(orderSysID);
	}

	public String getOrderSysID() {
		return OrderSysID().getCString();
	}

	/**
	 * \u64cd\u4f5c\u6807\u5fd7
	 */
	@Field(2) 
	private byte ActionFlag() {
		return this.io.getByteField(this, 2);
	}

	public char getActionFlag() {
		return (char)ActionFlag();
	}

	/**
	 * \u64cd\u4f5c\u6807\u5fd7
	 */
	@Field(2) 
	private CThostFtdcExchangeOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 2, ActionFlag);
		return this;
	}

	public void setActionFlag(char actionFlag) {
		ActionFlag((byte)actionFlag);
	}

	/**
	 * \u4ef7\u683c
	 */
	@Field(3) 
	private double LimitPrice() {
		return this.io.getDoubleField(this, 3);
	}

	public double getLimitPrice() {
		return LimitPrice();
	}

	/**
	 * \u4ef7\u683c
	 */
	@Field(3) 
	private CThostFtdcExchangeOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 3, LimitPrice);
		return this;
	}

	public void setLimitPrice(double limitPrice) {
		LimitPrice(limitPrice);
	}

	/**
	 * \u6570\u91cf\u53d8\u5316
	 */
	@Field(4) 
	private int VolumeChange() {
		return this.io.getIntField(this, 4);
	}

	public int getVolumeChange() {
		return VolumeChange();
	}

	/**
	 * \u6570\u91cf\u53d8\u5316
	 */
	@Field(4) 
	private CThostFtdcExchangeOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 4, VolumeChange);
		return this;
	}

	public void setVolumeChange(int volumeChange) {
		VolumeChange(volumeChange);
	}

	/**
	 * \u64cd\u4f5c\u65e5\u671f
	 */
	@Array({9}) 
	@Field(5) 
	private Pointer<Byte> ActionDate() {
		return this.io.getPointerField(this, 5);
	}

	@Array({9})
	@Field(5)
	public void setActionDate(String actionDate) {
		this.io.getPointerField(this, 5).setCString(actionDate);
	}

	public String getActionDate() {
		return ActionDate().getCString();
	}

	/**
	 * \u64cd\u4f5c\u65f6\u95f4
	 */
	@Array({9}) 
	@Field(6) 
	private Pointer<Byte> ActionTime() {
		return this.io.getPointerField(this, 6);
	}

	@Array({9})
	@Field(6)
	public void setActionTime(String actionTime) {
		this.io.getPointerField(this, 6).setCString(actionTime);
	}

	public String getActionTime() {
		return ActionTime().getCString();
	}

	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801
	 */
	@Array({21}) 
	@Field(7) 
	private Pointer<Byte> TraderID() {
		return this.io.getPointerField(this, 7);
	}

	@Array({21})
	@Field(7)
	public void setTraderID(String traderID) {
		this.io.getPointerField(this, 7).setCString(traderID);
	}

	public String getTraderID() {
		return TraderID().getCString();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(8) 
	private int InstallID() {
		return this.io.getIntField(this, 8);
	}

	public int getInstallID() {
		return InstallID();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(8) 
	private CThostFtdcExchangeOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 8, InstallID);
		return this;
	}

	public void setInstallID(int installID) {
		InstallID(installID);
	}

	/**
	 * \u672c\u5730\u62a5\u5355\u7f16\u53f7
	 */
	@Array({13}) 
	@Field(9) 
	private Pointer<Byte> OrderLocalID() {
		return this.io.getPointerField(this, 9);
	}

	@Array({13})
	@Field(9)
	public void setOrderLocalID(String orderLocalID) {
		this.io.getPointerField(this, 9).setCString(orderLocalID);
	}

	public String getOrderLocalID() {
		return OrderLocalID().getCString();
	}

	/**
	 * \u64cd\u4f5c\u672c\u5730\u7f16\u53f7
	 */
	@Array({13}) 
	@Field(10) 
	private Pointer<Byte> ActionLocalID() {
		return this.io.getPointerField(this, 10);
	}

	@Array({13})
	@Field(10)
	public void setActionLocalID(String actionLocalID) {
		this.io.getPointerField(this, 10).setCString(actionLocalID);
	}

	public String getActionLocalID() {
		return ActionLocalID().getCString();
	}

	/**
	 * \u4f1a\u5458\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(11) 
	private Pointer<Byte> ParticipantID() {
		return this.io.getPointerField(this, 11);
	}

	@Array({11})
	@Field(11)
	public void setParticipantID(String participantID) {
		this.io.getPointerField(this, 11).setCString(participantID);
	}

	public String getParticipantID() {
		return ParticipantID().getCString();
	}

	/**
	 * \u5ba2\u6237\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(12) 
	private Pointer<Byte> ClientID() {
		return this.io.getPointerField(this, 12);
	}

	@Array({11})
	@Field(12)
	public void setClientID(String clientID) {
		this.io.getPointerField(this, 12).setCString(clientID);
	}

	public String getClientID() {
		return ClientID().getCString();
	}

	/**
	 * \u4e1a\u52a1\u5355\u5143
	 */
	@Array({21}) 
	@Field(13) 
	private Pointer<Byte> BusinessUnit() {
		return this.io.getPointerField(this, 13);
	}

	@Array({21})
	@Field(13)
	public void setBusinessUnit(String businessUnit) {
		this.io.getPointerField(this, 13).setCString(businessUnit);
	}

	public String getBusinessUnit() {
		return BusinessUnit().getCString();
	}

	/**
	 * \u62a5\u5355\u64cd\u4f5c\u72b6\u6001
	 */
	@Field(14) 
	private byte OrderActionStatus() {
		return this.io.getByteField(this, 14);
	}

	public char getOrderActionStatus() {
		return (char)OrderActionStatus();
	}

	/**
	 * \u62a5\u5355\u64cd\u4f5c\u72b6\u6001
	 */
	@Field(14) 
	private CThostFtdcExchangeOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 14, OrderActionStatus);
		return this;
	}

	public void setOrderActionStatus(char orderActionStatus) {
		OrderActionStatus((byte)orderActionStatus);
	}

	/**
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(15) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 15);
	}

	@Array({16})
	@Field(15)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 15).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	public CThostFtdcExchangeOrderActionField(Pointer pointer) {
		super(pointer);
	}

}
