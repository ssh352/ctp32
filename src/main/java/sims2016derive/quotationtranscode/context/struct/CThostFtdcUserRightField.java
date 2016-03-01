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

public class CThostFtdcUserRightField extends StructObject {
	public CThostFtdcUserRightField() {
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
	 * \u5ba2\u6237\u6743\u9650\u7c7b\u578b
	 */
	@Field(2) 
	private byte UserRightType() {
		return this.io.getByteField(this, 2);
	}

	public char getUserRightType() {
		return (char)UserRightType();
	}

	/**
	 * \u5ba2\u6237\u6743\u9650\u7c7b\u578b
	 */
	@Field(2) 
	private CThostFtdcUserRightField UserRightType(byte UserRightType) {
		this.io.setByteField(this, 2, UserRightType);
		return this;
	}

	public void setUserRightType(char userRightType) {
		UserRightType((byte)userRightType);
	}

	/**
	 * \u662f\u5426\u7981\u6b62
	 */
	@Field(3) 
	private int IsForbidden() {
		return this.io.getIntField(this, 3);
	}

	public int getIsForbidden() {
		return IsForbidden();
	}

	/**
	 * \u662f\u5426\u7981\u6b62
	 */
	@Field(3) 
	private CThostFtdcUserRightField IsForbidden(int IsForbidden) {
		this.io.setIntField(this, 3, IsForbidden);
		return this;
	}

	public void setIsForbidden(int isForbidden) {
		IsForbidden(isForbidden);
	}

	public CThostFtdcUserRightField(Pointer pointer) {
		super(pointer);
	}

}
