import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PersonServ extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age").trim());
			pw.println(name+"          "+age);
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}