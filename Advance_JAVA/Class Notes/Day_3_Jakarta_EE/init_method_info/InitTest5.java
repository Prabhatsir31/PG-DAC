import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InitTest5 extends HttpServlet
{
	private ServletConfig conf;
	public void init(ServletConfig conf)throws ServletException
	{
		this.conf=conf;
		System.out.println("inside init(ServletConfig conf) method");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("Overriding init(ServletConfig conf) <br> not invoking parent init(ServletConfig conf) <br> but saving conf for init and context parameter<br>");

		pw.println("Config parameter value  "+conf.getInitParameter("user")+"<br>");
		pw.println("Context parameter value   "+conf.getServletContext().getInitParameter("database"));
		pw.println("</body></html>");		
	}
}
		

		