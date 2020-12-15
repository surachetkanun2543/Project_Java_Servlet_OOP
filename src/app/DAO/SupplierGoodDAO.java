package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.connect;
import app.Model.GoodModel;
import app.Model.SupplierModel;
import app.Model.Supplier_goodModel;

public class SupplierGoodDAO implements DAO<Supplier_goodModel> {

	connect db;

	public SupplierGoodDAO(connect db) {
		this.db = db;
	}

	@Override
	public int Add(Supplier_goodModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(Supplier_goodModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(Supplier_goodModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Supplier_goodModel> FindAll() {
		String sql = "SELECT supplier_good.ID AS supplier_good , supplier.SUPPLIER_ID , supplier.SUPPLIER_NAME , supplier_good.GOOD_ID , good.GOOD_NAME, \r\n"
				+ "good.UNITPRICE\r\n" + "FROM supplier_good \r\n"
				+ "INNER JOIN supplier ON supplier_good.SUPPLIER_ID = supplier.SUPPLIER_ID\r\n"
				+ "INNER JOIN good ON supplier_good.GOOD_ID = good.ID; ";

		ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
		ArrayList<Supplier_goodModel> supgList = new ArrayList<Supplier_goodModel>();
		for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
			HashMap<String, Object> next = iterator.next();
			Supplier_goodModel supg = MappingBeans(next);
			supgList.add(supg);
			System.out.println("supgList : " + supgList);
		}
		return supgList;
	}

	@Override
	public Supplier_goodModel FindByID(Supplier_goodModel bean) {
		String sql = "SELECT * FROM supplier_good WHERE ID = " + bean.getID();
		HashMap<String, Object> querySingle = db.querySingle(sql);
		Supplier_goodModel sppgModel = MappingBeans(querySingle);
		return sppgModel;
	}

	@Override
	public Supplier_goodModel FindByID(int id) {
		String sql = "SELECT * FROM supplier_good WHERE ID = " + id;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		Supplier_goodModel sppgModel = MappingBeans(querySingle);
		return sppgModel;
	}

	@Override
	public Supplier_goodModel MappingBeans(HashMap<String, Object> map) {
		Supplier_goodModel sppgModel = new Supplier_goodModel();

		connect db = new connect();

		sppgModel.setID(Integer.parseInt(map.get("ID").toString()));

		sppgModel.setGOOD_ID(Integer.parseInt(map.get("GOOD_ID").toString()));

		sppgModel.setGOOD_NAME((String) map.get("GOOD_NAME"));

		sppgModel.setUNITPRICE(Double.parseDouble(map.get("UNITPRICE").toString()));

		sppgModel.setSUPPLIER_ID(Integer.parseInt(map.get("SUPPLIER_ID").toString()));

		sppgModel.setSUPPLIER_NAME((String) map.get("SUPPLIER_NAME"));

		return sppgModel;
	}

	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
