package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.UserDAO;
import dao.UserDAOI;
import factory.DAOFactory;
import pojo.User;

public class MyService {
	
	UserDAOI dao = DAOFactory.getDAO();
	
	public String saveUser(Connection con, User user) throws SQLException  {
		System.out.println(con);
		dao.saveUser(con, user);
		return "Saved Successfully";
	}

}
