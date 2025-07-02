
package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import java.util.*;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=null;
		Query<?> query=session.createQuery("from Person",Person.class);
			List<?> mylist1=query.list();
			
			System.out.println(mylist1);
			tr=session.beginTransaction();
			MutationQuery query1 =session.createMutationQuery("update Person p set p.name='Amar'");
			int k=query1.executeUpdate();
			tr.commit();
			
			  new Scanner(System.in).next(); 
			  System.out.println("Records updated\t"+k);
			  session.close(); 
			  session=factory.openSession();
			  query=session.createQuery("from Person",Person.class); mylist1=query.list();
			  
			  System.out.println(mylist1); 
			  tr=session.beginTransaction();
			  MutationQuery query2=session.createMutationQuery("update Person p set p.name=:str");
			  query2.setParameter("str","vishal"); 
			  k=query2.executeUpdate(); 
			  tr.commit(); 
			  new  Scanner(System.in).next(); 
			  System.out.println("Records updated\t"+k);
			  session.close(); 
			  session=factory.openSession();
			  query=session.createQuery("from Person",Person.class); 
			  mylist1=query.list();
			  System.out.println(mylist1);
			  
			  
			  tr=session.beginTransaction();
	MutationQuery query3=session.createMutationQuery("update Person p set p.name=:str1 where p.age > :j"); 
			  query3.setParameter("str1","varun"); 
			  query3.setParameter("j",30);
			  k=query3.executeUpdate(); 
			  tr.commit();
			  System.out.println("Records updated\t"+k); session.close();
			  System.out.println("Done with Person"); factory.close();
			 
	}
}

