import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try(Connection con=ConnectionProvider.getCon())
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from dept");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
	
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}

	}

}
