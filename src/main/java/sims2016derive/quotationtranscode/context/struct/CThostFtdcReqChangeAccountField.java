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

public class CThostFtdcReqChangeAccountField extends StructObject {
	public CThostFtdcReqChangeAccountField() {
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
	private CThostFtdcReqChangeAccountField PlateSerial(int PlateSerial) {
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
	private CThostFtdcReqChangeAccountField LastFragment(byte LastFragment) {
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
	private CThostFtdcReqChangeAccountField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}

	public void setSessionID(int sessionID) {
		SessionID(sessionID);
	}

	/**
	 * \u5ba2\u6237\u59d3\u540d
	 */
	@Array({51}) 
	@Field(12) 
	private Pointer<Byte> CustomerName() {
		return this.io.getPointerField(this, 12);
	}

	@Array({51})
	@Field(12)
	public void setCustomerName(String customerName) {
		this.io.getPointerField(this, 12).setCString(customerName);
	}

	public String getCustomerName() {
		return CustomerName().getCString();
	}

	/**
	 * \u8bc1\u4ef6\u7c7b\u578b
	 */
	@Field(13) 
	private byte IdCardType() {
		return this.io.getByteField(this, 13);
	}

	public char getIdCardType() {
		return (char)IdCardType();
	}

	/**
	 * \u8bc1\u4ef6\u7c7b\u578b
	 */
	@Field(13) 
	private CThostFtdcReqChangeAccountField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}

	public void setIdCardType(char idCardType) {
		IdCardType((byte)idCardType);
	}

	/**
	 * \u8bc1\u4ef6\u53f7\u7801
	 */
	@Array({51}) 
	@Field(14) 
	private Pointer<Byte> IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}

	@Array({51})
	@Field(14)
	public void setIdentifiedCardNo(String identifiedCardNo) {
		this.io.getPointerField(this, 14).setCString(identifiedCardNo);
	}

	public String getIdentifiedCardNo() {
		return IdentifiedCardNo().getCString();
	}

	/**
	 * \u6027\u522b
	 */
	@Field(15) 
	private byte Gender() {
		return this.io.getByteField(this, 15);
	}

	public char getGender() {
		return (char)Gender();
	}

	/**
	 * \u6027\u522b
	 */
	@Field(15) 
	private CThostFtdcReqChangeAccountField Gender(byte Gender) {
		this.io.setByteField(this, 15, Gender);
		return this;
	}

	public void setGender(char gender) {
		Gender((byte)gender);
	}

	/**
	 * \u56fd\u5bb6\u4ee3\u7801
	 */
	@Array({21}) 
	@Field(16) 
	private Pointer<Byte> CountryCode() {
		return this.io.getPointerField(this, 16);
	}

	@Array({21})
	@Field(16)
	public void setCountryCode(String countryCode) {
		this.io.getPointerField(this, 16).setCString(countryCode);
	}

	public String getCountryCode() {
		return CountryCode().getCString();
	}

	/**
	 * \u5ba2\u6237\u7c7b\u578b
	 */
	@Field(17) 
	private byte CustType() {
		return this.io.getByteField(this, 17);
	}

	public char getCustType() {
		return (char)CustType();
	}

	/**
	 * \u5ba2\u6237\u7c7b\u578b
	 */
	@Field(17) 
	private CThostFtdcReqChangeAccountField CustType(byte CustType) {
		this.io.setByteField(this, 17, CustType);
		return this;
	}

	public void setCustType(char custType) {
		CustType((byte)custType);
	}

	/**
	 * \u5730\u5740
	 */
	@Array({101}) 
	@Field(18) 
	private Pointer<Byte> Address() {
		return this.io.getPointerField(this, 18);
	}

	@Array({101})
	@Field(18)
	public void setAddress(String address) {
		this.io.getPointerField(this, 18).setCString(address);
	}

	public String getAddress() {
		return Address().getCString();
	}

	/**
	 * \u90ae\u7f16
	 */
	@Array({7}) 
	@Field(19) 
	private Pointer<Byte> ZipCode() {
		return this.io.getPointerField(this, 19);
	}

	@Array({7})
	@Field(19)
	public void setZipCode(String zipCode) {
		this.io.getPointerField(this, 19).setCString(zipCode);
	}

	public String getZipCode() {
		return ZipCode().getCString();
	}

	/**
	 * \u7535\u8bdd\u53f7\u7801
	 */
	@Array({41}) 
	@Field(20) 
	private Pointer<Byte> Telephone() {
		return this.io.getPointerField(this, 20);
	}

