package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.DBConnection;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
        ServletContext ctx = arg0.getServletContext();
        //System.out.println(ctx.getAttributeNames().nextElement());
        //System.out.println(ctx.getInitParameterNames().nextElement());
        String user = ctx.getInitParameter("user");
        String pwd = ctx.getInitParameter("pwd");
        String url = ctx.getInitParameter("url");
        System.out.println(user);
        System.out.println(pwd);
        System.out.println(url);
        DBConnection c = new DBConnection(user,pwd,url);
        ctx.setAttribute("dbCon", c);
    }
	
}
