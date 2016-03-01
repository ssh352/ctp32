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

public class CThostFtdcPositionProfitAlgorithmField extends StructObject {
	public CThostFtdcPositionProfitAlgorithmField() {
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
	 * \u6295\u8d44\u8005\u5e10\u53f7
	 */
	@Array({13}) 
	@Field(1) 
	private Pointer<Byte> AccountID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13})
	@Field(1)
	public void setAccountID(String accountID) {
		this.io.getPointerField(this, 1).setCString(accountID);
	}

	public String getAccountID() {
		return AccountID().getCString();
	}

	/**
	 * \u76c8\u4e8f\u7b97\u6cd5
	 */
	@Field(2) 
	private byte Algorithm() {
		return this.io.getByteField(this, 2);
	}

	public char getAlgorithm() {
		return (char)Algorithm();
	}

	/**
	 * \u76c8\u4e8f\u7b97\u6cd5
	 */
	@Field(2) 
	private CThostFtdcPositionProfitAlgorithmField Algorithm(byte Algorithm) {
		this.io.setByteField(this, 2, Algorithm);
		return this;
	}

	public void setAlgorithm(char algorithm) {
		Algorithm((byte)algorithm);
	}

	/**
	 * \u5907\u6ce8
	 */
	@Array({161}) 
	@Field(3) 
	private Pointer<Byte> Memo() {
		return this.io.getPointerField(this, 3);
	}

	@Array({161})
	@Field(3)
	public void setMemo(String memo) {
		this.io.getPointerField(this, 3).setCString(memo);
	}

	public String getMemo() {
		return Memo().getCString();
	}

	public CThostFtdcPositionProfitAlgorithmField(Pointer pointer) {
		super(pointer);
	}

}

