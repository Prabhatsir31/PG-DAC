import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class RedirectedServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			
			PrintWriter pw=response.getWriter();
			pw.println("In RedirectedServlet");
				}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}