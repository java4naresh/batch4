package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.UserDAO;
import pojo.User;

public class MyService {
	
	UserDAO dao = new UserDAO();
	
	public String saveUser(Connection con, User user) throws SQLException  {
		System.out.println(con);
		dao.saveUser(con, user);
		return "Saved Successfully";
	}

}
