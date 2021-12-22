package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBConnection;
import pojo.User;
import service.MyService;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MyService service = new MyService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.getWriter().append("Hello Your name is "+ name);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String message = null;
		User user = new User(name,pwd);
		ServletContext ctx = request.getServletContext();
		DBConnection dbCon = (DBConnection) ctx.getAttribute("dbCon");
		Connection con = dbCon.getConnection();
		System.out.println(con);
		try {
			message = service.saveUser(con, user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.getWriter().append(message);
	}

}
