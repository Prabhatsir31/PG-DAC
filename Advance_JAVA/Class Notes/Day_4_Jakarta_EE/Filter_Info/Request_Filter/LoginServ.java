import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginServ extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			String name=req.getParameter("nm");
String age=req.getParameter("ag");
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<br>");
			pw.println("in side login servlet<br>");
			pw.println("<br>"+name+"    "+age);
		}
		catch(Exception ee)
		{
			System.out.println("in catch     "+ee);
		}
	}
}