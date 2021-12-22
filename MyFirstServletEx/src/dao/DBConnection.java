package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	String userName;
	String password;
	String url;
	Connection con;
	
	public DBConnection(String userName, String password, String url) {
		this.userName = userName;
		this.password = password;
		this.url = url;
		
	}
	
	public Connection getConnection()  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException q) {
			System.out.println(q.getMessage());
		}
		return con;
	}

}
