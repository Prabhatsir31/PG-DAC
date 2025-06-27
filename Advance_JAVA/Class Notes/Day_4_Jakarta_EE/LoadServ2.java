import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoadServ2 extends HttpServlet
{
	static
	{
		System.out.println("LoadServ2 has been loaded");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to LoadServ2");
			pw.println("<br>"); // generating html dynamically
			pw.println("All the very best");
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}