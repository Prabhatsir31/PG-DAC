import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class RedirectingServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.sendRedirect("RedirectedServ");

		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}