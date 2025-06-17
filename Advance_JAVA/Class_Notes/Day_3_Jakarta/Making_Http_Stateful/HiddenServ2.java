import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HiddenServ2 extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		
		PrintWriter pw=response.getWriter();
		pw.println(request.getParameter("a1"));
		pw.println(request.getParameter("a2"));
	}
}
		

		