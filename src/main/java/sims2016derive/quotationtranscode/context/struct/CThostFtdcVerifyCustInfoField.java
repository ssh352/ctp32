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

public class CThostFtdcVerifyCustInfoField extends StructObject {
	public CThostFtdcVerifyCustInfoField() {
		super();
	}

	/**
	 * \u5ba2\u6237\u59d3\u540d
	 */
	@Array({51}) 
	@Field(0) 
	private Pointer<Byte> CustomerName() {
		return this.io.getPointerField(this, 0);
	}

	@Array({51})
	@Field(0)
	public void setCustomerName(String customerName) {
		this.io.getPointerField(this, 0).setCString(customerName);
	}

	public String getCustomerName() {
		return CustomerName().getCString();
	}

	/**
	 * \u8bc1\u4ef6\u7c7b\u578b
	 */
	@Field(1) 
	private byte IdCardType() {
		return this.io.getByteField(this, 1);
	}

	public char getIdCardType() {
		return (char)IdCardType();
	}

	/**
	 * \u8bc1\u4ef6\u7c7b\u578b
	 */
	@Field(1) 
	private CThostFtdcVerifyCustInfoField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 1, IdCardType);
		return this;
	}

	public void setIdCardType(char idCardType) {
		IdCardType((byte)idCardType);
	}

	/**
	 * \u8bc1\u4ef6\u53f7\u7801
	 */
	@Array({51}) 
	@Field(2) 
	private Pointer<Byte> IdentifiedCardNo() {
		return this.io.getPointerField(this, 2);
	}

	@Array({51})
	@Field(2)
	public void setIdentifiedCardNo(String identifiedCardNo) {
		this.io.getPointerField(this, 2).setCString(identifiedCardNo);
	}

	public String getIdentifiedCardNo() {
		return IdentifiedCardNo().getCString();
	}

	/**
	 * \u5ba2\u6237\u7c7b\u578b
	 */
	@Field(3) 
	private byte CustType() {
		return this.io.getByteField(this, 3);
	}

	public char getCustType() {
		return (char)CustType();
	}

	/**
	 * \u5ba2\u6237\u7c7b\u578b
	 */
	@Field(3) 
	private CThostFtdcVerifyCustInfoField CustType(byte CustType) {
		this.io.setByteField(this, 3, CustType);
		return this;
	}

	public void setCustType(char custType) {
		CustType((byte)custType);
	}

	public CThostFtdcVerifyCustInfoField(Pointer pointer) {
		super(pointer);
	}

}

