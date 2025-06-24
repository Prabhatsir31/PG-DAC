

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CustomCookieServ
 */
public class CustomCookieServ extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		Cookie[] cookielist=request.getCookies();
		String user=null;
		String responsestring=null;
		if(cookielist !=null)
		{
			for(int x=0;x<cookielist.length;x++)
			{
				String name=cookielist[x].getName();
				String age=cookielist[x].getValue();
				out.println(name+"     "+age);
			}
		}
		else
		{
		Cookie c=new Cookie("Scott","420");
	//	c.setMaxAge(120);
			response.addCookie(c);
			responsestring=new String("Welcome to our site,  "+"we have created a session for you ");
		out.println("<html>");
		out.println("<head><title>CookieServlet</title></head>");
		out.println("<body>");
		out.println(responsestring);
		}
		out.close();
	}

}