

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServ1
 */
@WebServlet(value="/MyServ1",loadOnStartup=1)
public class MyServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static
	{
		System.out.println("inside static block of MyServ1");
	}
	
    /**
     * Default constructor. 
     */
    public MyServ1() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("in doget of MyServ1");
	}

}
