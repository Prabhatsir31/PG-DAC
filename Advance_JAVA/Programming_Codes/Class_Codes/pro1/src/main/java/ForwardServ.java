

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ForwardServ
 */
@WebServlet("/ForwardServ")
public class ForwardServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			ServletContext context=getServletContext();
			ServletContext context1=context.getContext("/pro2");
			RequestDispatcher rd=context1.getRequestDispatcher("/FirstServ"); 
			rd.forward(request,response);
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}	
