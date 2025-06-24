package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction(); 
        
            Company c1=new Company();
            Account a1=new Account();
            a1.setBalance(20000);
            c1.setName("capgemini");
            c1.setLocation("mumbai");
            c1.setAcc(a1);
          
            Company c2=new Company();
            Account a2=new Account();
            a2.setBalance(40000);
            c2.setName("smartstream");
            c2.setLocation("banglore");
            c2.setAcc(a2);
            session.persist(c1);
            session.persist(c2);
            transaction.commit(); 
            System.out.println("done with company");  
		}
}
