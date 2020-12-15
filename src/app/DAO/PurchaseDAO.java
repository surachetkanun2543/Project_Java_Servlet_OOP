package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.*;
import app.Model.GoodModel;
import app.Model.PurchaseModel;


public class PurchaseDAO implements DAO <PurchaseModel> {
    connect db;
	
	public PurchaseDAO() {
		db = new connect();
	}

	@Override
	public int Add(PurchaseModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(PurchaseModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<PurchaseModel> FindAll() {
		String sql = "SELECT * FROM purchase";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<PurchaseModel> purchaseList = new ArrayList<PurchaseModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            PurchaseModel purchase = MappingBeans(next);
            purchaseList.add(purchase);
        }
        return purchaseList;
	}


	@Override
	public PurchaseModel FindByID(PurchaseModel bean) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PurchaseModel MappingBeans(HashMap<String, Object> map) {
		
		PurchaseModel PurchaseModel = new PurchaseModel();
		
			PurchaseModel.setPURCHASE_ID(Integer.parseInt(map.get("PURCHASE_ID").toString()));
			PurchaseModel.setSUPPLIER_ID(Integer.parseInt(map.get("SUPPLIER_ID").toString()));
			PurchaseModel.setPURCHASE_DATE((String) map.get("PURCHASE_DATE"));
			PurchaseModel.setSTATUS((String) map.get("STATUS"));
			PurchaseModel.setRECEIVE_DATE((String) map.get("RECEIVE_DATE"));
			PurchaseModel.setTOTAL_AMOUNT((String) map.get("TOTAL_AMOUNT"));
		
		return PurchaseModel;
		
	}

	@Override
	public int Update(PurchaseModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PurchaseModel FindByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}