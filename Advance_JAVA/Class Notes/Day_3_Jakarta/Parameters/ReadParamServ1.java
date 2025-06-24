import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReadParamServ1 extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
String value=getServletConfig().getInitParameter("file");
			pw.println(value);
String value1=getServletContext().getInitParameter("driver");
			pw.println("<br>"+value1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}








