import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InitTest3 extends HttpServlet
{
	public void init(ServletConfig conf)
	{
		System.out.println("inside init(ServletConfig conf) method");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		PrintWriter pw=response.getWriter();
		pw.println("Overriding init(ServletConfig conf)");
		/* NullPointerException for following 2 statements*/
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}
}
		

		