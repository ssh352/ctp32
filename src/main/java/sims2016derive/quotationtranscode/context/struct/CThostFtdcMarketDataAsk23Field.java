package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcMarketDataAsk23Field extends StructObject {
	public CThostFtdcMarketDataAsk23Field() {
		super();
	}

	/**
	 * \u7533\u5356\u4ef7\u4e8c
	 */
	@Field(0) 
	private double AskPrice2() {
		return this.io.getDoubleField(this, 0);
	}

	public double getAskPrice2() {
		return AskPrice2();
	}

	/**
	 * \u7533\u5356\u4ef7\u4e8c
	 */
	@Field(0) 
	private CThostFtdcMarketDataAsk23Field AskPrice2(double AskPrice2) {
		this.io.setDoubleField(this, 0, AskPrice2);
		return this;
	}

	public void setAskPrice2(double askPrice2) {
		AskPrice2(askPrice2);
	}

	/**
	 * \u7533\u5356\u91cf\u4e8c
	 */
	@Field(1) 
	private int AskVolume2() {
		return this.io.getIntField(this, 1);
	}

	public int getAskVolume2() {
		return AskVolume2();
	}

	/**
	 * \u7533\u5356\u91cf\u4e8c
	 */
	@Field(1) 
	private CThostFtdcMarketDataAsk23Field AskVolume2(int AskVolume2) {
		this.io.setIntField(this, 1, AskVolume2);
		return this;
	}

	public void setAskVolume2(int askVolume2) {
		AskVolume2(askVolume2);
	}

	/**
	 * \u7533\u5356\u4ef7\u4e09
	 */
	@Field(2) 
	private double AskPrice3() {
		return this.io.getDoubleField(this, 2);
	}

	public double getAskPrice3() {
		return AskPrice3();
	}

	/**
	 * \u7533\u5356\u4ef7\u4e09
	 */
	@Field(2) 
	private CThostFtdcMarketDataAsk23Field AskPrice3(double AskPrice3) {
		this.io.setDoubleField(this, 2, AskPrice3);
		return this;
	}

	public void setAskPrice3(double askPrice3) {
		AskPrice3(askPrice3);
	}

	/**
	 * \u7533\u5356\u91cf\u4e09
	 */
	@Field(3) 
	private int AskVolume3() {
		return this.io.getIntField(this, 3);
	}

	public int getAskVolume3() {
		return AskVolume3();
	}

	/**
	 * \u7533\u5356\u91cf\u4e09
	 */
	@Field(3) 
	private CThostFtdcMarketDataAsk23Field AskVolume3(int AskVolume3) {
		this.io.setIntField(this, 3, AskVolume3);
		return this;
	}

	public void setAskVolume3(int askVolume3) {
		AskVolume3(askVolume3);
	}

	public CThostFtdcMarketDataAsk23Field(Pointer pointer) {
		super(pointer);
	}

}

