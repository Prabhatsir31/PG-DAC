package core;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
public class App1 
{
	public static void main(String args[])
	{
		try(CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();)
		{
			crs.setUsername("root");
			crs.setPassword("root");
			crs.setUrl("jdbc:mysql://localhost:3306/mydb");
			crs.setCommand("select * from dept");
			crs.execute();
			System.out.println("Even after connection closed with ARM");
			while(crs.next())
			{
				int a=crs.getInt(1);
				String b=crs.getString(2);
				String c=crs.getString(3);
				System.out.println(a+"\t"+b+"\t"+c);
			}

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

	}
}	


					