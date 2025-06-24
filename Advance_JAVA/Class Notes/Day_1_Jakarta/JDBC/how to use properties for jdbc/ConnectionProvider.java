import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionProvider
{
	static Connection con;
	public static Connection getCon()
	{
		try
		{
			String url,user,password;
			ResourceBundle rb=ResourceBundle.getBundle("myproperty");
			url=rb.getString("url");
			user=rb.getString("user");
			password=rb.getString("password");
		 con=DriverManager.getConnection(url,user,password);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		return con;
	}
	
}








