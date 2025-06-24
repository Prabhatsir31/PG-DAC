package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;

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
           Student s1=new Student();
           Phone p1=new Phone();
           p1.setPhoneNumber("923456789");
           p1.setPhoneType("mobile");
           Phone p2=new Phone();
           p2.setPhoneNumber("2654321");
           p2.setPhoneType("resd");
           Set<Phone> h=new HashSet<Phone>();
           h.add(p1);
           h.add(p2);
           s1.setStudentName("abc");
           s1.setStudentPhoneNumbers(h);
           session.persist(s1);
           transaction.commit(); 
            System.out.println("done with student");  

}
}