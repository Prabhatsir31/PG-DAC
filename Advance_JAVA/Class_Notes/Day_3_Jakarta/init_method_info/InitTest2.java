import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InitTest2 extends HttpServlet
{
	public void init()
	{
		System.out.println("inside init() method");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("Overriding init()");
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		
	}
}
		

		