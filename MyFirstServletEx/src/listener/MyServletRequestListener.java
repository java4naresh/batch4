package listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class MyServletRequestListener
 *
 */
public class MyServletRequestListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public MyServletRequestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
    	ServletRequest req = arg0.getServletRequest();
    	System.out.println(req.getParameter("name"));
    	System.out.println(req.getParameter("pwd"));
    }
	
}
