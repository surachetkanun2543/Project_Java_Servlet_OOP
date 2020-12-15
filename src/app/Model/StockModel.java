package app.Model;

public class StockModel {

	private GoodModel GoodModel;
	private int GOOD_ID;
	private int QUANTITY;
	public GoodModel getGoodModel() {
		return GoodModel;
	}
	public void setGoodModel(GoodModel goodModel) {
		GoodModel = goodModel;
	}
	public int getGOOD_ID() {
		return GOOD_ID;
	}
	public void setGOOD_ID(int gOOD_ID) {
		GOOD_ID = gOOD_ID;
	}
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	}
	@Override
	public String toString() {
		return "StockModel [GoodModel=" + GoodModel + ", GOOD_ID=" + GOOD_ID + ", QUANTITY=" + QUANTITY
				+ ", getGoodModel()=" + getGoodModel() + ", getGOOD_ID()=" + getGOOD_ID() + ", getQUANTITY()="
				+ getQUANTITY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
