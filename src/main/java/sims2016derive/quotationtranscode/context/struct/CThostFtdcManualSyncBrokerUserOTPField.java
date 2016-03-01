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

public class CThostFtdcManualSyncBrokerUserOTPField extends StructObject {
	public CThostFtdcManualSyncBrokerUserOTPField() {
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
	 * \u52a8\u6001\u4ee4\u724c\u7c7b\u578b
	 */
	@Field(2) 
	private byte OTPType() {
		return this.io.getByteField(this, 2);
	}

	public char getOTPType() {
		return (char)OTPType();
	}

	/**
	 * \u52a8\u6001\u4ee4\u724c\u7c7b\u578b
	 */
	@Field(2) 
	private CThostFtdcManualSyncBrokerUserOTPField OTPType(byte OTPType) {
		this.io.setByteField(this, 2, OTPType);
		return this;
	}

	public void setOTPType(char oTPType) {
		OTPType((byte)oTPType);
	}

	/**
	 * \u7b2c\u4e00\u4e2a\u52a8\u6001\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(3) 
	private Pointer<Byte> FirstOTP() {
		return this.io.getPointerField(this, 3);
	}

	@Array({41})
	@Field(3)
	public void setFirstOTP(String firstOTP) {
		this.io.getPointerField(this, 3).setCString(firstOTP);
	}

	public String getFirstOTP() {
		return FirstOTP().getCString();
	}

	/**
	 * \u7b2c\u4e8c\u4e2a\u52a8\u6001\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(4) 
	private Pointer<Byte> SecondOTP() {
		return this.io.getPointerField(this, 4);
	}

	@Array({41})
	@Field(4)
	public void setSecondOTP(String secondOTP) {
		this.io.getPointerField(this, 4).setCString(secondOTP);
	}

	public String getSecondOTP() {
		return SecondOTP().getCString();
	}

	public CThostFtdcManualSyncBrokerUserOTPField(Pointer pointer) {
		super(pointer);
	}

}

