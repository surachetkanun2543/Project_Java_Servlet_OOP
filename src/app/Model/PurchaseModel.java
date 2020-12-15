package app.Model;

public class PurchaseModel {

	private int PURCHASE_ID;
	private int SUPPLIER_ID;
	private int GOOD_ID;
	private String PURCHASE_DATE;
	private String RECEIVE_DATE;
	private String STATUS;
	private String QUANTITY;
	private String TOTAL_AMOUNT;

	public PurchaseModel() {
		super();
		this.PURCHASE_ID = PURCHASE_ID;
		this.SUPPLIER_ID = SUPPLIER_ID;
		this.PURCHASE_DATE = PURCHASE_DATE;
		this.STATUS = STATUS;
		this.RECEIVE_DATE = RECEIVE_DATE;
		this.TOTAL_AMOUNT = TOTAL_AMOUNT;
		this.GOOD_ID = GOOD_ID;
		this.QUANTITY = QUANTITY;
	}

	public int getPURCHASE_ID() {
		return PURCHASE_ID;
	}

	public void setPURCHASE_ID(int pURCHASE_ID) {
		PURCHASE_ID = pURCHASE_ID;
	}

	public int getSUPPLIER_ID() {
		return SUPPLIER_ID;
	}

	public void setSUPPLIER_ID(int sUPPLIER_ID) {
		SUPPLIER_ID = sUPPLIER_ID;
	}

	public int getGOOD_ID() {
		return GOOD_ID;
	}

	public void setGOOD_ID(int gOOD_ID) {
		GOOD_ID = gOOD_ID;
	}

	public String getPURCHASE_DATE() {
		return PURCHASE_DATE;
	}

	public void setPURCHASE_DATE(String pURCHASE_DATE) {
		PURCHASE_DATE = pURCHASE_DATE;
	}

	public String getRECEIVE_DATE() {
		return RECEIVE_DATE;
	}

	public void setRECEIVE_DATE(String rECEIVE_DATE) {
		RECEIVE_DATE = rECEIVE_DATE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getQUANTITY() {
		return QUANTITY;
	}

	public void setQUANTITY(String qUANTITY) {
		QUANTITY = qUANTITY;
	}

	public String getTOTAL_AMOUNT() {
		return TOTAL_AMOUNT;
	}

	public void setTOTAL_AMOUNT(String tOTAL_AMOUNT) {
		TOTAL_AMOUNT = tOTAL_AMOUNT;
	}

	@Override
	public String toString() {
		return "PurchaseModel [PURCHASE_ID=" + PURCHASE_ID + ", SUPPLIER_ID=" + SUPPLIER_ID + ", GOOD_ID=" + GOOD_ID
				+ ", PURCHASE_DATE=" + PURCHASE_DATE + ", RECEIVE_DATE=" + RECEIVE_DATE + ", STATUS=" + STATUS
				+ ", QUANTITY=" + QUANTITY + ", TOTAL_AMOUNT=" + TOTAL_AMOUNT + "]";
	}


	

}
