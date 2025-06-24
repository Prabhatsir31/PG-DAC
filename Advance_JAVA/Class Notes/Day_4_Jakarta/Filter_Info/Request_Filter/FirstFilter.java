package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstFilter implements Filter
{
	public void init(FilterConfig conf)
	{
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)
	{
		try
		{
		String name=req.getParameter("nm");
		String age=req.getParameter("ag");
		FileWriter fw=new FileWriter("d:\\loginfile.txt");
		fw.write(name);
		fw.write(age);
		fw.close();
PrintWriter pw=res.getWriter();
pw.println("<br>Data saved in a file<br>");	
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