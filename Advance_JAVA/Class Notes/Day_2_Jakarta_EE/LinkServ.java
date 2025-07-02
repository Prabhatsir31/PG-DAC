import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LinkServ extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
	
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to Link Servlet");
		}
		catch(Exception ee)  // IOException , ServletException
		{
			ee.printStackTrace();
		}
	}
}