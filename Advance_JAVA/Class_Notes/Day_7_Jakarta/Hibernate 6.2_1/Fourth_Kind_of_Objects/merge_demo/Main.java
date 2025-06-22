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
        session.close();
        System.out.println("before changing qty\t"+p);
        p.setQty(150); // detached
        System.out.println("after changing qty\t"+p);
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.nextInt()); // go and check the database, u wont find changes
        session=factory.openSession();
        tr=session.beginTransaction();
        //session.update(p);  deprecated in Hibernate 6
        /* merge() will retrieve the record from database
         * and match it with the instance on the heap
         * if there is a difference (we might have changed the 
         * value of one of the fields) then only it will 
         * fire update query
         */
        session.merge(p); //reassociate detached entity with a new session
        tr.commit(); 
        session.close();
        factory.close();

	}
}
