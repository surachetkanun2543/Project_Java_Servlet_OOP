package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.*;
import app.Model.GoodModel;
import app.Model.StockModel;

public class StockDAO implements DAO <StockModel> {
	connect db;

	public StockDAO(connect db) {

		this.db = db;

	}
	@Override
	public int Add(StockModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public int Update(StockModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(StockModel bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<StockModel> FindAll() {
		String sql = "SELECT GOOD.ID , GOOD_NAME , GOOD.UNITCOST , GOOD.UNITPRICE, STOCK.QUANTITY FROM GOOD INNER JOIN STOCK WHERE GOOD.ID = STOCK.GOOD_ID ORDER BY GOOD.ID \r\n"
				+ "";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<StockModel> StockList = new ArrayList<StockModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            StockModel stock = MappingBeans(next);
            StockList.add(stock);
        }
        return StockList;
	}

	@Override
	public StockModel FindByID(StockModel bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockModel FindByID(int GOOD_ID) {
		String sql = "SELECT SUM(stock.QUANTITY) AS sum FROM stock WHERE GOOD_ID = "+ GOOD_ID;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		StockModel StockModel = MappingBeans(querySingle);
		return StockModel;
	}

	public StockModel MappingBeans(HashMap<String, Object> map) {
		
		StockModel StockModel = new StockModel();
		
		StockModel.setGOOD_ID(Integer.parseInt(map.get("GOOD_ID").toString()));
		StockModel.setQUANTITY(Integer.parseInt(map.get("QUANTITY").toString()));
		
		return StockModel;
	}
	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}




	
}