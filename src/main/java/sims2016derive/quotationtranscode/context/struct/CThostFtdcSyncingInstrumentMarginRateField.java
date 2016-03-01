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

public class CThostFtdcSyncingInstrumentMarginRateField extends StructObject {
	public CThostFtdcSyncingInstrumentMarginRateField() {
		super();
	}

	/**
	 * \u5408\u7ea6\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(0) 
	private Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 0);
	}

	@Array({31})
	@Field(0)
	public void setInstrumentID(String instrumentID) {
		this.io.getPointerField(this, 0).setCString(instrumentID);
	}

	public String getInstrumentID() {
		return InstrumentID().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u8303\u56f4
	 */
	@Field(1) 
	private byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}

	public char getInvestorRange() {
		return (char)InvestorRange();
	}

	/**
	 * \u6295\u8d44\u8005\u8303\u56f4
	 */
	@Field(1) 
	private CThostFtdcSyncingInstrumentMarginRateField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}

	public void setInvestorRange(char investorRange) {
		InvestorRange((byte)investorRange);
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
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(3) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 3);
	}

	@Array({13})
	@Field(3)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 3).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7
	 */
	@Field(4) 
	private byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}

	public char getHedgeFlag() {
		return (char)HedgeFlag();
	}

	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7
	 */
	@Field(4) 
	private CThostFtdcSyncingInstrumentMarginRateField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}

	public void setHedgeFlag(char hedgeFlag) {
		HedgeFlag((byte)hedgeFlag);
	}

	/**
	 * \u591a\u5934\u4fdd\u8bc1\u91d1\u7387
	 */
	@Field(5) 
	private double LongMarginRatioByMoney() {
		return this.io.getDoubleField(this, 5);
	}

	public double getLongMarginRatioByMoney() {
		return LongMarginRatioByMoney();
	}

	/**
	 * \u591a\u5934\u4fdd\u8bc1\u91d1\u7387
	 */
	@Field(5) 
	private CThostFtdcSyncingInstrumentMarginRateField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
		this.io.setDoubleField(this, 5, LongMarginRatioByMoney);
		return this;
	}

	public void setLongMarginRatioByMoney(double longMarginRatioByMoney) {
		LongMarginRatioByMoney(longMarginRatioByMoney);
	}

	/**
	 * \u591a\u5934\u4fdd\u8bc1\u91d1\u8d39
	 */
	@Field(6) 
	private double LongMarginRatioByVolume() {
		return this.io.getDoubleField(this, 6);
	}

	public double getLongMarginRatioByVolume() {
		return LongMarginRatioByVolume();
	}

	/**
	 * \u591a\u5934\u4fdd\u8bc1\u91d1\u8d39
	 */
	@Field(6) 
	private CThostFtdcSyncingInstrumentMarginRateField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
		this.io.setDoubleField(this, 6, LongMarginRatioByVolume);
		return this;
	}

	public void setLongMarginRatioByVolume(double longMarginRatioByVolume) {
		LongMarginRatioByVolume(longMarginRatioByVolume);
	}

	/**
	 * \u7a7a\u5934\u4fdd\u8bc1\u91d1\u7387
	 */
	@Field(7) 
	private double ShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 7);
	}

	public double getShortMarginRatioByMoney() {
		return ShortMarginRatioByMoney();
	}

	/**
	 * \u7a7a\u5934\u4fdd\u8bc1\u91d1\u7387
	 */
	@Field(7) 
	private CThostFtdcSyncingInstrumentMarginRateField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 7, ShortMarginRatioByMoney);
		return this;
	}

	public void setShortMarginRatioByMoney(double shortMarginRatioByMoney) {
		ShortMarginRatioByMoney(shortMarginRatioByMoney);
	}

	/**
	 * \u7a7a\u5934\u4fdd\u8bc1\u91d1\u8d39
	 */
	@Field(8) 
	private double ShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 8);
	}

	public double getShortMarginRatioByVolume() {
		return ShortMarginRatioByVolume();
	}

	/**
	 * \u7a7a\u5934\u4fdd\u8bc1\u91d1\u8d39
	 */
	@Field(8) 
	private CThostFtdcSyncingInstrumentMarginRateField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 8, ShortMarginRatioByVolume);
		return this;
	}

	public void setShortMarginRatioByVolume(double shortMarginRatioByVolume) {
		ShortMarginRatioByVolume(shortMarginRatioByVolume);
	}

	/**
	 * \u662f\u5426\u76f8\u5bf9\u4ea4\u6613\u6240\u6536\u53d6
	 */
	@Field(9) 
	private int IsRelative() {
		return this.io.getIntField(this, 9);
	}

	public int getIsRelative() {
		return IsRelative();
	}

	/**
	 * \u662f\u5426\u76f8\u5bf9\u4ea4\u6613\u6240\u6536\u53d6
	 */
	@Field(9) 
	private CThostFtdcSyncingInstrumentMarginRateField IsRelative(int IsRelative) {
		this.io.setIntField(this, 9, IsRelative);
		return this;
	}

	public void setIsRelative(int isRelative) {
		IsRelative(isRelative);
	}

	public CThostFtdcSyncingInstrumentMarginRateField(Pointer pointer) {
		super(pointer);
	}

}

