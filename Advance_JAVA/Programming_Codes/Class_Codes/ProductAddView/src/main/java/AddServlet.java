

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
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
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
			PreparedStatement pst=con.prepareStatement("insert into product(proname,qty,price) values(?,?,?)");
			String proname=request.getParameter("proname");
			int qty=Integer.parseInt(request.getParameter("qty").trim());
			float price=Integer.parseInt(request.getParameter("price").trim());
			pst.setString(1,proname);
			pst.setInt(2,qty);
			pst.setFloat(3, price);
			int result=pst.executeUpdate();
			if(result>0)
			{
				pw.println("product added");
			}
			else
			{
				pw.println("product not added");
			}
		     }
		     catch(Exception ee)
		     {
		    	 ee.printStackTrace();
		     }
	
	}

}
