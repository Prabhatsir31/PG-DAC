import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SessionServ1 extends HttpServlet
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