package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcAuthenticationInfoField extends StructObject {
	public CThostFtdcAuthenticationInfoField() {
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
	 * \u7528\u6237\u4ee3\u7801
	 */
	@Array({16}) 
	@Field(1) 
	private Pointer<Byte> UserID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({16})
	@Field(1)
	public void setUserID(String userID) {
		this.io.getPointerField(this, 1).setCString(userID);
	}

	public String getUserID() {
		return UserID().getCString();
	}

	/**
	 * \u7528\u6237\u7aef\u4ea7\u54c1\u4fe1\u606f
	 */
	@Array({11}) 
	@Field(2) 
	private Pointer<Byte> UserProductInfo() {
		return this.io.getPointerField(this, 2);
	}

	@Array({11})
	@Field(2)
	public void setUserProductInfo(String userProductInfo) {
		this.io.getPointerField(this, 2).setCString(userProductInfo);
	}

	public String getUserProductInfo() {
		return UserProductInfo().getCString();
	}

	/**
	 * \u8ba4\u8bc1\u4fe1\u606f
	 */
	@Array({129}) 
	@Field(3) 
	private Pointer<Byte> AuthInfo() {
		return this.io.getPointerField(this, 3);
	}

	@Array({129})
	@Field(3)
	public void setAuthInfo(String authInfo) {
		this.io.getPointerField(this, 3).setCString(authInfo);
	}

	public String getAuthInfo() {
		return AuthInfo().getCString();
	}

	/**
	 * \u662f\u5426\u4e3a\u8ba4\u8bc1\u7ed3\u679c
	 */
	@Field(4) 
	private int IsResult() {
		return this.io.getIntField(this, 4);
	}

	public int getIsResult() {
		return IsResult();
	}

	/**
	 * \u662f\u5426\u4e3a\u8ba4\u8bc1\u7ed3\u679c
	 */
	@Field(4) 
	private CThostFtdcAuthenticationInfoField IsResult(int IsResult) {
		this.io.setIntField(this, 4, IsResult);
		return this;
	}

	public void setIsResult(int isResult) {
		IsResult(isResult);
	}

	public CThostFtdcAuthenticationInfoField(Pointer pointer) {
		super(pointer);
	}

}

