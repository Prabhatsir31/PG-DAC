import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class Second extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("i am second");
				
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			pw.println(session.getAttribute("gender"));
		}
		else
		{
			pw.println("session does not exists");
		}
		
	}
}