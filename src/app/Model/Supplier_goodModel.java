package app.Model;

public class Supplier_goodModel {
	
	private int ID;
	private int GOOD_ID;
	private String GOOD_NAME;
	private double UNITPRICE;
	private int SUPPLIER_ID ;
	private String SUPPLIER_NAME ;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getGOOD_ID() {
		return GOOD_ID;
	}
	public void setGOOD_ID(int gOOD_ID) {
		GOOD_ID = gOOD_ID;
	}
	public String getGOOD_NAME() {
		return GOOD_NAME;
	}
	public void setGOOD_NAME(String gOOD_NAME) {
		GOOD_NAME = gOOD_NAME;
	}
	public double getUNITPRICE() {
		return UNITPRICE;
	}
	public void setUNITPRICE(double uNITPRICE) {
		UNITPRICE = uNITPRICE;
	}
	public int getSUPPLIER_ID() {
		return SUPPLIER_ID;
	}
	public void setSUPPLIER_ID(int sUPPLIER_ID) {
		SUPPLIER_ID = sUPPLIER_ID;
	}
	public String getSUPPLIER_NAME() {
		return SUPPLIER_NAME;
	}
	public void setSUPPLIER_NAME(String sUPPLIER_NAME) {
		SUPPLIER_NAME = sUPPLIER_NAME;
	}
	@Override
	public String toString() {
		return "Supplier_goodModel [ID=" + ID + ", GOOD_ID=" + GOOD_ID + ", GOOD_NAME=" + GOOD_NAME + ", UNITPRICE="
				+ UNITPRICE + ", SUPPLIER_ID=" + SUPPLIER_ID + ", SUPPLIER_NAME=" + SUPPLIER_NAME + ", getID()="
				+ getID() + ", getGOOD_ID()=" + getGOOD_ID() + ", getGOOD_NAME()=" + getGOOD_NAME()
				+ ", getUNITPRICE()=" + getUNITPRICE() + ", getSUPPLIER_ID()=" + getSUPPLIER_ID()
				+ ", getSUPPLIER_NAME()=" + getSUPPLIER_NAME() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
