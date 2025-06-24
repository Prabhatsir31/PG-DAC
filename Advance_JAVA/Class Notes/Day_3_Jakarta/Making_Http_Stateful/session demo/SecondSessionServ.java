import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SecondSessionServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			PrintWriter pw=response.getWriter();
HttpSession session=request.getSession(false);
if(session!=null)
{
	pw.println(session.getAttribute("book"));
}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}

