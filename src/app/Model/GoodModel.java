package app.Model;

public class GoodModel {

	//private StockModel QUANTITY;
	private int ID;
	private String NAME;
	private double UNITCOST;
	private double UNITPRICE;
	private int QUANTITY;
	
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public double getUNITCOST() {
		return UNITCOST;
	}
	public void setUNITCOST(double uNITCOST) {
		UNITCOST = uNITCOST;
	}
	public double getUNITPRICE() {
		return UNITPRICE;
	}
	public void setUNITPRICE(double uNITPRICE) {
		UNITPRICE = uNITPRICE;
	}
	@Override
	public String toString() {
		return "GoodModel [ID=" + ID + ", NAME=" + NAME + ", UNITCOST=" + UNITCOST + ", UNITPRICE=" + UNITPRICE
				+ ", QUANTITY=" + QUANTITY + ", getQUANTITY()=" + getQUANTITY() + ", getID()=" + getID()
				+ ", getNAME()=" + getNAME() + ", getUNITCOST()=" + getUNITCOST() + ", getUNITPRICE()=" + getUNITPRICE()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	


}