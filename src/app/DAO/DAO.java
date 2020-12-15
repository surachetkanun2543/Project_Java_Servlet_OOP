package app.DAO;

import java.util.ArrayList;
import java.util.HashMap;

import app.Model.GoodModel;

public interface DAO<T> {
	int Add(T bean);

	int Delete(T bean);

	int Update(T bean);

	ArrayList<T> FindAll();

	T FindByID(T bean);

	T FindByID(int id);

	T MappingBeans(HashMap<String, Object> map);

	GoodModel FindByIDINVOICE(int id);
}
