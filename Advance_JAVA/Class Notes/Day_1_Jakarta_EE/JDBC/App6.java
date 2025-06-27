import java.sql.*;
public class App6 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
CallableStatement cst=con.prepareCall("{ call mypro1(?,?)}");
cst.setInt(1,3);
cst.execute();
String name=cst.getString(2);
System.out.println("dept.name retrieved is  "+name);
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}						