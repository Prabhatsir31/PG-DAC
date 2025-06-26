package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;



public class EmployeeDAODatabaseImpl implements EmployeeDAO 
{
	private SessionFactory sf;
	private Session session;
	
	public EmployeeDAODatabaseImpl()
	{
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	@Override
	public void insertEmployee(Employee ref) 
	{
		
		session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		   session.persist(ref);
		   trans.commit();
		   session.close();
		   System.out.println("Done with commit");
		
		
	}

	@Override
	public Employee getEmployee() 
	{
		session=sf.openSession();
		Query<?> qry=session.createQuery("from Employee");
		List<?> mylist=qry.list();
		Employee ref=(Employee) mylist.get(0);
		session.close();
		return ref;
	}

}








