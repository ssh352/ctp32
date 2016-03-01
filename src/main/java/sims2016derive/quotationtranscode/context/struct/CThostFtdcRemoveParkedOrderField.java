package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcRemoveParkedOrderField extends StructObject {
	public CThostFtdcRemoveParkedOrderField() {
		super();
	}

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

	@Array({13}) 
	@Field(2) 
	private Pointer<Byte> ParkedOrderID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({13})
	@Field(2)
	public void setParkedOrderID(String parkedOrderID) {
		this.io.getPointerField(this, 2).setCString(parkedOrderID);
	}

	public String getParkedOrderID() {
		return ParkedOrderID().getCString();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
    public CThostFtdcRemoveParkedOrderField(Pointer pointer) {
		super(pointer);
	}

}

