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

public class CThostFtdcSyncingInvestorGroupField extends StructObject {
	public CThostFtdcSyncingInvestorGroupField() {
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
	 * \u6295\u8d44\u8005\u5206\u7ec4\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(1) 
	private Pointer<Byte> InvestorGroupID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13})
	@Field(1)
	public void setInvestorGroupID(String investorGroupID) {
		this.io.getPointerField(this, 1).setCString(investorGroupID);
	}

	public String getInvestorGroupID() {
		return InvestorGroupID().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u5206\u7ec4\u540d\u79f0
	 */
	@Array({41}) 
	@Field(2) 
	private Pointer<Byte> InvestorGroupName() {
		return this.io.getPointerField(this, 2);
	}

	@Array({41})
	@Field(2)
	public void setInvestorGroupName(String investorGroupName) {
		this.io.getPointerField(this, 2).setCString(investorGroupName);
	}

	public String getInvestorGroupName() {
		return InvestorGroupName().getCString();
	}

	public CThostFtdcSyncingInvestorGroupField(Pointer pointer) {
		super(pointer);
	}

}

