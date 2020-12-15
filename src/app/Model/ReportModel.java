package app.Model;

public class ReportModel {

	private int customerid;
	private int invoiceid;
	private String customername;
	private String invoicedate;
	private int goodid;
	private String goodname;
	private Double unitprice;
	private int quantity;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(String invoicedate) {
		this.invoicedate = invoicedate;
	}
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public Double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ReportModel [customerid=" + customerid + ", invoiceid=" + invoiceid + ", customername=" + customername
				+ ", invoicedate=" + invoicedate + ", goodid=" + goodid + ", goodname=" + goodname + ", unitprice="
				+ unitprice + ", quantity=" + quantity + ", getCustomerid()=" + getCustomerid() + ", getInvoiceid()="
				+ getInvoiceid() + ", getCustomername()=" + getCustomername() + ", getInvoicedate()=" + getInvoicedate()
				+ ", getGoodid()=" + getGoodid() + ", getGoodname()=" + getGoodname() + ", getUnitprice()="
				+ getUnitprice() + ", getQuantity()=" + getQuantity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

