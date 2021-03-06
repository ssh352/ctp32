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

public class CThostFtdcTradeField extends StructObject {
	public CThostFtdcTradeField() {
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
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(1) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13})
	@Field(1)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 1).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u5408\u7ea6\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(2) 
	private Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({31})
	@Field(2)
	public void setInstrumentID(String instrumentID) {
		this.io.getPointerField(this, 2).setCString(instrumentID);
	}

	public String getInstrumentID() {
		return InstrumentID().getCString();
	}

	/**
	 * \u62a5\u5355\u5f15\u7528
	 */
	@Array({13}) 
	@Field(3) 
	private Pointer<Byte> OrderRef() {
		return this.io.getPointerField(this, 3);
	}

	@Array({13})
	@Field(3)
	public void setOrderRef(String orderRef) {
		this.io.getPointerField(this, 3).setCString(orderRef);
	}

	public String getOrderRef() {
		return OrderRef().getCString();
	}

	/**
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(4) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 4);
	}

	@Array({16})
	@Field(4)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 4).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801
	 */
	@Array({9}) 
	@Field(5) 
	private Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 5);
	}

	@Array({9})
	@Field(5)
	public void setExchangeID(String exchangeID) {
		this.io.getPointerField(this, 5).setCString(exchangeID);
	}

	public String getExchangeID() {
		return ExchangeID().getCString();
	}

	/**
	 * \u6210\u4ea4\u7f16\u53f7
	 */
	@Array({21}) 
	@Field(6) 
	private Pointer<Byte> TradeID() {
		return this.io.getPointerField(this, 6);
	}

	@Array({21})
	@Field(6)
	public void setTradeID(String tradeID) {
		this.io.getPointerField(this, 6).setCString(tradeID);
	}

	public String getTradeID() {
		return TradeID().getCString();
	}

	/**
	 * \u4e70\u5356\u65b9\u5411
	 */
	@Field(7) 
	private byte Direction() {
		return this.io.getByteField(this, 7);
	}

	public char getDirection() {
		return (char)Direction();
	}

	/**
	 * \u4e70\u5356\u65b9\u5411
	 */
	@Field(7) 
	private CThostFtdcTradeField Direction(byte Direction) {
		this.io.setByteField(this, 7, Direction);
		return this;
	}

	public void setDirection(char direction) {
		Direction((byte)direction);
	}

	/**
	 * \u62a5\u5355\u7f16\u53f7
	 */
	@Array({21}) 
	@Field(8) 
	private Pointer<Byte> OrderSysID() {
		return this.io.getPointerField(this, 8);
	}

	@Array({21})
	@Field(8)
	public void setOrderSysID(String orderSysID) {
		this.io.getPointerField(this, 8).setCString(orderSysID);
	}

	public String getOrderSysID() {
		return OrderSysID().getCString();
	}

	/**
	 * \u4f1a\u5458\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(9) 
	private Pointer<Byte> ParticipantID() {
		return this.io.getPointerField(this, 9);
	}

	@Array({11})
	@Field(9)
	public void setParticipantID(String participantID) {
		this.io.getPointerField(this, 9).setCString(participantID);
	}

	public String getParticipantID() {
		return ParticipantID().getCString();
	}

	/**
	 * \u5ba2\u6237\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(10) 
	private Pointer<Byte> ClientID() {
		return this.io.getPointerField(this, 10);
	}

	@Array({11})
	@Field(10)
	public void setClientID(String clientID) {
		this.io.getPointerField(this, 10).setCString(clientID);
	}

	public String getClientID() {
		return ClientID().getCString();
	}

	/**
	 * \u4ea4\u6613\u89d2\u8272
	 */
	@Field(11) 
	private byte TradingRole() {
		return this.io.getByteField(this, 11);
	}

	public char getTradingRole() {
		return (char)TradingRole();
	}

	/**
	 * \u4ea4\u6613\u89d2\u8272
	 */
	@Field(11) 
	private CThostFtdcTradeField TradingRole(byte TradingRole) {
		this.io.setByteField(this, 11, TradingRole);
		return this;
	}

	public void setTradingRole(char tradingRole) {
		TradingRole((byte)tradingRole);
	}

	/**
	 * \u5408\u7ea6\u5728\u4ea4\u6613\u6240\u7684\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(12) 
	private Pointer<Byte> ExchangeInstID() {
		return this.io.getPointerField(this, 12);
	}

	@Array({31})
	@Field(12)
	public void setExchangeInstID(String exchangeInstID) {
		this.io.getPointerField(this, 12).setCString(exchangeInstID);
	}

	public String getExchangeInstID() {
		return ExchangeInstID().getCString();
	}

	/**
	 * \u5f00\u5e73\u6807\u5fd7
	 */
	@Field(13) 
	private byte OffsetFlag() {
		return this.io.getByteField(this, 13);
	}

	public char getOffsetFlag() {
		return (char)OffsetFlag();
	}

	/**
	 * \u5f00\u5e73\u6807\u5fd7
	 */
	@Field(13) 
	private CThostFtdcTradeField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 13, OffsetFlag);
		return this;
	}

	public void setOffsetFlag(char offsetFlag) {
		OffsetFlag((byte)offsetFlag);
	}

	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7
	 */
	@Field(14) 
	private byte HedgeFlag() {
		return this.io.getByteField(this, 14);
	}

	public char getHedgeFlag() {
		return (char)HedgeFlag();
	}

	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7
	 */
	@Field(14) 
	private CThostFtdcTradeField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 14, HedgeFlag);
		return this;
	}

	public void setHedgeFlag(char hedgeFlag) {
		HedgeFlag((byte)hedgeFlag);
	}

	/**
	 * \u4ef7\u683c
	 */
	@Field(15) 
	private double Price() {
		return this.io.getDoubleField(this, 15);
	}

	public double getPrice() {
		return Price();
	}

	/**
	 * \u4ef7\u683c
	 */
	@Field(15) 
	private CThostFtdcTradeField Price(double Price) {
		this.io.setDoubleField(this, 15, Price);
		return this;
	}

	public void setPrice(double price) {
		Price(price);
	}

	/**
	 * \u6570\u91cf
	 */
	@Field(16) 
	private int Volume() {
		return this.io.getIntField(this, 16);
	}

	public int getVolume() {
		return Volume();
	}

	/**
	 * \u6570\u91cf
	 */
	@Field(16) 
	private CThostFtdcTradeField Volume(int Volume) {
		this.io.setIntField(this, 16, Volume);
		return this;
	}

	public void setVolume(int volume) {
		Volume(volume);
	}

	/**
	 * \u6210\u4ea4\u65f6\u671f
	 */
	@Array({9}) 
	@Field(17) 
	private Pointer<Byte> TradeDate() {
		return this.io.getPointerField(this, 17);
	}

	@Array({9})
	@Field(17)
	public void setTradeDate(String tradeDate) {
		this.io.getPointerField(this, 17).setCString(tradeDate);
	}

	public String getTradeDate() {
		return TradeDate().getCString();
	}

	/**
	 * \u6210\u4ea4\u65f6\u95f4
	 */
	@Array({9}) 
	@Field(18) 
	private Pointer<Byte> TradeTime() {
		return this.io.getPointerField(this, 18);
	}

	@Array({9})
	@Field(18)
	public void setTradeTime(String tradeTime) {
		this.io.getPointerField(this, 18).setCString(tradeTime);
	}

	public String getTradeTime() {
		return TradeTime().getCString();
	}

	/**
	 * \u6210\u4ea4\u7c7b\u578b
	 */
	@Field(19) 
	private byte TradeType() {
		return this.io.getByteField(this, 19);
	}

	public char getTradeType() {
		return (char)TradeType();
	}

	/**
	 * \u6210\u4ea4\u7c7b\u578b
	 */
	@Field(19) 
	private CThostFtdcTradeField TradeType(byte TradeType) {
		this.io.setByteField(this, 19, TradeType);
		return this;
	}

	public void setTradeType(char tradeType) {
		TradeType((byte)tradeType);
	}

	/**
	 * \u6210\u4ea4\u4ef7\u6765\u6e90
	 */
	@Field(20) 
	private byte PriceSource() {
		return this.io.getByteField(this, 20);
	}

	public char getPriceSource() {
		return (char)PriceSource();
	}

	/**
	 * \u6210\u4ea4\u4ef7\u6765\u6e90
	 */
	@Field(20) 
	private CThostFtdcTradeField PriceSource(byte PriceSource) {
		this.io.setByteField(this, 20, PriceSource);
		return this;
	}

	public void setPriceSource(char priceSource) {
		PriceSource((byte)priceSource);
	}

	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801
	 */
	@Array({21}) 
	@Field(21) 
	private Pointer<Byte> TraderID() {
		return this.io.getPointerField(this, 21);
	}

	@Array({21})
	@Field(21)
	public void setTraderID(String traderID) {
		this.io.getPointerField(this, 21).setCString(traderID);
	}

	public String getTraderID() {
		return TraderID().getCString();
	}

	/**
	 * \u672c\u5730\u62a5\u5355\u7f16\u53f7
	 */
	@Array({13}) 
	@Field(22) 
	private Pointer<Byte> OrderLocalID() {
		return this.io.getPointerField(this, 22);
	}

	@Array({13})
	@Field(22)
	public void setOrderLocalID(String orderLocalID) {
		this.io.getPointerField(this, 22).setCString(orderLocalID);
	}

	public String getOrderLocalID() {
		return OrderLocalID().getCString();
	}

	/**
	 * \u7ed3\u7b97\u4f1a\u5458\u7f16\u53f7
	 */
	@Array({11}) 
	@Field(23) 
	private Pointer<Byte> ClearingPartID() {
		return this.io.getPointerField(this, 23);
	}

	@Array({11})
	@Field(23)
	public void setClearingPartID(String clearingPartID) {
		this.io.getPointerField(this, 23).setCString(clearingPartID);
	}

	public String getClearingPartID() {
		return ClearingPartID().getCString();
	}

	/**
	 * \u4e1a\u52a1\u5355\u5143
	 */
	@Array({21}) 
	@Field(24) 
	private Pointer<Byte> BusinessUnit() {
		return this.io.getPointerField(this, 24);
	}

	@Array({21})
	@Field(24)
	public void setBusinessUnit(String businessUnit) {
		this.io.getPointerField(this, 24).setCString(businessUnit);
	}

	public String getBusinessUnit() {
		return BusinessUnit().getCString();
	}

	/**
	 * \u5e8f\u53f7
	 */
	@Field(25) 
	private int SequenceNo() {
		return this.io.getIntField(this, 25);
	}

	public int getSequenceNo() {
		return SequenceNo();
	}

	/**
	 * \u5e8f\u53f7
	 */
	@Field(25) 
	private CThostFtdcTradeField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 25, SequenceNo);
		return this;
	}

	public void setSequenceNo(int sequenceNo) {
		SequenceNo(sequenceNo);
	}

	/**
	 * \u4ea4\u6613\u65e5
	 */
	@Array({9}) 
	@Field(26) 
	private Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 26);
	}

	@Array({9})
	@Field(26)
	public void setTradingDay(String tradingDay) {
		this.io.getPointerField(this, 26).setCString(tradingDay);
	}

	public String getTradingDay() {
		return TradingDay().getCString();
	}

	/**
	 * \u7ed3\u7b97\u7f16\u53f7
	 */
	@Field(27) 
	private int SettlementID() {
		return this.io.getIntField(this, 27);
	}

	public int getSettlementID() {
		return SettlementID();
	}

	/**
	 * \u7ed3\u7b97\u7f16\u53f7
	 */
	@Field(27) 
	private CThostFtdcTradeField SettlementID(int SettlementID) {
		this.io.setIntField(this, 27, SettlementID);
		return this;
	}

	public void setSettlementID(int settlementID) {
		SettlementID(settlementID);
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u62a5\u5355\u7f16\u53f7
	 */
	@Field(28) 
	private int BrokerOrderSeq() {
		return this.io.getIntField(this, 28);
	}

	public int getBrokerOrderSeq() {
		return BrokerOrderSeq();
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u62a5\u5355\u7f16\u53f7
	 */
	@Field(28) 
	private CThostFtdcTradeField BrokerOrderSeq(int BrokerOrderSeq) {
		this.io.setIntField(this, 28, BrokerOrderSeq);
		return this;
	}

	public void setBrokerOrderSeq(int brokerOrderSeq) {
		BrokerOrderSeq(brokerOrderSeq);
	}

	/**
	 * \u6210\u4ea4\u6765\u6e90
	 */
	@Field(29) 
	private byte TradeSource() {
		return this.io.getByteField(this, 29);
	}

	public char getTradeSource() {
		return (char)TradeSource();
	}

	/**
	 * \u6210\u4ea4\u6765\u6e90
	 */
	@Field(29) 
	private CThostFtdcTradeField TradeSource(byte TradeSource) {
		this.io.setByteField(this, 29, TradeSource);
		return this;
	}

	public void setTradeSource(char tradeSource) {
		TradeSource((byte)tradeSource);
	}

	public CThostFtdcTradeField(Pointer pointer) {
		super(pointer);
	}

}

