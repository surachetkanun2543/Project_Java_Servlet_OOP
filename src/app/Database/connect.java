package app.Database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


//import org.model.db.ClassNotFoundException;

//import org.model.db.Object;
//import org.model.db.String;

/**
 *
 * @author PoN
 */
public class connect {
	public Connection connect;

	public static Connection getConnect(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/project2?user=root&password=");
			if(con==null) {
				System.out.println("ERROR Database CONNECT!");
			} else if (con != null){
				//System.out.println("CONNECT DATABASE :::::::: project2 ::::::: SUCCESSFULLY!");
			}
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	


    public int add(String sql) {
        int lastId = -1;
       
        try {
        	Connection connect = getConnect();
            Statement stmt = connect.createStatement();
            if (connect != null) {
                lastId = stmt.executeUpdate(sql);
                stmt.close();
            }
            return lastId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lastId;
    }
    
    
    public int add(String sql, String[] param) {
        int lastId = -1;
        try {
            if (connect != null) {
                Statement stmt = connect.createStatement();
                stmt.executeUpdate(sql, param);
                ResultSet rs = stmt.getGeneratedKeys();
                if(rs != null && rs.next()) {
                	lastId = rs.getInt(1);
                }
                rs.close();
                stmt.close();
            }
            return lastId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lastId;
    }

    public int update(String sql) {
        int lastId = -1;
       
        try {
        	Connection connect = getConnect();
        	Statement stmt = connect.createStatement();
            if (connect != null) {
                lastId = stmt.executeUpdate(sql);
                stmt.close();
            }
            return lastId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lastId;
    }

    public int remove(String sql) {
        int lastId = -1;
   
        try {
        	Connection connect = getConnect();
        	Statement stmt = connect.createStatement();
            if (connect != null) {
                lastId = stmt.executeUpdate(sql);
                stmt.close();
            }
            return lastId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lastId;
    }

    public HashMap<String, Object> querySingle(String sql) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        
        try {
        	Connection connect = getConnect();
        	Statement stmt = connect.createStatement();
            if (connect != null) {
                ResultSet rs = stmt.executeQuery(sql);
                ResultSetMetaData rsMetaData = rs.getMetaData();
                if (rs.isBeforeFirst()) {
                    while (rs.next()) {
                        for (int i = 0; i < rsMetaData.getColumnCount(); i++) {
                        	/*String key = rsMetaData.getColumnName(i + 1);
                        	String value = rs.getString(i + 1);
                        	System.out.println("key:" + key + ", value:" + value);*/
                            map.put(rsMetaData.getColumnName(i + 1), rs.getString(i + 1));
                        }
                        return map;
                    }
                }
                rs.close();
                stmt.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            
        }
        return map;
    }
    
    public ArrayList<HashMap<String,String>> query(String sql){
		ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		try {
			Connection connect = getConnect();
			Statement st = connect.createStatement();
			ResultSet result = st.executeQuery(sql);
			ResultSetMetaData meta = result.getMetaData();
				while(result.next()){
					HashMap<String,String> inList = new HashMap<String,String>();
					for(int i=0;i<meta.getColumnCount();i++) {
						inList.put(meta.getColumnName(i+1),result.getString(i+1));
					}
					list.add(inList);
				}
				connect.close();
			st.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

    public ArrayList<HashMap<String, Object>> queryList(String sql) {
        ArrayList<HashMap<String, Object>> mapList = new ArrayList<HashMap<String, Object>>();
       
        try {
        	Connection connect = getConnect();
        	Statement stmt = connect.createStatement();
            if (connect != null) {
                ResultSet rs = stmt.executeQuery(sql);
                ResultSetMetaData rsMetaData = rs.getMetaData();
                if (rs.isBeforeFirst()) {
                    while (rs.next()) {
                        HashMap<String, Object> map = new HashMap<String, Object>();
                        for (int i = 0; i < rsMetaData.getColumnCount(); i++) {
                            map.put(rsMetaData.getColumnName(i + 1), rs.getString(i + 1));
                        }
                        mapList.add(map);
                    }
                    return mapList;
                }
                rs.close();
                stmt.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
        	
        }
        return mapList;
    }
}
