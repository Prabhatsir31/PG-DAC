import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class IncluderServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
{
	try
	{

		PrintWriter pw=response.getWriter();
		pw.println("<b>this is a main servlet</b><br>");
		RequestDispatcher rd=request.getRequestDispatcher("IncludedServ");
		rd.include(request,response);
		pw.println("<b>coming back to main servlet</b>");
		
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
}
}
