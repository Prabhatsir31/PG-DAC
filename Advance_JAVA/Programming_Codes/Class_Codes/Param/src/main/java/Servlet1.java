

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(
		urlPatterns = { "/Servlet1" }, 
		initParams = { 
				@WebInitParam(name = "Book", value = "java")
		})
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = getServletConfig().getInitParameter("Book");
		PrintWriter pw = response.getWriter();
		pw.println("init paramter value is " + value);
		
		String value1 = getServletContext().getInitParameter("database");
		pw.println("context parameter is " + value1);
		
	}

}
