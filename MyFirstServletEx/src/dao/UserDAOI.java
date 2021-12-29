package dao;

import java.sql.Connection;
import java.sql.SQLException;

import pojo.User;

public interface UserDAOI {
	
	public void saveUser(Connection con , User user) throws SQLException;

}
