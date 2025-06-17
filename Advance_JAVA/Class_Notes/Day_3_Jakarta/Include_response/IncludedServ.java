import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class IncludedServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
{
	try
	{
		PrintWriter pw=response.getWriter();
		pw.println("<i><u>inside included  servlet</i></u><br>");
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
}
}