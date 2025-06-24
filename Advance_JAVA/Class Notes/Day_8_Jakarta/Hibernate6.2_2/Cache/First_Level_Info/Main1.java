package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;

public class Main1 
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
        p.setQty(75);
        p.setPrice(90);
        
        session.persist(p);
        tr.commit();
 
          
        System.out.println("done with product");
        // session.evict(p);
            Scanner sc=new Scanner(System.in);
            sc.nextInt();
            System.out.println("now loading");
      
          Product ref2=(Product)session.get(Product.class,1);   
            System.out.println(ref2);
         // session.evict(ref2);
         Product ref3=(Product)session.get(Product.class,1);  
            System.out.println(ref3);
	}
}
