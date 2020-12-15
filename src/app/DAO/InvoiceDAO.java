package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


import app.Database.connect;
import app.Model.CustomerModel;
import app.Model.GoodModel;
import app.Model.InvoiceModel;




public class InvoiceDAO implements DAO<InvoiceModel>{
	
	connect db;

	public InvoiceDAO(connect db) {

		this.db = db;

	}
	
	@Override
	public int Add(InvoiceModel bean) {
		String sql = "INSERT INTO invoice (ID , CUSTOMER_ID , TOTAL_AMOUNT , INVOICE_DATE)"
				+ " VALUES ('" + bean.getId() + "', '" + CustomerModel.getId() + "','"
				+ bean.getTotalAmount() + "','" +  "TO_DATE" + bean.getInvoiceDate() + "', 'DD-MM-YYYY'), '" + "')";
		return db.add(sql, new String[] { "ID" });
	}
	
	@Override
	public int Update(InvoiceModel bean) {
		String sql = "UPDATE invoice SET CUSTOMER_ID = '" + CustomerModel.getId() + "', TOTAL_AMOUNT = '"
				+ bean.getTotalAmount() + "', INVOICE_DATE = '" + bean.getInvoiceDate() + ","  + "' WHERE ID = " + bean.getId();
		return db.update(sql);
	}
	
	@Override
	public int Delete(InvoiceModel bean) {
		String sql = "DELETE FROM invoice WHERE ID = " + bean.getId();
		return db.remove(sql);
	}

	@Override
	public ArrayList<InvoiceModel> FindAll() {
		String sql = "SELECT * FROM invoice";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<InvoiceModel> inList = new ArrayList<InvoiceModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            InvoiceModel InvoiceModel = MappingBeans(next);
            inList.add(InvoiceModel);
        }
        return inList;
	}

	@Override
	public InvoiceModel FindByID(InvoiceModel bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceModel FindByID(int id) {
		String sql = "SELECT * FROM invoice WHERE ID =" + id;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		InvoiceModel InvModel = MappingBeans(querySingle);
		return InvModel;
	}



	@Override
	public InvoiceModel MappingBeans(HashMap<String, Object> map) {
		
		connect db = new connect();
		InvoiceModel InModel = new InvoiceModel();
		InModel.setId(Integer.parseInt(map.get("ID").toString()));
		InModel.setCustomerId(Integer.parseInt(map.get("CustomerId").toString()));
		InModel.setInvoiceDate(map.get("INVOICE_DATE").toString());
		InModel.setTotalAmount(Double.parseDouble(map.get("TOTAL_AMOUNT").toString()));
		InModel.setUnitprice(Integer.parseInt(map.get("unitprice").toString()));
		InModel.setUnitcost(Integer.parseInt(map.get("unitcost").toString()));
		
		 return InModel;
		
	}

	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InvoiceModel> FindByInvoiceID(int id) {
		String sql = "SELECT * FROM invoice WHERE ID = "+id;
		ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
		ArrayList<InvoiceModel> InvList = new ArrayList<InvoiceModel>();

		for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
			HashMap<String, Object> next = iterator.next();
			InvoiceModel InvModel = MappingBeans(next);
			InvList.add(InvModel);
		}
		return InvList;

	}

   


}
