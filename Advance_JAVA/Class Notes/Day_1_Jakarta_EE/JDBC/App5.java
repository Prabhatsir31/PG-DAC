import java.sql.*;
public class App5 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
System.out.println("Implementation class is\t"+con.getClass());
PreparedStatement pst=con.prepareStatement("update dept set loc=?");
pst.setString(1,"delhi");
	//replace 1'st question mark with "delhi"
int mod=pst.executeUpdate();

if(mod>0)
{
	System.out.println("Records are successfully added");
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}








						