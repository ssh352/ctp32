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

public class CThostFtdcVerifyFuturePasswordField extends StructObject {
	public CThostFtdcVerifyFuturePasswordField() {
		super();
	}

	/**
	 * \u4e1a\u52a1\u529f\u80fd\u7801
	 */
	@Array({7}) 
	@Field(0) 
	private Pointer<Byte> TradeCode() {
		return this.io.getPointerField(this, 0);
	}

	@Array({7})
	@Field(0)
	public void setTradeCode(String tradeCode) {
		this.io.getPointerField(this, 0).setCString(tradeCode);
	}

	public String getTradeCode() {
		return TradeCode().getCString();
	}

	/**
	 * \u94f6\u884c\u4ee3\u7801
	 */
	@Array({4}) 
	@Field(1) 
	private Pointer<Byte> BankID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({4})
	@Field(1)
	public void setBankID(String bankID) {
		this.io.getPointerField(this, 1).setCString(bankID);
	}

	public String getBankID() {
		return BankID().getCString();
	}

	/**
	 * \u94f6\u884c\u5206\u652f\u673a\u6784\u4ee3\u7801
	 */
	@Array({5}) 
	@Field(2) 
	private Pointer<Byte> BankBranchID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({5})
	@Field(2)
	public void setBankBranchID(String bankBranchID) {
		this.io.getPointerField(this, 2).setCString(bankBranchID);
	}

	public String getBankBranchID() {
		return BankBranchID().getCString();
	}

	/**
	 * \u671f\u5546\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(3) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 3);
	}

	@Array({11})
	@Field(3)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 3).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	/**
	 * \u671f\u5546\u5206\u652f\u673a\u6784\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(4) 
	private Pointer<Byte> BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}

	@Array({31})
	@Field(4)
	public void setBrokerBranchID(String brokerBranchID) {
		this.io.getPointerField(this, 4).setCString(brokerBranchID);
	}

	public String getBrokerBranchID() {
		return BrokerBranchID().getCString();
	}

	/**
	 * \u4ea4\u6613\u65e5\u671f
	 */
	@Array({9}) 
	@Field(5) 
	private Pointer<Byte> TradeDate() {
		return this.io.getPointerField(this, 5);
	}

	@Array({9})
	@Field(5)
	public void setTradeDate(String tradeDate) {
		this.io.getPointerField(this, 5).setCString(tradeDate);
	}

	public String getTradeDate() {
		return TradeDate().getCString();
	}

	/**
	 * \u4ea4\u6613\u65f6\u95f4
	 */
	@Array({9}) 
	@Field(6) 
	private Pointer<Byte> TradeTime() {
		return this.io.getPointerField(this, 6);
	}

	@Array({9})
	@Field(6)
	public void setTradeTime(String tradeTime) {
		this.io.getPointerField(this, 6).setCString(tradeTime);
	}

	public String getTradeTime() {
		return TradeTime().getCString();
	}

	/**
	 * \u94f6\u884c\u6d41\u6c34\u53f7
	 */
	@Array({13}) 
	@Field(7) 
	private Pointer<Byte> BankSerial() {
		return this.io.getPointerField(this, 7);
	}

	@Array({13})
	@Field(7)
	public void setBankSerial(String bankSerial) {
		this.io.getPointerField(this, 7).setCString(bankSerial);
	}

	public String getBankSerial() {
		return BankSerial().getCString();
	}

	/**
	 * \u4ea4\u6613\u7cfb\u7edf\u65e5\u671f
	 */
	@Array({9}) 
	@Field(8) 
	private Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 8);
	}

	@Array({9})
	@Field(8)
	public void setTradingDay(String tradingDay) {
		this.io.getPointerField(this, 8).setCString(tradingDay);
	}

	public String getTradingDay() {
		return TradingDay().getCString();
	}

	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7
	 */
	@Field(9) 
	private int PlateSerial() {
		return this.io.getIntField(this, 9);
	}

	public int getPlateSerial() {
		return PlateSerial();
	}

	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7
	 */
	@Field(9) 
	private CThostFtdcVerifyFuturePasswordField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}

	public void setPlateSerial(int plateSerial) {
		PlateSerial(plateSerial);
	}

	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7
	 */
	@Field(10) 
	private byte LastFragment() {
		return this.io.getByteField(this, 10);
	}

	public char getLastFragment() {
		return (char)LastFragment();
	}

	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7
	 */
	@Field(10) 
	private CThostFtdcVerifyFuturePasswordField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}

	public void setLastFragment(char lastFragment) {
		LastFragment((byte)lastFragment);
	}

	/**
	 * \u4f1a\u8bdd\u53f7
	 */
	@Field(11) 
	private int SessionID() {
		return this.io.getIntField(this, 11);
	}

	public int getSessionID() {
		return SessionID();
	}

	/**
	 * \u4f1a\u8bdd\u53f7
	 */
	@Field(11) 
	private CThostFtdcVerifyFuturePasswordField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}

	public void setSessionID(int sessionID) {
		SessionID(sessionID);
	}

	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7
	 */
	@Array({13}) 
	@Field(12) 
	private Pointer<Byte> AccountID() {
		return this.io.getPointerField(this, 12);
	}

	@Array({13})
	@Field(12)
	public void setAccountID(String accountID) {
		this.io.getPointerField(this, 12).setCString(accountID);
	}

	public String getAccountID() {
		return AccountID().getCString();
	}

	/**
	 * \u671f\u8d27\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(13) 
	private Pointer<Byte> Password() {
		return this.io.getPointerField(this, 13);
	}

	@Array({41})
	@Field(13)
	public void setPassword(String password) {
		this.io.getPointerField(this, 13).setCString(password);
	}

	public String getPassword() {
		return Password().getCString();
	}

	/**
	 * \u94f6\u884c\u5e10\u53f7
	 */
	@Array({41}) 
	@Field(14) 
	private Pointer<Byte> BankAccount() {
		return this.io.getPointerField(this, 14);
	}

	@Array({41})
	@Field(14)
	public void setBankAccount(String bankAccount) {
		this.io.getPointerField(this, 14).setCString(bankAccount);
	}

	public String getBankAccount() {
		return BankAccount().getCString();
	}

	/**
	 * \u94f6\u884c\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(15) 
	private Pointer<Byte> BankPassWord() {
		return this.io.getPointerField(this, 15);
	}

	@Array({41})
	@Field(15)
	public void setBankPassWord(String bankPassWord) {
		this.io.getPointerField(this, 15).setCString(bankPassWord);
	}

	public String getBankPassWord() {
		return BankPassWord().getCString();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(16) 
	private int InstallID() {
		return this.io.getIntField(this, 16);
	}

	public int getInstallID() {
		return InstallID();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(16) 
	private CThostFtdcVerifyFuturePasswordField InstallID(int InstallID) {
		this.io.setIntField(this, 16, InstallID);
		return this;
	}

	public void setInstallID(int installID) {
		InstallID(installID);
	}

	/**
	 * \u4ea4\u6613ID
	 */
	@Field(17) 
	private int TID() {
		return this.io.getIntField(this, 17);
	}

	public int getTID() {
		return TID();
	}

	/**
	 * \u4ea4\u6613ID
	 */
	@Field(17) 
	private CThostFtdcVerifyFuturePasswordField TID(int TID) {
		this.io.setIntField(this, 17, TID);
		return this;
	}

	public void setTID(int tID) {
		TID(tID);
	}

	public CThostFtdcVerifyFuturePasswordField(Pointer pointer) {
		super(pointer);
	}

}

