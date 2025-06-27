package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setEname("Harry");
		e2.setEname("Javed");
		Project p1=new Project();
		Project p2=new Project();
		p1.setPname("Emart");
		p2.setPname("Etour");

		// Harry works on both the projects
		e1.getProjects().add(p1);
		e1.getProjects().add(p2);
		// Javed works on second project only
		e2.getProjects().add(p2); 

		// Project 1 is done by only Harry
		p1.getEmployees().add(e1);
		// Project 2 is done by Harry and Javed
		p2.getEmployees().add(e1);
		p2.getEmployees().add(e2);  
		
		session.persist(e1);
		session.persist(e2);
		session.persist(p1);
		session.persist(p2);
		tr.commit();
		System.out.println("Let's retrieve projects from employees");
		Employee ref1=(Employee)session.get(Employee.class,1);
		System.out.println(ref1.getEname()+" is working on Projects\t"+ref1.getProjects());
		
		Employee ref2=(Employee)session.get(Employee.class,2);
		System.out.println(ref2.getEname()+" is working on Projects\t"+ref2.getProjects());
		System.out.println();
		System.out.println("Let's retrieve employees from projects");
		
		Project ref3=(Project)session.get(Project.class,1);
		System.out.println(ref3.getPname()+"  is done by\t"+ref3.getEmployees());
		
		Project ref4=(Project)session.get(Project.class,2);
		System.out.println(ref4.getPname()+"  is done by\t"+ref4.getEmployees());
		factory.close();
		System.out.println("Done with Many to Many");
	}

}
