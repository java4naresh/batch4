package factory;

import dao.OracleDAO;
import dao.UserDAO;
import dao.UserDAOI;

public class DAOFactory {

	public static UserDAOI getDAO() {
		
		return new OracleDAO();
	}

}
