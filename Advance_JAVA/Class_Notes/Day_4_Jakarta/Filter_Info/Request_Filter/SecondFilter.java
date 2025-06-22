package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SecondFilter implements Filter
{
	public void init(FilterConfig conf)
	{
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)
	{
		try
		{
			int age=Integer.parseInt(req.getParameter("ag"));
			PrintWriter pw=res.getWriter();
			if(age<18)
			{
				pw.println("voting not allowed<br>");
			}
			else
			{
				pw.println("voting allowed<br>");
			}

			chain.doFilter(req,res);

		}
		catch(Exception e)
		{
			System.out.println("in first"+e);
		}
	}
	public void destroy()
	{
	}
}