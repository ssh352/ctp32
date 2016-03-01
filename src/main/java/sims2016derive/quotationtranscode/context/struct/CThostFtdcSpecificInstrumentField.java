package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcSpecificInstrumentField extends StructObject {
	public CThostFtdcSpecificInstrumentField() {
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
    public CThostFtdcSpecificInstrumentField(Pointer pointer) {
		super(pointer);
	}
}

