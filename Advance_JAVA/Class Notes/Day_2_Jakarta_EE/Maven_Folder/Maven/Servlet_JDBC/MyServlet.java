

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private Connection con;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String ss="jdbc:mysql://localhost:3306/mydb";
		try {
			con=DriverManager.getConnection(ss,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("hello world");
		pw.println("<br>");
		try
		{
		Statement st=con.createStatement();
		System.out.println("Implementation class of Statement is\t"+st.getClass().getName());
		ResultSet rs=st.executeQuery("select * from dept");
		System.out.println("Implementation class of ResultSet is\t"+rs.getClass().getName());
		while(rs.next())
		{
			int no=rs.getInt("deptno");
			String name=rs.getString("dname");
			String add=rs.getString("loc");
			pw.println(no+" "+name+" "+add);
			pw.println("<br>");
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
