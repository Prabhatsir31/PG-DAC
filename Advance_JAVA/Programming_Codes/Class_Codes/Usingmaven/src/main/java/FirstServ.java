import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

/**
 * Servlet implementation class FirstServ
 */
@WebServlet("/FirstServ")
public class FirstServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter out=response.getWriter();
			out.println("With Connection Pool");
			con=ds.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from product");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				out.print(rs.getInt(1)+ "\t");
				out.print(rs.getString(2)+ "\t");		
				out.print(rs.getInt(3)+ "\t");
				out.println(rs.getFloat(4));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println("In Service\t"+ex);
		}

	}

}