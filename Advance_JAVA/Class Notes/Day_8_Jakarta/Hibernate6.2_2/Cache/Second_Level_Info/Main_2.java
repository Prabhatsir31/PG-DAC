package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;

public class Main_2
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
		session1.close();  
		    
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); //Prints 0
		      
	    Session session2=factory.openSession();  
		Product emp3=(Product)session2.get(Product.class,1);  
		
		System.out.println(emp3);
		    session2.close();  
		    
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); //Prints 1
            
        Session session3=factory.openSession();  
        Product emp4=(Product)session3.get(Product.class,1);  
			
		System.out.println(emp4);
		 session3.close();  
		    
		    
		  // it will prints 2 because , we have hit second level cache twice by now
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); 

	}
}
