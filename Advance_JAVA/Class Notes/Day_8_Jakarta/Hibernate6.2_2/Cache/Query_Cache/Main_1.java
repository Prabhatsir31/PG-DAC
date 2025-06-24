 package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;
import java.util.*;

public class Main_1 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Product p=new Product();
		p.setName("soap");
		p.setPrice(100);
		p.setQty(30);
		session.persist(p);
		tr.commit();
		session.close();
	    Session session1=factory.openSession();   
	    Product emp2=(Product)session1.get(Product.class,1);  
	    System.out.println(emp2);
	    Query<?> q1=session1.createQuery("select c.name from Product c where c.id=1",String.class);
	   
        q1.setCacheable(true);
      
        List<?> mylist=q1.list();
        
        System.out.println(mylist);
	    session1.close();  
	    
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); 
        System.out.println(factory.getStatistics().getQueryCacheHitCount()); 
        Session session2=factory.openSession();  
	    Product emp3=(Product)session2.get(Product.class,1);  
	    System.out.println(emp3);
	    session2.close();
	    Session session3=factory.openSession();
	    Query<?> q2=session3.createQuery("select c.name from Product c where c.id=1",String.class);
        q2.setCacheable(true);
      
        mylist=q2.list();
        
        System.out.println(mylist);
	    session3.close();  
	    
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); 
        System.out.println(factory.getStatistics().getQueryCacheHitCount()); 

	}
}
