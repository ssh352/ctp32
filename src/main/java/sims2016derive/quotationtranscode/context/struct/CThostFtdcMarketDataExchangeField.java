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

public class CThostFtdcMarketDataExchangeField extends StructObject {
	public CThostFtdcMarketDataExchangeField() {
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

	public CThostFtdcMarketDataExchangeField(Pointer pointer) {
		super(pointer);
	}

}

