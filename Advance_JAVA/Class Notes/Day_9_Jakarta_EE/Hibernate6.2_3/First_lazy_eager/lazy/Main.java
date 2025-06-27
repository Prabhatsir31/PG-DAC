package mypack;

import java.util.*;

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
		Transaction tr=session.beginTransaction();
           Student s1=new Student();
           Phone p1=new Phone();
           p1.setPhoneNumber("9270682272");
           p1.setPhoneType("mobile");
           Phone p2=new Phone();
           p2.setPhoneNumber("2500727");
           p2.setPhoneType("resd");
           Set<Phone> h=new HashSet<Phone>();
           h.add(p1);
           h.add(p2);
           s1.setStudentName("abc");
           s1.setStudentPhoneNumbers(h);
           session.persist(s1);
           tr.commit(); 
           session.close();
           session=factory.openSession();
           Student ref=(Student)session.get(Student.class,1);
           //session.close();       
           System.out.println(ref.getStudentId());
           System.out.println(ref.getStudentName());
           System.out.println("\nLet's print phone numbers\n");
           System.out.println(ref.getStudentPhoneNumbers());
            System.out.println("done with student");  
	}
}
