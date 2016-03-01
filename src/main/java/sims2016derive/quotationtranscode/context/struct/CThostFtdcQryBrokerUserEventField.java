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

public class CThostFtdcQryBrokerUserEventField extends StructObject {
	public CThostFtdcQryBrokerUserEventField() {
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
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(1) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({16})
	@Field(1)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 1).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	/**
	 * \u7528\u6237\u4e8b\u4ef6\u7c7b\u578b
	 */
	@Field(2) 
	private byte UserEventType() {
		return this.io.getByteField(this, 2);
	}

	public char getUserEventType() {
		return (char)UserEventType();
	}

	/**
	 * \u7528\u6237\u4e8b\u4ef6\u7c7b\u578b
	 */
	@Field(2) 
	private CThostFtdcQryBrokerUserEventField UserEventType(byte UserEventType) {
		this.io.setByteField(this, 2, UserEventType);
		return this;
	}

	public void setUserEventType(char userEventType) {
		UserEventType((byte)userEventType);
	}

	public CThostFtdcQryBrokerUserEventField(Pointer pointer) {
		super(pointer);
	}

}
