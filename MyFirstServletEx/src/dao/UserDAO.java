package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import pojo.User;

public class UserDAO {
	
	public void saveUser(Connection con , User user) throws SQLException {
		System.out.println(con);
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?)");
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getPwd());
		ps.execute();
		
	}

}
