package filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter implements Filter {
	
    /**
     * Default constructor. 
     */
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*HttpServletRequest hReq = (HttpServletRequest) request;
		String name = hReq.getParameter("name");
		Map<String, String[]> map = hReq.getParameterMap();
		map.put("name", new String[]{name+" Kambala"});
		hReq.setAttribute("name", name+" Kambala");*/
		/*if(true) {
			throw new RuntimeException("Unknown Source");
		} else {
		chain.doFilter(request, response);
		}*/
		/*long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		long endTime = System.currentTimeMillis();
		System.out.println("Request Processing Time is "+(endTime-startTime));*/
		String regex = "^[a-zA-Z]*$";
		HttpServletRequest hReq = (HttpServletRequest) request;
		String name = hReq.getParameter("name");
		System.out.println(name+"============");
		if(null != name && !name.matches(regex)) {
			throw new RuntimeException("Name Should Not contain numbers or speacial characters");
		} else {
			chain.doFilter(request, response);
		}
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
