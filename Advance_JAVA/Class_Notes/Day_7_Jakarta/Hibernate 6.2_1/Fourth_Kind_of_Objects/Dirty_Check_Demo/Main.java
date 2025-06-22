package mypack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;
public class Main 
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
           
            Scanner sc=new Scanner(System.in);
            System.out.println(sc.nextInt()); // go and check in database

            tr=session.beginTransaction();
            p.setPrice(190); // if u change this then only hibernate will fire update query on commit
            tr.commit();
            session.close();
            factory.close();
}
}