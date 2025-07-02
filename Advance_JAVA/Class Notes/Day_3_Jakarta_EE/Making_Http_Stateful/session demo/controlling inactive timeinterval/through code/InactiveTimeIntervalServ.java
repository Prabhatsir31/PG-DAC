import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InactiveTimeIntervalServ extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("first servlet");
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(120);
		if(session.isNew())
		{
			pw.println("session is new");
		}
		else
		{
			pw.println("session is not new");
		}
		}
	}


