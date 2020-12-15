package app.Model;

public class SupplierModel {
	
	private int ID;
	private String NAME ;
	private String ADDRESS;
	
	public SupplierModel(int ID, String NAME, String ADDRESS) {
		super();
		this.ID = ID;
		this.NAME = NAME;
		this.ADDRESS = ADDRESS;
		// TODO Auto-generated constructor stub
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
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	@Override
	public String toString() {
		return "SupplierModel [ID=" + ID + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + "]";
	}
	
}
