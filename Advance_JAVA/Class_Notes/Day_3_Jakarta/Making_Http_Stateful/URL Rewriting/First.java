import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class First extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession s=req.getSession();
		PrintWriter out=res.getWriter();
		
		s.setAttribute("gender","male");
out.println("<html><body>");
out.println("<a href=\"" +res.encodeURL("Second")+ "\">click me for second</a>");
out.println("</body></html>");
		

	}
}