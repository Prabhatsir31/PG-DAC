import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class InactiveTimeIntervalDDServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			PrintWriter pw=response.getWriter();
			HttpSession session=request.getSession();
			if(session.isNew())
			{
				pw.println("it is new");
			}
			else
			{
				pw.println("is is not new");
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}