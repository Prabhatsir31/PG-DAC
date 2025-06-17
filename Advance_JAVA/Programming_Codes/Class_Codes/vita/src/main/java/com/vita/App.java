package com.vita;
import java.sql.*;
public class App
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","prabhu"))
		{
			System.out.println("Implementation class is\t"+con.getClass()); 
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				int no=rs.getInt("rollno");
				String name=rs.getString("name");
				String age=rs.getString("age");
				System.out.println(no+"\t"+name+"\t"+age);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}	


					