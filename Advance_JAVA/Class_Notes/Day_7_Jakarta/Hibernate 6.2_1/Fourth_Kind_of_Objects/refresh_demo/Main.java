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
        
            //session.save(p);       deprecated in Hibernate 6
            session.persist(p);
            tr.commit(); 
           
            Scanner sc=new Scanner(System.in);
            System.out.println(sc.nextInt()); // go and change the row
// e.g
// mysql> update product set price=200 where id=1;
            System.out.println("Before refresh\t"+p);
            session.refresh(p);
            System.out.println("After refresh\t"+p);
            factory.close();
 
}

}