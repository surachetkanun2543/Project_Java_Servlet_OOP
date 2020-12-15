package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.connect;
import app.Model.GoodModel;
import app.Model.SupplierModel;


public class SupplierDAO implements DAO <SupplierModel> {
    
	connect db;

	public SupplierDAO(connect db) {

		this.db = db;

	}
	@Override
	public int Add(SupplierModel bean) {
		String sql = "INSERT INTO supplier (SUPPLIER_ID,SUPPLIER_NAME,SUPPLIER_ADDRESS)"
				+ " VALUES ('" + bean.getID() + "','" + bean.getNAME() + "','" + bean.getADDRESS() + "','" + "')";
		return db.add(sql);
	}

	@Override
	public int Delete(SupplierModel bean) {
		String sql = "DELETE FROM supplier WHERE SUPPLIER_ID = " + bean.getID();
		return db.remove(sql);
	}

	@Override
	public int Update(SupplierModel bean) {
		String sql = "UPDATE supplier SET SUPPLIER_NAME = '" + bean.getNAME() + "',SUPPLIER_ADDRESS = '" + bean.getADDRESS()
				+ "' WHERE SUPPLIER_ID = "+ bean.getID();
		return db.update(sql);
	}

	@Override
	public ArrayList<SupplierModel> FindAll() {
		String sql = "SELECT * FROM supplier";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<SupplierModel> supplierList = new ArrayList<SupplierModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            SupplierModel suppliermodel = MappingBeans(next);
            supplierList.add(suppliermodel);
        }
        return supplierList;
	}

	@Override
	public SupplierModel FindByID(SupplierModel bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierModel FindByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	public SupplierModel insertsupplier(String SUPPLIER_ID, String SUPPLIER_NAME, String SUPPLIER_ADDRESS ) {
		String sql = "INSERT INTO supplier VALUES (" + SUPPLIER_ID + " , " + "'" + SUPPLIER_NAME + "', " + "'" + SUPPLIER_ADDRESS + "')";

			System.out.println(sql);
		HashMap<String, Object> map = db.querySingle(sql);
		SupplierModel sup = MappingBeans(map);

		return sup;

   }

	@Override
	public SupplierModel MappingBeans(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}