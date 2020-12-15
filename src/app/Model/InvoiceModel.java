package app.Model;

public class InvoiceModel {
	private int id;
	private int customerId;
	private String invoiceDate;
	private double totalAmount;
	private int unitprice;
	private int unitcost;
	
	public InvoiceModel(int id, CustomerModel customer, int customerId, String invoiceDate, double totalAmount , int unitcost , int unitprice) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.invoiceDate = invoiceDate;
		this.totalAmount = totalAmount;
		this.unitprice = unitprice;
		this.unitcost = unitcost;
	}
	
	
	public InvoiceModel() {
		this.id = id;
	}

	public InvoiceModel(int id, int customerId, String invoiceDate, double totalAmount) {
		this.id = id;
		this.customerId = customerId;
		this.invoiceDate = invoiceDate;
		this.totalAmount = totalAmount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getInvoiceDate() {
		return invoiceDate;
	}


	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public int getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}


	public int getUnitcost() {
		return unitcost;
	}


	public void setUnitcost(int unitcost) {
		this.unitcost = unitcost;
	}


	@Override
	public String toString() {
		return "InvoiceModel [id=" + id + ", customerId=" + customerId + ", invoiceDate=" + invoiceDate
				+ ", totalAmount=" + totalAmount + ", unitprice=" + unitprice + ", unitcost=" + unitcost + ", getId()="
				+ getId() + ", getCustomerId()=" + getCustomerId() + ", getInvoiceDate()=" + getInvoiceDate()
				+ ", getTotalAmount()=" + getTotalAmount() + ", getUnitprice()=" + getUnitprice() + ", getUnitcost()="
				+ getUnitcost() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	
	
}