	@Array({41})
	@Field(20)
	public void setTelephone(String telephone) {
		this.io.getPointerField(this, 20).setCString(telephone);
	}

	public String getTelephone() {
		return Telephone().getCString();
	}

	/**
	 * \u624b\u673a
	 */
	@Array({21}) 
	@Field(21) 
	private Pointer<Byte> MobilePhone() {
		return this.io.getPointerField(this, 21);
	}

	@Array({21})
	@Field(21)
	public void setMobilePhone(String mobilePhone) {
		this.io.getPointerField(this, 21).setCString(mobilePhone);
	}

	public String getMobilePhone() {
		return MobilePhone().getCString();
	}

	/**
	 * \u4f20\u771f
	 */
	@Array({41}) 
	@Field(22) 
	private Pointer<Byte> Fax() {
		return this.io.getPointerField(this, 22);
	}

	@Array({41})
	@Field(22)
	public void setFax(String fax) {
		this.io.getPointerField(this, 22).setCString(fax);
	}

	public String getFax() {
		return Fax().getCString();
	}

	/**
	 * \u7535\u5b50\u90ae\u4ef6
	 */
	@Array({41}) 
	@Field(23) 
	private Pointer<Byte> EMail() {
		return this.io.getPointerField(this, 23);
	}

	@Array({41})
	@Field(23)
	public void setEMail(String eMail) {
		this.io.getPointerField(this, 23).setCString(eMail);
	}

	public String getEMail() {
		return EMail().getCString();
	}

	/**
	 * \u8d44\u91d1\u8d26\u6237\u72b6\u6001
	 */
	@Field(24) 
	private byte MoneyAccountStatus() {
		return this.io.getByteField(this, 24);
	}

	public char getMoneyAccountStatus() {
		return (char)MoneyAccountStatus();
	}

	/**
	 * \u8d44\u91d1\u8d26\u6237\u72b6\u6001
	 */
	@Field(24) 
	private CThostFtdcReqChangeAccountField MoneyAccountStatus(byte MoneyAccountStatus) {
		this.io.setByteField(this, 24, MoneyAccountStatus);
		return this;
	}

	public void setMoneyAccountStatus(char moneyAccountStatus) {
		MoneyAccountStatus((byte)moneyAccountStatus);
	}

	/**
	 * \u94f6\u884c\u5e10\u53f7
	 */
	@Array({41}) 
	@Field(25) 
	private Pointer<Byte> BankAccount() {
		return this.io.getPointerField(this, 25);
	}

	@Array({41})
	@Field(25)
	public void setBankAccount(String bankAccount) {
		this.io.getPointerField(this, 25).setCString(bankAccount);
	}

	public String getBankAccount() {
		return BankAccount().getCString();
	}

	/**
	 * \u94f6\u884c\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(26) 
	private Pointer<Byte> BankPassWord() {
		return this.io.getPointerField(this, 26);
	}

	@Array({41})
	@Field(26)
	public void setBankPassWord(String bankPassWord) {
		this.io.getPointerField(this, 26).setCString(bankPassWord);
	}

	public String getBankPassWord() {
		return BankPassWord().getCString();
	}

	/**
	 * \u65b0\u94f6\u884c\u5e10\u53f7
	 */
	@Array({41}) 
	@Field(27) 
	private Pointer<Byte> NewBankAccount() {
		return this.io.getPointerField(this, 27);
	}

	@Array({41})
	@Field(27)
	public void setNewBankAccount(String newBankAccount) {
		this.io.getPointerField(this, 27).setCString(newBankAccount);
	}

	public String getNewBankAccount() {
		return NewBankAccount().getCString();
	}

	/**
	 * \u65b0\u94f6\u884c\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(28) 
	private Pointer<Byte> NewBankPassWord() {
		return this.io.getPointerField(this, 28);
	}

	@Array({41})
	@Field(28)
	public void setNewBankPassWord(String newBankPassWord) {
		this.io.getPointerField(this, 28).setCString(newBankPassWord);
	}

	public String getNewBankPassWord() {
		return NewBankPassWord().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7
	 */
	@Array({13}) 
	@Field(29) 
	private Pointer<Byte> AccountID() {
		return this.io.getPointerField(this, 29);
	}

	@Array({13})
	@Field(29)
	public void setAccountID(String accountID) {
		this.io.getPointerField(this, 29).setCString(accountID);
	}

	public String getAccountID() {
		return AccountID().getCString();
	}

	/**
	 * \u671f\u8d27\u5bc6\u7801
	 */
	@Array({41}) 
	@Field(30) 
	private Pointer<Byte> Password() {
		return this.io.getPointerField(this, 30);
	}

