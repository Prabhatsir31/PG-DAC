import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstSessionServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			HttpSession session=request.getSession();
session.setAttribute("book","Complete_Reference");

PrintWriter pw=response.getWriter();
pw.println("session created");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}

