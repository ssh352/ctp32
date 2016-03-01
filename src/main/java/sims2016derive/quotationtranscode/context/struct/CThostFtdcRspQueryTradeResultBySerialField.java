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

public class CThostFtdcRspQueryTradeResultBySerialField extends StructObject {
	public CThostFtdcRspQueryTradeResultBySerialField() {
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
	private CThostFtdcRspQueryTradeResultBySerialField PlateSerial(int PlateSerial) {
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
	private CThostFtdcRspQueryTradeResultBySerialField LastFragment(byte LastFragment) {
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
	private CThostFtdcRspQueryTradeResultBySerialField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}

	public void setSessionID(int sessionID) {
		SessionID(sessionID);
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(12) 
	private int ErrorID() {
		return this.io.getIntField(this, 12);
	}

	public int getErrorID() {
		return ErrorID();
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(12) 
	private CThostFtdcRspQueryTradeResultBySerialField ErrorID(int ErrorID) {
		this.io.setIntField(this, 12, ErrorID);
		return this;
	}

	public void setErrorID(int errorID) {
		ErrorID(errorID);
	}

	/**
	 * \u9519\u8bef\u4fe1\u606f
	 */
	@Array({81}) 
	@Field(13) 
	private Pointer<Byte> ErrorMsg() {
		return this.io.getPointerField(this, 13);
	}

	@Array({81})
	@Field(13)
	public void setErrorMsg(String errorMsg) {
		this.io.getPointerField(this, 13).setCString(errorMsg);
	}

	public String getErrorMsg() {
		return ErrorMsg().getCString();
	}

	/**
	 * \u6d41\u6c34\u53f7
	 */
	@Field(14) 
	private int Reference() {
		return this.io.getIntField(this, 14);
	}

	public int getReference() {
		return Reference();
	}

	/**
	 * \u6d41\u6c34\u53f7
	 */
	@Field(14) 
	private CThostFtdcRspQueryTradeResultBySerialField Reference(int Reference) {
		this.io.setIntField(this, 14, Reference);
		return this;
	}

	public void setReference(int reference) {
		Reference(reference);
	}

	/**
	 * \u672c\u6d41\u6c34\u53f7\u53d1\u5e03\u8005\u7684\u673a\u6784\u7c7b\u578b
	 */
	@Field(15) 
	private byte RefrenceIssureType() {
		return this.io.getByteField(this, 15);
	}

	public char getRefrenceIssureType() {
		return (char)RefrenceIssureType();
	}

	/**
	 * \u672c\u6d41\u6c34\u53f7\u53d1\u5e03\u8005\u7684\u673a\u6784\u7c7b\u578b
	 */
	@Field(15) 
	private CThostFtdcRspQueryTradeResultBySerialField RefrenceIssureType(byte RefrenceIssureType) {
		this.io.setByteField(this, 15, RefrenceIssureType);
		return this;
	}

	public void setRefrenceIssureType(char refrenceIssureType) {
		RefrenceIssureType((byte)refrenceIssureType);
	}

	/**
	 * \u672c\u6d41\u6c34\u53f7\u53d1\u5e03\u8005\u673a\u6784\u7f16\u7801
	 */
	@Array({36}) 
	@Field(16) 
	private Pointer<Byte> RefrenceIssure() {
		return this.io.getPointerField(this, 16);
	}

	@Array({36})
	@Field(16)
	public void setRefrenceIssure(String refrenceIssure) {
		this.io.getPointerField(this, 16).setCString(refrenceIssure);
	}

	public String getRefrenceIssure() {
		return RefrenceIssure().getCString();
	}

	/**
	 * \u539f\u59cb\u8fd4\u56de\u4ee3\u7801
	 */
	@Array({7}) 
	@Field(17) 
	private Pointer<Byte> OriginReturnCode() {
		return this.io.getPointerField(this, 17);
	}

	@Array({7})
	@Field(17)
	public void setOriginReturnCode(String originReturnCode) {
		this.io.getPointerField(this, 17).setCString(originReturnCode);
	}

	public String getOriginReturnCode() {
		return OriginReturnCode().getCString();
	}

	/**
	 * \u539f\u59cb\u8fd4\u56de\u7801\u63cf\u8ff0
	 */
	@Array({129}) 
	@Field(18) 
	private Pointer<Byte> OriginDescrInfoForReturnCode() {
		return this.io.getPointerField(this, 18);
	}

	@Array({129})
	@Field(18)
	public void setOriginDescrInfoForReturnCode(String originDescrInfoForReturnCode) {
		this.io.getPointerField(this, 18).setCString(originDescrInfoForReturnCode);
	}

	public String getOriginDescrInfoForReturnCode() {
		return OriginDescrInfoForReturnCode().getCString();
	}

	/**
	 * \u94f6\u884c\u5e10\u53f7
	 */
	@Array({41}) 
	@Field(19) 
	private Pointer<Byte> BankAccount() {
		return this.io.getPointerField(this, 19);
	}

	@Array({41})
	@Field(19)
	public void setBankAccount(String bankAccount) {
		this.io.getPointerField(this, 19).setCString(bankAccount);
	}

	public String getBankAccount() {
		return BankAccount().getCString();
	}

	/**
	 * \u94f6\u884c\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(20) 
	private Pointer<Byte> BankPassWord() {
		return this.io.getPointerField(this, 20);
	}

	@Array({41})
	@Field(20)
	public void setBankPassWord(String bankPassWord) {
		this.io.getPointerField(this, 20).setCString(bankPassWord);
	}

	public String getBankPassWord() {
		return BankPassWord().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7
	 */
	@Array({13}) 
	@Field(21) 
	private Pointer<Byte> AccountID() {
		return this.io.getPointerField(this, 21);
	}

	@Array({13})
	@Field(21)
	public void setAccountID(String accountID) {
		this.io.getPointerField(this, 21).setCString(accountID);
	}

	public String getAccountID() {
		return AccountID().getCString();
	}

	/**
	 * \u671f\u8d27\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(22) 
	private Pointer<Byte> Password() {
		return this.io.getPointerField(this, 22);
	}

	@Array({41})
	@Field(22)
	public void setPassword(String password) {
		this.io.getPointerField(this, 22).setCString(password);
	}

	public String getPassword() {
		return Password().getCString();
	}

	/**
	 * \u5e01\u79cd\u4ee3\u7801
	 */
	@Array({4}) 
	@Field(23) 
	private Pointer<Byte> CurrencyID() {
		return this.io.getPointerField(this, 23);
	}

	@Array({4})
	@Field(23)
	public void setCurrencyID(String currencyID) {
		this.io.getPointerField(this, 23).setCString(currencyID);
	}

	public String getCurrencyID() {
		return CurrencyID().getCString();
	}

	/**
	 * \u8f6c\u5e10\u91d1\u989d
	 */
	@Field(24) 
	private double TradeAmount() {
		return this.io.getDoubleField(this, 24);
	}

	public double getTradeAmount() {
		return TradeAmount();
	}

	/**
	 * \u8f6c\u5e10\u91d1\u989d
	 */
	@Field(24) 
	private CThostFtdcRspQueryTradeResultBySerialField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 24, TradeAmount);
		return this;
	}

	public void setTradeAmount(double tradeAmount) {
		TradeAmount(tradeAmount);
	}

	/**
	 * \u6458\u8981
	 */
	@Array({36}) 
	@Field(25) 
	private Pointer<Byte> Digest() {
		return this.io.getPointerField(this, 25);
	}

	@Array({36})
	@Field(25)
	public void setDigest(String digest) {
		this.io.getPointerField(this, 25).setCString(digest);
	}

	public String getDigest() {
		return Digest().getCString();
	}

	public CThostFtdcRspQueryTradeResultBySerialField(Pointer pointer) {
		super(pointer);
	}

}

