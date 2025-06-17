

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class StudentServ2
 */
@WebServlet("/StudentServ2")
public class StudentServ2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con=null;
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydb";
			con=DriverManager.getConnection(url,"root","prabhu");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			PreparedStatement pst=con.prepareStatement("insert into student(name,age) values(?,?)");
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age").trim());
			pst.setString(1,name);
			pst.setInt(2,age);
			int result=pst.executeUpdate();
			if(result>0)
			{
				pw.println("record added");
			}
			else
			{
				pw.println("record not added");
			}
		     }
		     catch(Exception ee)
		     {
		    	 ee.printStackTrace();
		     }
	}

}
