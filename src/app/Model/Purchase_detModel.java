package app.Model;

public class Purchase_detModel {
	
	private PurchaseModel purchasemodel;
	private int ID;
	private int PURCHASE_ID  ;
	private int GOOD_ID;
	private Double QUANTITY;
	
	
	public PurchaseModel getPurchasemodel() {
		return purchasemodel;
	}
	public void setPurchasemodel(PurchaseModel purchasemodel) {
		this.purchasemodel = purchasemodel;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPURCHASE_ID() {
		return PURCHASE_ID;
	}
	public void setPURCHASE_ID(int pURCHASE_ID) {
		PURCHASE_ID = pURCHASE_ID;
	}
	public int getGOOD_ID() {
		return GOOD_ID;
	}
	public void setGOOD_ID(int gOOD_ID) {
		GOOD_ID = gOOD_ID;
	}
	public Double getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(Double qUANTITY) {
		QUANTITY = qUANTITY;
	}
	@Override
	public String toString() {
		return "Purchase_detModel [purchasemodel=" + purchasemodel + ", ID=" + ID + ", PURCHASE_ID=" + PURCHASE_ID
				+ ", GOOD_ID=" + GOOD_ID + ", QUANTITY=" + QUANTITY + ", getPurchasemodel()=" + getPurchasemodel()
				+ ", getID()=" + getID() + ", getPURCHASE_ID()=" + getPURCHASE_ID() + ", getGOOD_ID()=" + getGOOD_ID()
				+ ", getQUANTITY()=" + getQUANTITY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
