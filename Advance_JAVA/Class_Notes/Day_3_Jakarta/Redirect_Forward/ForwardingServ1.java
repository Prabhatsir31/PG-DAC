import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ForwardingServ1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			ServletContext context=getServletContext();
ServletContext context1=context.getContext("/myapp1");
RequestDispatcher rd=context1.getRequestDispatcher("/FirstServ"); 
			rd.forward(request,response);
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}










