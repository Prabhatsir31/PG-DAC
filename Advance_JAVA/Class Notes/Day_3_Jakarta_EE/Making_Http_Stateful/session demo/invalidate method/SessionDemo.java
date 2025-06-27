import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SessionDemo extends HttpServlet
{
	int cnt=0;
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
			try
		{
			cnt++;
			PrintWriter pw=response.getWriter();
			HttpSession session=request.getSession();
			if(session.isNew())
			{
				pw.println("it is new");
			}
			else
			{
				pw.println("it is not new");
			}
			if(cnt>4)
			{
				session.invalidate();
				cnt=0;
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}