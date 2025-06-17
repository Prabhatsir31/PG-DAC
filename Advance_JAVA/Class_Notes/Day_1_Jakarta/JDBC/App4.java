import java.sql.*;
public class App4 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
System.out.println("Implementation class is\t"+con.getClass());
PreparedStatement pst=con.prepareStatement("select * from dept");
ResultSet rs=pst.executeQuery();
while(rs.next())
{
	int  no=rs.getInt("deptno");
	String name=rs.getString("dname");
	String loc=rs.getString("loc");
	System.out.println(no+"\t"+name+"\t"+loc);
}

}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}






						