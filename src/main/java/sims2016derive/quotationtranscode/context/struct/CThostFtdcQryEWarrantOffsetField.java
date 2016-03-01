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

public class CThostFtdcQryEWarrantOffsetField extends StructObject {
	public CThostFtdcQryEWarrantOffsetField() {
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
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(1) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13})
	@Field(1)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 1).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
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
	 * \u5408\u7ea6\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(3) 
	private Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 3);
	}

	@Array({31})
	@Field(3)
	public void setInstrumentID(String instrumentID) {
		this.io.getPointerField(this, 3).setCString(instrumentID);
	}

	public String getInstrumentID() {
		return InstrumentID().getCString();
	}

	public CThostFtdcQryEWarrantOffsetField(Pointer pointer) {
		super(pointer);
	}

}

