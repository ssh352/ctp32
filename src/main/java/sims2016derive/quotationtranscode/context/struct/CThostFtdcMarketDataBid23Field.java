package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcMarketDataBid23Field extends StructObject {
	public CThostFtdcMarketDataBid23Field() {
		super();
	}

	/**
	 * \u7533\u4e70\u4ef7\u4e8c
	 */
	@Field(0) 
	private double BidPrice2() {
		return this.io.getDoubleField(this, 0);
	}

	public double getBidPrice2() {
		return BidPrice2();
	}

	/**
	 * \u7533\u4e70\u4ef7\u4e8c
	 */
	@Field(0) 
	private CThostFtdcMarketDataBid23Field BidPrice2(double BidPrice2) {
		this.io.setDoubleField(this, 0, BidPrice2);
		return this;
	}

	public void setBidPrice2(double bidPrice2) {
		BidPrice2(bidPrice2);
	}

	/**
	 * \u7533\u4e70\u91cf\u4e8c
	 */
	@Field(1) 
	private int BidVolume2() {
		return this.io.getIntField(this, 1);
	}

	public int getBidVolume2() {
		return BidVolume2();
	}

	/**
	 * \u7533\u4e70\u91cf\u4e8c
	 */
	@Field(1) 
	private CThostFtdcMarketDataBid23Field BidVolume2(int BidVolume2) {
		this.io.setIntField(this, 1, BidVolume2);
		return this;
	}

	public void setBidVolume2(int bidVolume2) {
		BidVolume2(bidVolume2);
	}

	/**
	 * \u7533\u4e70\u4ef7\u4e09
	 */
	@Field(2) 
	private double BidPrice3() {
		return this.io.getDoubleField(this, 2);
	}

	public double getBidPrice3() {
		return BidPrice3();
	}

	/**
	 * \u7533\u4e70\u4ef7\u4e09
	 */
	@Field(2) 
	private CThostFtdcMarketDataBid23Field BidPrice3(double BidPrice3) {
		this.io.setDoubleField(this, 2, BidPrice3);
		return this;
	}

	public void setBidPrice3(double bidPrice3) {
		BidPrice3(bidPrice3);
	}

	/**
	 * \u7533\u4e70\u91cf\u4e09
	 */
	@Field(3) 
	private int BidVolume3() {
		return this.io.getIntField(this, 3);
	}

	public int getBidVolume3() {
		return BidVolume3();
	}

	/**
	 * \u7533\u4e70\u91cf\u4e09
	 */
	@Field(3) 
	private CThostFtdcMarketDataBid23Field BidVolume3(int BidVolume3) {
		this.io.setIntField(this, 3, BidVolume3);
		return this;
	}

	public void setBidVolume3(int bidVolume3) {
		BidVolume3(bidVolume3);
	}

	public CThostFtdcMarketDataBid23Field(Pointer pointer) {
		super(pointer);
	}

}

