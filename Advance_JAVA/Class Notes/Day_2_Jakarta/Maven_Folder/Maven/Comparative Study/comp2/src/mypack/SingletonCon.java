package mypack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class SingletonCon
{
	static Connection con;
	static ResourceBundle rb;
	static
	{
		try {
			rb=ResourceBundle.getBundle("mypack.myproperty");
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		try
		{
			String url,user,password;
			
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

