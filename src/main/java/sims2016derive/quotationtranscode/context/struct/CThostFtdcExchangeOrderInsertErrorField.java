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

public class CThostFtdcExchangeOrderInsertErrorField extends StructObject {
	public CThostFtdcExchangeOrderInsertErrorField() {
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
	 * \u4f1a\u5458\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(1) 
	private Pointer<Byte> ParticipantID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({11})
	@Field(1)
	public void setParticipantID(String participantID) {
		this.io.getPointerField(this, 1).setCString(participantID);
	}

	public String getParticipantID() {
		return ParticipantID().getCString();
	}

	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801
	 */
	@Array({21}) 
	@Field(2) 
	private Pointer<Byte> TraderID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({21})
	@Field(2)
	public void setTraderID(String traderID) {
		this.io.getPointerField(this, 2).setCString(traderID);
	}

	public String getTraderID() {
		return TraderID().getCString();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(3) 
	private int InstallID() {
		return this.io.getIntField(this, 3);
	}

	public int getInstallID() {
		return InstallID();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(3) 
	private CThostFtdcExchangeOrderInsertErrorField InstallID(int InstallID) {
		this.io.setIntField(this, 3, InstallID);
		return this;
	}

	public void setInstallID(int installID) {
		InstallID(installID);
	}

	/**
	 * \u672c\u5730\u62a5\u5355\u7f16\u53f7
	 */
	@Array({13}) 
	@Field(4) 
	private Pointer<Byte> OrderLocalID() {
		return this.io.getPointerField(this, 4);
	}

	@Array({13})
	@Field(4)
	public void setOrderLocalID(String orderLocalID) {
		this.io.getPointerField(this, 4).setCString(orderLocalID);
	}

	public String getOrderLocalID() {
		return OrderLocalID().getCString();
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(5) 
	private int ErrorID() {
		return this.io.getIntField(this, 5);
	}

	public int getErrorID() {
		return ErrorID();
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(5) 
	private CThostFtdcExchangeOrderInsertErrorField ErrorID(int ErrorID) {
		this.io.setIntField(this, 5, ErrorID);
		return this;
	}

	public void setErrorID(int errorID) {
		ErrorID(errorID);
	}

	/**
	 * \u9519\u8bef\u4fe1\u606f
	 */
	@Array({81}) 
	@Field(6) 
	private Pointer<Byte> ErrorMsg() {
		return this.io.getPointerField(this, 6);
	}

	@Array({81})
	@Field(6)
	public void setErrorMsg(String errorMsg) {
		this.io.getPointerField(this, 6).setCString(errorMsg);
	}

	public String getErrorMsg() {
		return ErrorMsg().getCString();
	}

	public CThostFtdcExchangeOrderInsertErrorField(Pointer pointer) {
		super(pointer);
	}

}

