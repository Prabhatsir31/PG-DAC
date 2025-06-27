package mypack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;
import org.hibernate.query.SelectionQuery;

import java.util.*;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Query<?> query=session.createQuery("from Person",Person.class);
			List<?> mylist1=(List<?>) query.list();
			
			System.out.println(mylist1);
			
			SelectionQuery<?> query1=session.createSelectionQuery("select c.name from Person c");
			List<?> mylist2=(List<?>) query1.list();
			
			System.out.println(mylist2);	
			SelectionQuery<?> query2=session.createSelectionQuery("select c.name,c.age from Person c");
			List<?>mylist3=(List<?>) query2.list();
			
			for(int i=0;i<mylist3.size();i++)
        		{
		            Object str[]=(Object[])mylist3.get(i);
		            for(int j=0;j<str.length;j++)
		            {
		                System.out.print(str[j]+"\t");
		            }
		            System.out.println();
		          
		        }


			session.close();
			  factory.close();
			System.out.println("Done with Person");

	}
}
