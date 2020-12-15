package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.connect;
import app.Model.GoodModel;
import app.Model.InvoiceModel;
import app.Model.ReportModel;
import app.Model.Supplier_goodModel;


public  class ReportDAO implements DAO<ReportModel>{
	connect db;

	public ReportDAO(connect db) {

		this.db = db;

	}
	@Override
	public int Add(ReportModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int Delete(ReportModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int Update(ReportModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public ArrayList<ReportModel> FindAll() {
		String sql = "SELECT invoice.CUSTOMER_ID ,invoice.ID AS INVOICE_ID,customer.NAME AS CUSTOMER_NAME,invoice.INVOICE_DATE , invoice_det.GOOG_ID , good.GOOD_NAME  , good.UNITPRICE , invoice_det.QUANTITY  FROM invoice , customer , good , invoice_det WHERE invoice.CUSTOMER_ID  AND invoice.id = invoice_det.invoice_id AND invoice.customer_id = customer.id AND invoice_det.goog_id = good.id ORDER BY invoice.CUSTOMER_ID ASC";
		
		ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
		ArrayList<ReportModel> reList = new ArrayList<ReportModel>();
		for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
			HashMap<String, Object> next = iterator.next();
			ReportModel report = MappingBeans(next);
			reList.add(report);
			System.out.println("reList : " + reList);
		}
		return reList;
	}

	@Override
	public ReportModel FindByID(ReportModel bean) {
		String sql = "SELECT * FROM supplier_good WHERE ID = " + bean.getCustomerid();
		HashMap<String, Object> querySingle = db.querySingle(sql);
		ReportModel ReportModel = MappingBeans(querySingle);
		return ReportModel;
	}

	
	public ReportModel FindLogin(String username, int password) {
		String sql = "SELECT * FROM customer WHERE USERNAME =  '" + username + "'AND PASSWORD ='" + password + "' ";

		HashMap<String, Object> querySingle = db.querySingle(sql);
		ReportModel ReportModel = new ReportModel();
		if (!querySingle.isEmpty()) {

			ReportModel = MappingBeans(querySingle);}
		return ReportModel;
	}
	


	@Override
	public ReportModel MappingBeans(HashMap<String, Object> map) {
		
		ReportModel reportModel = new ReportModel();
		connect db = new connect();
		
		db = new connect();
		reportModel.setCustomerid(Integer.parseInt(map.get("CUSTOMER_ID").toString()));
		reportModel.setInvoiceid(Integer.parseInt(map.get("INVOICE_ID").toString()));
		reportModel.setCustomername(map.get("CUSTOMER_NAME").toString());
		reportModel.setInvoicedate(map.get("INVOICE_DATE").toString());
		reportModel.setGoodid(Integer.parseInt(map.get("GOOG_ID").toString()));
		reportModel.setGoodname(map.get("GOOD_NAME").toString());
		reportModel.setUnitprice(Double.parseDouble(map.get("UNITPRICE").toString()));
		reportModel.setQuantity(Integer.parseInt(map.get("QUANTITY").toString()));
		
		return reportModel;
	}
	

	@Override
	public ReportModel FindByID(int id) {
		String sql = "SELECT * FROM customer WHERE ID = "+ id;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		ReportModel ReportModel = MappingBeans(querySingle);
		return ReportModel;
	}
	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
