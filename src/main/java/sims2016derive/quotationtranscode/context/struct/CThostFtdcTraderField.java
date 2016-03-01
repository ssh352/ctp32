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

public class CThostFtdcTraderField extends StructObject {
	public CThostFtdcTraderField() {
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
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801
	 */
	@Array({21}) 
	@Field(1) 
	private Pointer<Byte> TraderID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({21})
	@Field(1)
	public void setTraderID(String traderID) {
		this.io.getPointerField(this, 1).setCString(traderID);
	}

	public String getTraderID() {
		return TraderID().getCString();
	}

	/**
	 * \u4f1a\u5458\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(2) 
	private Pointer<Byte> ParticipantID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({11})
	@Field(2)
	public void setParticipantID(String participantID) {
		this.io.getPointerField(this, 2).setCString(participantID);
	}

	public String getParticipantID() {
		return ParticipantID().getCString();
	}

	/**
	 * \u5bc6\u7801
	 */
	@Array({41}) 
	@Field(3) 
	private Pointer<Byte> Password() {
		return this.io.getPointerField(this, 3);
	}

	@Array({41})
	@Field(3)
	public void setPassword(String password) {
		this.io.getPointerField(this, 3).setCString(password);
	}

	public String getPassword() {
		return Password().getCString();
	}

	/**
	 * \u5b89\u88c5\u6570\u91cf
	 */
	@Field(4) 
	private int InstallCount() {
		return this.io.getIntField(this, 4);
	}

	public int getInstallCount() {
		return InstallCount();
	}

	/**
	 * \u5b89\u88c5\u6570\u91cf
	 */
	@Field(4) 
	private CThostFtdcTraderField InstallCount(int InstallCount) {
		this.io.setIntField(this, 4, InstallCount);
		return this;
	}

	public void setInstallCount(int installCount) {
		InstallCount(installCount);
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(5) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 5);
	}

	@Array({11})
	@Field(5)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 5).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	public CThostFtdcTraderField(Pointer pointer) {
		super(pointer);
	}

}
