package app.DAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.connect;
import app.Model.CustomerModel;
import app.Model.GoodModel;
import app.Model.Invoice_detModel;

public class Invoice_detDAO implements DAO <Invoice_detModel>{
	connect db;

	public Invoice_detDAO(connect db) {

		this.db = db;
	}

	@Override
	public int Add(Invoice_detModel bean) {
		
		String sql = "INSERT INTO invoice_det (INVOICE_ID , GOOG_ID , QUANITITY)"
				+ " VALUES ('" + bean.getINVOICE_ID() + "', '" + bean.getGOOD_ID() + "','"
				+ bean.getQUANTITY() + "')";
		return db.add(sql);
	}
	
	@Override
	public int Update(Invoice_detModel bean) {
		String sql = "UPDATE invoice_det SET INVOICE_ID = '" + bean.getINVOICE_ID()
				+ "',GOOG_ID = '" + bean.getGOOD_ID() + "', QUANITITY = '" + bean.getQUANTITY() + "' WHERE INVOICE_DETAILS = "
				+ bean.getINVOICE_ID();
		return db.update(sql);
	}

	@Override
	public int Delete(Invoice_detModel bean) {
		String sql = "DELETE FROM invoice_det WHERE INVOICE_ID = " + bean.getINVOICE_ID();
		return db.remove(sql);
	}

	@Override
	public ArrayList<Invoice_detModel> FindAll() {
		String sql = "SELECT * FROM Invoice_det";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<Invoice_detModel> InvoiceList = new ArrayList<Invoice_detModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            Invoice_detModel Invoice_det = MappingBeans(next);
            InvoiceList.add(Invoice_det);
        }
        return InvoiceList;
	}

	@Override
	public Invoice_detModel FindByID(Invoice_detModel bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice_detModel FindByID(int id) {
		String sql = "SELECT * FROM Invoice_det WHERE INVOICE_ID =" + id;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		Invoice_detModel InvModel = MappingBeans(querySingle);
		return InvModel;
	}


	@Override
	public Invoice_detModel MappingBeans(HashMap<String, Object> map) {
		
		Invoice_detModel Invoice_detModel = new Invoice_detModel();
		
		Invoice_detModel.setINVOICE_ID(Integer.parseInt(map.get("INVOICE_ID").toString()));			
		Invoice_detModel.setGOOD_ID(Integer.parseInt(map.get("GOOD_ID").toString()));
		Invoice_detModel.setQUANTITY(Integer.parseInt(map.get("ADDRESS").toString()));

		return Invoice_detModel;
	}

	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
