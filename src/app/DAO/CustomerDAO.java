package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import app.Database.connect;
import app.Model.CustomerModel;
import app.Model.GoodModel;


public  class CustomerDAO implements DAO<CustomerModel>{
	connect db;

	public CustomerDAO(connect db) {

		this.db = db;

	}
	@Override
	public int Add(CustomerModel bean) {
		String sql = "INSERT INTO customer (ID, NAME, SURNAME, USERNAME, PASSWORD, ADDRESS, POSTCODE, BANK_ACCT,BALANCE, VERIFIED ) "
				+ "VALUES ('" + CustomerModel.getId() + "', '" + CustomerModel.getName() + "', '"
				+ CustomerModel.getSurname() + "', '" + CustomerModel.getUsername() + "','"
				+ CustomerModel.getPassword() + "','" + CustomerModel.getAddress() + "','"
				+ CustomerModel.getPostcode() + "','" + CustomerModel.getBank_acct() + "','"
				+ CustomerModel.getBalance() + "','" + CustomerModel.getVerified() +"')";
		System.out.println("SQL: "+sql);
		return db.add(sql);
	}

	@Override
	public int Delete(CustomerModel bean) {
		String sql_delete = "DELETE FROM customer WHERE ID = "+ CustomerModel.getId();
		return db.remove(sql_delete);
	}

	@Override
	public int Update(CustomerModel bean) {
		String sql = "UPDATE customer SET NAME='" + CustomerModel.getName() + "', SURNAME='" + CustomerModel.getSurname()
		+ "', USERNAME ='" + CustomerModel.getUsername() + "', PASSWORD = '"+ CustomerModel.getPassword() +"', ADDRESS = " + CustomerModel.getAddress() 
		+ ", POSTCODE =" + CustomerModel.getPostcode() + ", BANK_ACCT = "+ CustomerModel.getBank_acct() 
		+ ", BALANCE =" + CustomerModel.getBalance() + ", VERIFIED = " + CustomerModel.getVerified() + " WHERE ID= " + CustomerModel.getId();
		System.out.println("SQL: "+sql);
		return db.update(sql);
	}
	
	@Override
	public ArrayList<CustomerModel> FindAll() {
		String sql = "SELECT * FROM customer";
        ArrayList<HashMap<String, Object>> queryList = db.queryList(sql);
        ArrayList<CustomerModel> customerList = new ArrayList<CustomerModel>();
        for (Iterator<HashMap<String, Object>> iterator = queryList.iterator(); iterator.hasNext();) {
            HashMap<String, Object> next = iterator.next();
            CustomerModel customer = MappingBeans(next);
            customerList.add(customer);
        }
        return customerList;
	}

	@Override
	public CustomerModel FindByID(CustomerModel bean) {
		String sql = "SELECT * FROM CUSTOMER WHERE ID=" + CustomerModel.getId();
		HashMap<String, Object> querySingle = db.querySingle(sql);
		CustomerModel customerModel = MappingBeans(querySingle);
		return customerModel;
	}

	
	public CustomerModel FindLogin(String username, int password) {
		String sql = "SELECT * FROM customer WHERE USERNAME =  '" + username + "'AND PASSWORD ='" + password + "' ";

		HashMap<String, Object> querySingle = db.querySingle(sql);
		CustomerModel customerModel = new CustomerModel();
		if (!querySingle.isEmpty()) {

			customerModel = MappingBeans(querySingle);}
		return customerModel;
	}
	


	@Override
	public CustomerModel MappingBeans(HashMap<String, Object> map) {
		
		CustomerModel CustomerModel = new CustomerModel();
		
		app.Model.CustomerModel.setId(Integer.parseInt(map.get("ID").toString()));
		app.Model.CustomerModel.setName(map.get("NAME").toString());
		app.Model.CustomerModel.setSurname(map.get("SURNAME").toString());
		app.Model.CustomerModel.setUsername(map.get("USERNAME").toString());
		app.Model.CustomerModel.setPassword(Integer.parseInt(map.get("PASSWORD").toString()));
		app.Model.CustomerModel.setAddress(Integer.parseInt(map.get("ADDRESS").toString()));
		app.Model.CustomerModel.setPostcode(Integer.parseInt(map.get("POSTCODE").toString()));
		app.Model.CustomerModel.setBank_acct(Integer.parseInt(map.get("BANK_ACCT").toString()));
		app.Model.CustomerModel.setBalance(Double.parseDouble(map.get("BALANCE").toString()));
		app.Model.CustomerModel.setVerified(Integer.parseInt(map.get("VERIFIED").toString()));
		
		return CustomerModel;
	}
	

	@Override
	public CustomerModel FindByID(int id) {
		String sql = "SELECT * FROM customer WHERE ID = "+ id;
		HashMap<String, Object> querySingle = db.querySingle(sql);
		CustomerModel customerModel = MappingBeans(querySingle);
		return customerModel;
	}
	@Override
	public GoodModel FindByIDINVOICE(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
