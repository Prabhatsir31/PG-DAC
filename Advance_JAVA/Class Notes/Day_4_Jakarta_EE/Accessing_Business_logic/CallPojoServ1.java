import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import mypack1.*;
public class CallPojoServ1 extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to CallPojoServ1");
			pw.println("<br>"); // generating html dynamically
			PojoClass1 ref=new PojoClass1();
			pw.println(ref.wish());
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}