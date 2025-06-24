package mypack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
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
		Transaction tr=session.beginTransaction();
			
			Person p1=new Person("Abc",20);
			Person p2=new Person("Xyz",33);
			Person p3=new Person("Pqr",21);
			session.persist(p1);
			session.persist(p2);
			session.persist(p3);
			
			
			tr.commit();
			
			
			Query<?> query=session.createQuery("from Person",Person.class);
			List<?> mylist1=(List<?>) query.list();
			
			System.out.println(mylist1);
			factory.close();
			
	}
}
		