	@Array({41})
	@Field(30)
	public void setPassword(String password) {
		this.io.getPointerField(this, 30).setCString(password);
	}

	public String getPassword() {
		return Password().getCString();
	}

	/**
	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b
	 */
	@Field(31) 
	private byte BankAccType() {
		return this.io.getByteField(this, 31);
	}

	public char getBankAccType() {
		return (char)BankAccType();
	}

	/**
	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b
	 */
	@Field(31) 
	private CThostFtdcReqChangeAccountField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 31, BankAccType);
		return this;
	}

	public void setBankAccType(char bankAccType) {
		BankAccType((byte)bankAccType);
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(32) 
	private int InstallID() {
		return this.io.getIntField(this, 32);
	}

	public int getInstallID() {
		return InstallID();
	}

	/**
	 * \u5b89\u88c5\u7f16\u53f7
	 */
	@Field(32) 
	private CThostFtdcReqChangeAccountField InstallID(int InstallID) {
		this.io.setIntField(this, 32, InstallID);
		return this;
	}

	public void setInstallID(int installID) {
		InstallID(installID);
	}

	/**
	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7
	 */
	@Field(33) 
	private byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 33);
	}

	public char getVerifyCertNoFlag() {
		return (char)VerifyCertNoFlag();
	}

	/**
	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7
	 */
	@Field(33) 
	private CThostFtdcReqChangeAccountField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 33, VerifyCertNoFlag);
		return this;
	}

	public void setVerifyCertNoFlag(char verifyCertNoFlag) {
		VerifyCertNoFlag((byte)verifyCertNoFlag);
	}

	/**
	 * \u5e01\u79cd\u4ee3\u7801
	 */
	@Array({4}) 
	@Field(34) 
	private Pointer<Byte> CurrencyID() {
		return this.io.getPointerField(this, 34);
	}

	@Array({4})
	@Field(34)
	public void setCurrencyID(String currencyID) {
		this.io.getPointerField(this, 34).setCString(currencyID);
	}

	public String getCurrencyID() {
		return CurrencyID().getCString();
	}

	/**
	 * \u671f\u8d27\u516c\u53f8\u94f6\u884c\u7f16\u7801
	 */
	@Array({33}) 
	@Field(35) 
	private Pointer<Byte> BrokerIDByBank() {
		return this.io.getPointerField(this, 35);
	}

	@Array({33})
	@Field(35)
	public void setBrokerIDByBank(String brokerIDByBank) {
		this.io.getPointerField(this, 35).setCString(brokerIDByBank);
	}

	public String getBrokerIDByBank() {
		return BrokerIDByBank().getCString();
	}

	/**
	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7
	 */
	@Field(36) 
	private byte BankPwdFlag() {
		return this.io.getByteField(this, 36);
	}

	public char getBankPwdFlag() {
		return (char)BankPwdFlag();
	}

	/**
	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7
	 */
	@Field(36) 
	private CThostFtdcReqChangeAccountField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 36, BankPwdFlag);
		return this;
	}

	public void setBankPwdFlag(char bankPwdFlag) {
		BankPwdFlag((byte)bankPwdFlag);
	}

	/**
	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7
	 */
	@Field(37) 
	private byte SecuPwdFlag() {
		return this.io.getByteField(this, 37);
	}

	public char getSecuPwdFlag() {
		return (char)SecuPwdFlag();
	}

	/**
	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7
	 */
	@Field(37) 
	private CThostFtdcReqChangeAccountField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 37, SecuPwdFlag);
		return this;
	}

	public void setSecuPwdFlag(char secuPwdFlag) {
		SecuPwdFlag((byte)secuPwdFlag);
	}

	/**
	 * \u4ea4\u6613ID
	 */
	@Field(38) 
	private int TID() {
		return this.io.getIntField(this, 38);
	}

	public int getTID() {
		return TID();
	}

	/**
	 * \u4ea4\u6613ID
	 */
	@Field(38) 
	private CThostFtdcReqChangeAccountField TID(int TID) {
		this.io.setIntField(this, 38, TID);
		return this;
	}

	public void setTID(int tID) {
		TID(tID);
	}

	/**
	 * \u6458\u8981
	 */
	@Array({36}) 
	@Field(39) 
	private Pointer<Byte> Digest() {
		return this.io.getPointerField(this, 39);
	}

	@Array({36})
	@Field(39)
	public void setDigest(String digest) {
		this.io.getPointerField(this, 39).setCString(digest);
	}

	public String getDigest() {
		return Digest().getCString();
	}

	public CThostFtdcReqChangeAccountField(Pointer pointer) {
		super(pointer);
	}

}

