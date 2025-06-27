import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InitTest4 extends HttpServlet
{
	public void init(ServletConfig conf)throws ServletException
	{
		super.init(conf);
		System.out.println("inside init(ServletConfig conf) method");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("Overriding init(ServletConfig conf) and invoking parent init(ServletConfig conf)");
		/* No Problem for following 2 statements*/
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		
	}
}
		

		