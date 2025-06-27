import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import mypack.*;
public class CallPojoServ extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to CallPojoServ");
			pw.println("<br>"); // generating html dynamically
			PojoClass ref=new PojoClass();
			pw.println(ref.getMessage());
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}