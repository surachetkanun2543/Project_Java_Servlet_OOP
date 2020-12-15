package app.Model;

public class Invoice_detModel {

	private InvoiceModel invoicemodel;
	private GoodModel GoodModel;
	private int INVOICE_ID ;
	private int GOOD_ID;
	private int QUANTITY;
	public InvoiceModel getInvoicemodel() {
		return invoicemodel;
	}
	public void setInvoicemodel(InvoiceModel invoicemodel) {
		this.invoicemodel = invoicemodel;
	}
	public GoodModel getGoodModel() {
		return GoodModel;
	}
	public void setGoodModel(GoodModel goodModel) {
		GoodModel = goodModel;
	}
	public int getINVOICE_ID() {
		return INVOICE_ID;
	}
	public void setINVOICE_ID(int iNVOICE_ID) {
		INVOICE_ID = iNVOICE_ID;
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
	
	
	
	
	
}
