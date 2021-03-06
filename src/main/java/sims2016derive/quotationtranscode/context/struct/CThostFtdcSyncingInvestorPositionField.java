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

public class CThostFtdcSyncingInvestorPositionField extends StructObject {
	public CThostFtdcSyncingInvestorPositionField() {
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
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(1) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({11})
	@Field(1)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 1).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(2) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({13})
	@Field(2)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 2).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u6301\u4ed3\u591a\u7a7a\u65b9\u5411
	 */
	@Field(3) 
	private byte PosiDirection() {
		return this.io.getByteField(this, 3);
	}

	public char getPosiDirection() {
		return (char)PosiDirection();
	}

	/**
	 * \u6301\u4ed3\u591a\u7a7a\u65b9\u5411
	 */
	@Field(3) 
	private CThostFtdcSyncingInvestorPositionField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 3, PosiDirection);
		return this;
	}

	public void setPosiDirection(char posiDirection) {
		PosiDirection((byte)posiDirection);
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
	private CThostFtdcSyncingInvestorPositionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}

	public void setHedgeFlag(char hedgeFlag) {
		HedgeFlag((byte)hedgeFlag);
	}

	/**
	 * \u6301\u4ed3\u65e5\u671f
	 */
	@Field(5) 
	private byte PositionDate() {
		return this.io.getByteField(this, 5);
	}

	public char getPositionDate() {
		return (char)PositionDate();
	}

	/**
	 * \u6301\u4ed3\u65e5\u671f
	 */
	@Field(5) 
	private CThostFtdcSyncingInvestorPositionField PositionDate(byte PositionDate) {
		this.io.setByteField(this, 5, PositionDate);
		return this;
	}

	public void setPositionDate(char positionDate) {
		PositionDate((byte)positionDate);
	}

	/**
	 * \u4e0a\u65e5\u6301\u4ed3
	 */
	@Field(6) 
	private int YdPosition() {
		return this.io.getIntField(this, 6);
	}

	public int getYdPosition() {
		return YdPosition();
	}

	/**
	 * \u4e0a\u65e5\u6301\u4ed3
	 */
	@Field(6) 
	private CThostFtdcSyncingInvestorPositionField YdPosition(int YdPosition) {
		this.io.setIntField(this, 6, YdPosition);
		return this;
	}

	public void setYdPosition(int ydPosition) {
		YdPosition(ydPosition);
	}

	/**
	 * \u4eca\u65e5\u6301\u4ed3
	 */
	@Field(7) 
	private int Position() {
		return this.io.getIntField(this, 7);
	}

	public int getPosition() {
		return Position();
	}

	/**
	 * \u4eca\u65e5\u6301\u4ed3
	 */
	@Field(7) 
	private CThostFtdcSyncingInvestorPositionField Position(int Position) {
		this.io.setIntField(this, 7, Position);
		return this;
	}

	public void setPosition(int position) {
		Position(position);
	}

	/**
	 * \u591a\u5934\u51bb\u7ed3
	 */
	@Field(8) 
	private int LongFrozen() {
		return this.io.getIntField(this, 8);
	}

	public int getLongFrozen() {
		return LongFrozen();
	}

	/**
	 * \u591a\u5934\u51bb\u7ed3
	 */
	@Field(8) 
	private CThostFtdcSyncingInvestorPositionField LongFrozen(int LongFrozen) {
		this.io.setIntField(this, 8, LongFrozen);
		return this;
	}

	public void setLongFrozen(int longFrozen) {
		LongFrozen(longFrozen);
	}

	/**
	 * \u7a7a\u5934\u51bb\u7ed3
	 */
	@Field(9) 
	private int ShortFrozen() {
		return this.io.getIntField(this, 9);
	}

	public int getShortFrozen() {
		return ShortFrozen();
	}

	/**
	 * \u7a7a\u5934\u51bb\u7ed3
	 */
	@Field(9) 
	private CThostFtdcSyncingInvestorPositionField ShortFrozen(int ShortFrozen) {
		this.io.setIntField(this, 9, ShortFrozen);
		return this;
	}

	public void setShortFrozen(int shortFrozen) {
		ShortFrozen(shortFrozen);
	}

	/**
	 * \u5f00\u4ed3\u51bb\u7ed3\u91d1\u989d
	 */
	@Field(10) 
	private double LongFrozenAmount() {
		return this.io.getDoubleField(this, 10);
	}

	public double getLongFrozenAmount() {
		return LongFrozenAmount();
	}

	/**
	 * \u5f00\u4ed3\u51bb\u7ed3\u91d1\u989d
	 */
	@Field(10) 
	private CThostFtdcSyncingInvestorPositionField LongFrozenAmount(double LongFrozenAmount) {
		this.io.setDoubleField(this, 10, LongFrozenAmount);
		return this;
	}

	public void setLongFrozenAmount(double longFrozenAmount) {
		LongFrozenAmount(longFrozenAmount);
	}

	/**
	 * \u5f00\u4ed3\u51bb\u7ed3\u91d1\u989d
	 */
	@Field(11) 
	private double ShortFrozenAmount() {
		return this.io.getDoubleField(this, 11);
	}

	public double getShortFrozenAmount() {
		return ShortFrozenAmount();
	}

	/**
	 * \u5f00\u4ed3\u51bb\u7ed3\u91d1\u989d
	 */
	@Field(11) 
	private CThostFtdcSyncingInvestorPositionField ShortFrozenAmount(double ShortFrozenAmount) {
		this.io.setDoubleField(this, 11, ShortFrozenAmount);
		return this;
	}

	public void setShortFrozenAmount(double shortFrozenAmount) {
		ShortFrozenAmount(shortFrozenAmount);
	}

	/**
	 * \u5f00\u4ed3\u91cf
	 */
	@Field(12) 
	private int OpenVolume() {
		return this.io.getIntField(this, 12);
	}

	public int getOpenVolume() {
		return OpenVolume();
	}

	/**
	 * \u5f00\u4ed3\u91cf
	 */
	@Field(12) 
	private CThostFtdcSyncingInvestorPositionField OpenVolume(int OpenVolume) {
		this.io.setIntField(this, 12, OpenVolume);
		return this;
	}

	public void setOpenVolume(int openVolume) {
		OpenVolume(openVolume);
	}

	/**
	 * \u5e73\u4ed3\u91cf
	 */
	@Field(13) 
	private int CloseVolume() {
		return this.io.getIntField(this, 13);
	}

	public int getCloseVolume() {
		return CloseVolume();
	}

	/**
	 * \u5e73\u4ed3\u91cf
	 */
	@Field(13) 
	private CThostFtdcSyncingInvestorPositionField CloseVolume(int CloseVolume) {
		this.io.setIntField(this, 13, CloseVolume);
		return this;
	}

	public void setCloseVolume(int closeVolume) {
		CloseVolume(closeVolume);
	}

	/**
	 * \u5f00\u4ed3\u91d1\u989d
	 */
	@Field(14) 
	private double OpenAmount() {
		return this.io.getDoubleField(this, 14);
	}

	public double getOpenAmount() {
		return OpenAmount();
	}

	/**
	 * \u5f00\u4ed3\u91d1\u989d
	 */
	@Field(14) 
	private CThostFtdcSyncingInvestorPositionField OpenAmount(double OpenAmount) {
		this.io.setDoubleField(this, 14, OpenAmount);
		return this;
	}

	public void setOpenAmount(double openAmount) {
		OpenAmount(openAmount);
	}

	/**
	 * \u5e73\u4ed3\u91d1\u989d
	 */
	@Field(15) 
	private double CloseAmount() {
		return this.io.getDoubleField(this, 15);
	}

	public double getCloseAmount() {
		return CloseAmount();
	}

	/**
	 * \u5e73\u4ed3\u91d1\u989d
	 */
	@Field(15) 
	private CThostFtdcSyncingInvestorPositionField CloseAmount(double CloseAmount) {
		this.io.setDoubleField(this, 15, CloseAmount);
		return this;
	}

	public void setCloseAmount(double closeAmount) {
		CloseAmount(closeAmount);
	}

	/**
	 * \u6301\u4ed3\u6210\u672c
	 */
	@Field(16) 
	private double PositionCost() {
		return this.io.getDoubleField(this, 16);
	}

	public double getPositionCost() {
		return PositionCost();
	}

	/**
	 * \u6301\u4ed3\u6210\u672c
	 */
	@Field(16) 
	private CThostFtdcSyncingInvestorPositionField PositionCost(double PositionCost) {
		this.io.setDoubleField(this, 16, PositionCost);
		return this;
	}

	public void setPositionCost(double positionCost) {
		PositionCost(positionCost);
	}

	/**
	 * \u4e0a\u6b21\u5360\u7528\u7684\u4fdd\u8bc1\u91d1
	 */
	@Field(17) 
	private double PreMargin() {
		return this.io.getDoubleField(this, 17);
	}

	public double getPreMargin() {
		return PreMargin();
	}

	/**
	 * \u4e0a\u6b21\u5360\u7528\u7684\u4fdd\u8bc1\u91d1
	 */
	@Field(17) 
	private CThostFtdcSyncingInvestorPositionField PreMargin(double PreMargin) {
		this.io.setDoubleField(this, 17, PreMargin);
		return this;
	}

	public void setPreMargin(double preMargin) {
		PreMargin(preMargin);
	}

	/**
	 * \u5360\u7528\u7684\u4fdd\u8bc1\u91d1
	 */
	@Field(18) 
	private double UseMargin() {
		return this.io.getDoubleField(this, 18);
	}

	public double getUseMargin() {
		return UseMargin();
	}

	/**
	 * \u5360\u7528\u7684\u4fdd\u8bc1\u91d1
	 */
	@Field(18) 
	private CThostFtdcSyncingInvestorPositionField UseMargin(double UseMargin) {
		this.io.setDoubleField(this, 18, UseMargin);
		return this;
	}

	public void setUseMargin(double useMargin) {
		UseMargin(useMargin);
	}

	/**
	 * \u51bb\u7ed3\u7684\u4fdd\u8bc1\u91d1
	 */
	@Field(19) 
	private double FrozenMargin() {
		return this.io.getDoubleField(this, 19);
	}

	public double getFrozenMargin() {
		return FrozenMargin();
	}

	/**
	 * \u51bb\u7ed3\u7684\u4fdd\u8bc1\u91d1
	 */
	@Field(19) 
	private CThostFtdcSyncingInvestorPositionField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 19, FrozenMargin);
		return this;
	}

	public void setFrozenMargin(double frozenMargin) {
		FrozenMargin(frozenMargin);
	}

	/**
	 * \u51bb\u7ed3\u7684\u8d44\u91d1
	 */
	@Field(20) 
	private double FrozenCash() {
		return this.io.getDoubleField(this, 20);
	}

	public double getFrozenCash() {
		return FrozenCash();
	}

	/**
	 * \u51bb\u7ed3\u7684\u8d44\u91d1
	 */
	@Field(20) 
	private CThostFtdcSyncingInvestorPositionField FrozenCash(double FrozenCash) {
		this.io.setDoubleField(this, 20, FrozenCash);
		return this;
	}

	public void setFrozenCash(double frozenCash) {
		FrozenCash(frozenCash);
	}

	/**
	 * \u51bb\u7ed3\u7684\u624b\u7eed\u8d39
	 */
	@Field(21) 
	private double FrozenCommission() {
		return this.io.getDoubleField(this, 21);
	}

	public double getFrozenCommission() {
		return FrozenCommission();
	}

	/**
	 * \u51bb\u7ed3\u7684\u624b\u7eed\u8d39
	 */
	@Field(21) 
	private CThostFtdcSyncingInvestorPositionField FrozenCommission(double FrozenCommission) {
		this.io.setDoubleField(this, 21, FrozenCommission);
		return this;
	}

	public void setFrozenCommission(double frozenCommission) {
		FrozenCommission(frozenCommission);
	}

	/**
	 * \u8d44\u91d1\u5dee\u989d
	 */
	@Field(22) 
	private double CashIn() {
		return this.io.getDoubleField(this, 22);
	}

	public double getCashIn() {
		return CashIn();
	}

	/**
	 * \u8d44\u91d1\u5dee\u989d
	 */
	@Field(22) 
	private CThostFtdcSyncingInvestorPositionField CashIn(double CashIn) {
		this.io.setDoubleField(this, 22, CashIn);
		return this;
	}

	public void setCashIn(double cashIn) {
		CashIn(cashIn);
	}

	/**
	 * \u624b\u7eed\u8d39
	 */
	@Field(23) 
	private double Commission() {
		return this.io.getDoubleField(this, 23);
	}

	public double getCommission() {
		return Commission();
	}

	/**
	 * \u624b\u7eed\u8d39
	 */
	@Field(23) 
	private CThostFtdcSyncingInvestorPositionField Commission(double Commission) {
		this.io.setDoubleField(this, 23, Commission);
		return this;
	}

	public void setCommission(double commission) {
		Commission(commission);
	}

	/**
	 * \u5e73\u4ed3\u76c8\u4e8f
	 */
	@Field(24) 
	private double CloseProfit() {
		return this.io.getDoubleField(this, 24);
	}

	public double getCloseProfit() {
		return CloseProfit();
	}

	/**
	 * \u5e73\u4ed3\u76c8\u4e8f
	 */
	@Field(24) 
	private CThostFtdcSyncingInvestorPositionField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 24, CloseProfit);
		return this;
	}

	public void setCloseProfit(double closeProfit) {
		CloseProfit(closeProfit);
	}

	/**
	 * \u6301\u4ed3\u76c8\u4e8f
	 */
	@Field(25) 
	private double PositionProfit() {
		return this.io.getDoubleField(this, 25);
	}

	public double getPositionProfit() {
		return PositionProfit();
	}

	/**
	 * \u6301\u4ed3\u76c8\u4e8f
	 */
	@Field(25) 
	private CThostFtdcSyncingInvestorPositionField PositionProfit(double PositionProfit) {
		this.io.setDoubleField(this, 25, PositionProfit);
		return this;
	}

	public void setPositionProfit(double positionProfit) {
		PositionProfit(positionProfit);
	}

	/**
	 * \u4e0a\u6b21\u7ed3\u7b97\u4ef7
	 */
	@Field(26) 
	private double PreSettlementPrice() {
		return this.io.getDoubleField(this, 26);
	}

	public double getPreSettlementPrice() {
		return PreSettlementPrice();
	}

	/**
	 * \u4e0a\u6b21\u7ed3\u7b97\u4ef7
	 */
	@Field(26) 
	private CThostFtdcSyncingInvestorPositionField PreSettlementPrice(double PreSettlementPrice) {
		this.io.setDoubleField(this, 26, PreSettlementPrice);
		return this;
	}

	public void setPreSettlementPrice(double preSettlementPrice) {
		PreSettlementPrice(preSettlementPrice);
	}

	/**
	 * \u672c\u6b21\u7ed3\u7b97\u4ef7
	 */
	@Field(27) 
	private double SettlementPrice() {
		return this.io.getDoubleField(this, 27);
	}

	public double getSettlementPrice() {
		return SettlementPrice();
	}

	/**
	 * \u672c\u6b21\u7ed3\u7b97\u4ef7
	 */
	@Field(27) 
	private CThostFtdcSyncingInvestorPositionField SettlementPrice(double SettlementPrice) {
		this.io.setDoubleField(this, 27, SettlementPrice);
		return this;
	}

	public void setSettlementPrice(double settlementPrice) {
		SettlementPrice(settlementPrice);
	}

	/**
	 * \u4ea4\u6613\u65e5
	 */
	@Array({9}) 
	@Field(28) 
	private Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 28);
	}

	@Array({9})
	@Field(28)
	public void setTradingDay(String tradingDay) {
		this.io.getPointerField(this, 28).setCString(tradingDay);
	}

	public String getTradingDay() {
		return TradingDay().getCString();
	}

	/**
	 * \u7ed3\u7b97\u7f16\u53f7
	 */
	@Field(29) 
	private int SettlementID() {
		return this.io.getIntField(this, 29);
	}

	public int getSettlementID() {
		return SettlementID();
	}

	/**
	 * \u7ed3\u7b97\u7f16\u53f7
	 */
	@Field(29) 
	private CThostFtdcSyncingInvestorPositionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 29, SettlementID);
		return this;
	}

	public void setSettlementID(int settlementID) {
		SettlementID(settlementID);
	}

	/**
	 * \u5f00\u4ed3\u6210\u672c
	 */
	@Field(30) 
	private double OpenCost() {
		return this.io.getDoubleField(this, 30);
	}

	public double getOpenCost() {
		return OpenCost();
	}

	/**
	 * \u5f00\u4ed3\u6210\u672c
	 */
	@Field(30) 
	private CThostFtdcSyncingInvestorPositionField OpenCost(double OpenCost) {
		this.io.setDoubleField(this, 30, OpenCost);
		return this;
	}

	public void setOpenCost(double openCost) {
		OpenCost(openCost);
	}

	/**
	 * \u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1
	 */
	@Field(31) 
	private double ExchangeMargin() {
		return this.io.getDoubleField(this, 31);
	}

	public double getExchangeMargin() {
		return ExchangeMargin();
	}

	/**
	 * \u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1
	 */
	@Field(31) 
	private CThostFtdcSyncingInvestorPositionField ExchangeMargin(double ExchangeMargin) {
		this.io.setDoubleField(this, 31, ExchangeMargin);
		return this;
	}

	public void setExchangeMargin(double exchangeMargin) {
		ExchangeMargin(exchangeMargin);
	}

	/**
	 * \u7ec4\u5408\u6210\u4ea4\u5f62\u6210\u7684\u6301\u4ed3
	 */
	@Field(32) 
	private int CombPosition() {
		return this.io.getIntField(this, 32);
	}

	public int getCombPosition() {
		return CombPosition();
	}

	/**
	 * \u7ec4\u5408\u6210\u4ea4\u5f62\u6210\u7684\u6301\u4ed3
	 */
	@Field(32) 
	private CThostFtdcSyncingInvestorPositionField CombPosition(int CombPosition) {
		this.io.setIntField(this, 32, CombPosition);
		return this;
	}

	public void setCombPosition(int combPosition) {
		CombPosition(combPosition);
	}

	/**
	 * \u7ec4\u5408\u591a\u5934\u51bb\u7ed3
	 */
	@Field(33) 
	private int CombLongFrozen() {
		return this.io.getIntField(this, 33);
	}

	public int getCombLongFrozen() {
		return CombLongFrozen();
	}

	/**
	 * \u7ec4\u5408\u591a\u5934\u51bb\u7ed3
	 */
	@Field(33) 
	private CThostFtdcSyncingInvestorPositionField CombLongFrozen(int CombLongFrozen) {
		this.io.setIntField(this, 33, CombLongFrozen);
		return this;
	}

	public void setCombLongFrozen(int combLongFrozen) {
		CombLongFrozen(combLongFrozen);
	}

	/**
	 * \u7ec4\u5408\u7a7a\u5934\u51bb\u7ed3
	 */
	@Field(34) 
	private int CombShortFrozen() {
		return this.io.getIntField(this, 34);
	}

	public int getCombShortFrozen() {
		return CombShortFrozen();
	}

	/**
	 * \u7ec4\u5408\u7a7a\u5934\u51bb\u7ed3
	 */
	@Field(34) 
	private CThostFtdcSyncingInvestorPositionField CombShortFrozen(int CombShortFrozen) {
		this.io.setIntField(this, 34, CombShortFrozen);
		return this;
	}

	public void setCombShortFrozen(int combShortFrozen) {
		CombShortFrozen(combShortFrozen);
	}

	/**
	 * \u9010\u65e5\u76ef\u5e02\u5e73\u4ed3\u76c8\u4e8f
	 */
	@Field(35) 
	private double CloseProfitByDate() {
		return this.io.getDoubleField(this, 35);
	}

	public double getCloseProfitByDate() {
		return CloseProfitByDate();
	}

	/**
	 * \u9010\u65e5\u76ef\u5e02\u5e73\u4ed3\u76c8\u4e8f
	 */
	@Field(35) 
	private CThostFtdcSyncingInvestorPositionField CloseProfitByDate(double CloseProfitByDate) {
		this.io.setDoubleField(this, 35, CloseProfitByDate);
		return this;
	}

	public void setCloseProfitByDate(double closeProfitByDate) {
		CloseProfitByDate(closeProfitByDate);
	}

	/**
	 * \u9010\u7b14\u5bf9\u51b2\u5e73\u4ed3\u76c8\u4e8f
	 */
	@Field(36) 
	private double CloseProfitByTrade() {
		return this.io.getDoubleField(this, 36);
	}

	public double getCloseProfitByTrade() {
		return CloseProfitByTrade();
	}

	/**
	 * \u9010\u7b14\u5bf9\u51b2\u5e73\u4ed3\u76c8\u4e8f
	 */
	@Field(36) 
	private CThostFtdcSyncingInvestorPositionField CloseProfitByTrade(double CloseProfitByTrade) {
		this.io.setDoubleField(this, 36, CloseProfitByTrade);
		return this;
	}

	public void setCloseProfitByTrade(double closeProfitByTrade) {
		CloseProfitByTrade(closeProfitByTrade);
	}

	/**
	 * \u4eca\u65e5\u6301\u4ed3
	 */
	@Field(37) 
	private int TodayPosition() {
		return this.io.getIntField(this, 37);
	}

	public int getTodayPosition() {
		return TodayPosition();
	}

	/**
	 * \u4eca\u65e5\u6301\u4ed3
	 */
	@Field(37) 
	private CThostFtdcSyncingInvestorPositionField TodayPosition(int TodayPosition) {
		this.io.setIntField(this, 37, TodayPosition);
		return this;
	}

	public void setTodayPosition(int todayPosition) {
		TodayPosition(todayPosition);
	}

	/**
	 * \u4fdd\u8bc1\u91d1\u7387
	 */
	@Field(38) 
	private double MarginRateByMoney() {
		return this.io.getDoubleField(this, 38);
	}

	public double getMarginRateByMoney() {
		return MarginRateByMoney();
	}

	/**
	 * \u4fdd\u8bc1\u91d1\u7387
	 */
	@Field(38) 
	private CThostFtdcSyncingInvestorPositionField MarginRateByMoney(double MarginRateByMoney) {
		this.io.setDoubleField(this, 38, MarginRateByMoney);
		return this;
	}

	public void setMarginRateByMoney(double marginRateByMoney) {
		MarginRateByMoney(marginRateByMoney);
	}

	/**
	 * \u4fdd\u8bc1\u91d1\u7387(\u6309\u624b\u6570)
	 */
	@Field(39) 
	private double MarginRateByVolume() {
		return this.io.getDoubleField(this, 39);
	}

	public double getMarginRateByVolume() {
		return MarginRateByVolume();
	}

	/**
	 * \u4fdd\u8bc1\u91d1\u7387(\u6309\u624b\u6570)
	 */
	@Field(39) 
	private CThostFtdcSyncingInvestorPositionField MarginRateByVolume(double MarginRateByVolume) {
		this.io.setDoubleField(this, 39, MarginRateByVolume);
		return this;
	}

	public void setMarginRateByVolume(double marginRateByVolume) {
		MarginRateByVolume(marginRateByVolume);
	}

	public CThostFtdcSyncingInvestorPositionField(Pointer pointer) {
		super(pointer);
	}

}

