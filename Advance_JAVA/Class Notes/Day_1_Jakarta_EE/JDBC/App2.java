import java.sql.*;
public class App2
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
System.out.println("Implementation class is\t"+con.getClass()); 
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept");
ResultSetMetaData rms=rs.getMetaData();
int col=rms.getColumnCount();
System.out.println("Details of Dept by explicitly registering");
	for(int i=1;i<=col;i++)
	{
		System.out.print(rms.getColumnName(i)+"\t");
	}
while(rs.next())
{
System.out.print("\n");
	for(int i=1;i<=col;i++)
	{
		System.out.print(rs.getObject(rms.getColumnName(i))+"\t");
	System.out.print(rs.getObject(i)+"\t");

	}

}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}						