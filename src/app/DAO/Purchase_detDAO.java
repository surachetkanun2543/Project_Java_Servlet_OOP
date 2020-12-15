package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import app.Database.connect;
import app.Model.GoodModel;
import app.Model.Purchase_detModel;

public class Purchase_detDAO implements DAO<Purchase_detModel> {
	connect db;

	public Purchase_detDAO(connect db) {

		this.db = db;

	}

	@Override
	public int Add(Purchase_detModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int Update(Purchase_detModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(Purchase_detModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Purchase_detModel> FindAll() {
		String sql = "SELECT * FROM purchase_det";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<Purchase_detModel> Purchase_det_List = new ArrayList<Purchase_detModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            Purchase_detModel Purchase_det = MappingBeans(next);
            Purchase_det_List.add(Purchase_det);
        }
        return Purchase_det_List;
	}

	@Override
	public Purchase_detModel FindByID(Purchase_detModel bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Purchase_detModel FindByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Purchase_detModel MappingBeans(HashMap<String, Object> map) {
		
		Purchase_detModel Purchase_detModel = new Purchase_detModel();
		
		Purchase_detModel.setID(Integer.parseInt(map.get("ID").toString()));
		Purchase_detModel.setPURCHASE_ID(Integer.parseInt(map.get("PURCHASE_ID").toString()));
		Purchase_detModel.setGOOD_ID(Integer.parseInt(map.get("GOOD_ID").toString()));
		Purchase_detModel.setQUANTITY(Double.parseDouble(map.get("QUANTITY").toString()));

		
		
		return Purchase_detModel;
	}

	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}