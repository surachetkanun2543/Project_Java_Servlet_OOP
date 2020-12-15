package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


import app.Database.connect;
import app.Model.GoodModel;
import app.Model.InvoiceModel;

public class GoodDAO implements DAO<GoodModel> {

	connect db;

	public GoodDAO(connect db) {

		this.db = db;

	}
	
	@Override
	public int Add(GoodModel bean) {
		String sql = "INSERT INTO good (ID, GOOD_NAME, UNITCOST , UNITPRICE ) "
				+ "VALUES ('" + bean.getID() + "', '" + bean.getNAME() + "', '"
				+ bean.getUNITCOST() + "', '" + bean.getUNITCOST() + "')";
		
		System.out.println("SQL: "+sql);
		return db.add(sql, new String[] { "ID" });
	}

	@Override
	public int Delete(GoodModel bean) {
		String sql_delete = "DELETE FROM good WHERE ID = "+ bean.getID();
		return db.remove(sql_delete);
	}

	@Override
	public int Update(GoodModel bean) {
		String sql_update = "UPDATE good SET GOOD_NAME='" + bean.getNAME() + "', UNITCOST='" + bean.getUNITCOST()
		+ "', UNITPRICE ='" + bean.getUNITCOST() + " WHERE ID = " + bean.getID();
		System.out.println("SQL: "+sql_update);
		return db.update(sql_update);
	}

	@Override
	public ArrayList<GoodModel> FindAll() {
		String sql = "SELECT GOOD.ID , GOOD_NAME , GOOD.UNITPRICE , STOCK.QUANTITY FROM GOOD INNER JOIN STOCK WHERE GOOD.ID = STOCK.GOOD_ID ORDER BY GOOD.ID ";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<GoodModel> goodList = new ArrayList<GoodModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            GoodModel good = MappingBeans(next);
            goodList.add(good);
            //System.out.println("goodList : "+goodList);
        }
        return goodList;
	}
	


	@Override
	public GoodModel FindByID(GoodModel bean) {
		String sql= "SELECT * FROM good WHERE ID = " + bean.getID();
        HashMap<String, Object> map = db.querySingle(sql);
        GoodModel goodModel = MappingBeans(map);
        return goodModel;
	}

	@Override
	public GoodModel FindByID(int ID) {
		String sql = "SELECT * FROM good WHERE GOOD_ID = " + ID;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		GoodModel goodModel = MappingBeans(querySingle);
		return goodModel;
	}
	
	@Override
	public GoodModel FindByIDINVOICE(int id) {
		String sql = "SELECT * FROM good WHERE ID = "+ id;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		GoodModel GoodModel = MappingBeans(querySingle);
		return GoodModel;
	}

	public GoodModel FindByUUID(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodModel MappingBeans(HashMap<String, Object> map) {
		GoodModel goodModel = new GoodModel();

		goodModel.setID(Integer.parseInt(map.get("ID").toString()));

		goodModel.setNAME((String) map.get("GOOD_NAME"));

		goodModel.setUNITCOST(Double.parseDouble(map.get("QUANTITY").toString()));

		goodModel.setUNITPRICE(Double.parseDouble(map.get("UNITPRICE").toString()));
		
		goodModel.setQUANTITY(Integer.parseInt(map.get("QUANTITY").toString()));

		
        return goodModel;
	}
	
	public ArrayList<GoodModel> FindBygoodID(int ID) {
		String sql = "SELECT * FROM good WHERE ID = "+ ID;
		ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
		ArrayList<GoodModel> goodModel = new ArrayList<GoodModel>();

		for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
			HashMap<String, Object> next = iterator.next();
			GoodModel GoodModel = MappingBeans(next);
			goodModel.add(GoodModel);
		}
		return goodModel;

	}
	
	public int UpdateQty(GoodModel bean) {
		String sql = "UPDATE stock SET QUANTITY = " + bean.getQUANTITY() + " WHERE GOOD_ID = " + bean.getID();
		
		return db.update(sql);
	}
	


}
