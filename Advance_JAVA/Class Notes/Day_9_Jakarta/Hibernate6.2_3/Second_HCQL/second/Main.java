package mypack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
         
        HibernateCriteriaBuilder cb=session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteria=cb.createQuery(Employee.class);
        criteria.from(Employee.class);
        Query<?> q=session.createQuery(criteria);
        List<?> results = q.getResultList();
        System.out.println(results);
        
        System.out.println("find out only desig");
        CriteriaQuery<String>criteria1=cb.createQuery(String.class);
        Root<Employee> root = criteria1.from(Employee.class);
        criteria1.select(root.get("desig"));
        q=session.createQuery(criteria1);
        results = q.getResultList();
        System.out.println(results);
        
        System.out.println("how many records are there");
        CriteriaQuery<Long> criteria2=cb.createQuery(Long.class);
        root = criteria2.from(Employee.class);
        criteria2.multiselect(cb.count(root));
        q=session.createQuery(criteria2);
        results= q.getResultList();
        System.out.println(results);
        
        System.out.println("Find out whose salary is 25000");
        CriteriaQuery<Employee> criteria3=cb.createQuery(Employee.class);
        root = criteria3.from(Employee.class);
        criteria3.where(cb.equal(root.get("salary"), 25000.00));
        q=session.createQuery(criteria3);
        results= q.getResultList();
        System.out.println(results);
        
        System.out.println("Find out whose salary is greater than 25000");
        CriteriaQuery<Employee> criteria4=cb.createQuery(Employee.class);
        root = criteria4.from(Employee.class);
        criteria4.where(cb.greaterThan(root.get("salary"), 25000.00));
        q=session.createQuery(criteria4);
        results= q.getResultList();
        System.out.println(results);
        
        System.out.println("Find out where name contains p");
        CriteriaQuery<Employee> criteria5=cb.createQuery(Employee.class);
        root = criteria5.from(Employee.class);
        criteria5.where(cb.like(root.get("name"), "p%"));
        q=session.createQuery(criteria5);
        results= q.getResultList();
        System.out.println(results);
        
        System.out.println("salary in between 30000 and 50000");
        CriteriaQuery<Employee> criteria6=cb.createQuery(Employee.class);
        root = criteria6.from(Employee.class);
        criteria6.where(cb.between(root.get("salary"),30000,50000));
        q=session.createQuery(criteria6);
        results= q.getResultList();
        System.out.println(results);
        
        System.out.println("Find out those employees where salary greater than 20000 and designation is manager");
        CriteriaQuery<Employee> criteria7=cb.createQuery(Employee.class);
        root = criteria7.from(Employee.class);
        criteria7.where(cb.and(cb.greaterThan(root.get("salary"),20000)),cb.equal(root.get("desig"),"manager"));
        q=session.createQuery(criteria7);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out those employees where designation is accountant or clerk");
        CriteriaQuery<Employee> criteria8=cb.createQuery(Employee.class);
        root = criteria8.from(Employee.class);
   //  criteria8.where(cb.or(cb.greaterThan(root.get("salary"),40000)),cb.equal(root.get("desig"),"clerk"));
        criteria8.where(cb.or(cb.equal(root.get("desig"),"accountant"),cb.equal(root.get("desig"),"clerk")));
        q=session.createQuery(criteria8);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out those employees where salary greater than 40000 or designation is  clerk");
        CriteriaQuery<Employee> criteria9=cb.createQuery(Employee.class);
        root = criteria9.from(Employee.class);
        criteria9.where(cb.or(cb.greaterThan(root.get("salary"),40000),cb.equal(root.get("desig"),"clerk")));
        q=session.createQuery(criteria9);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out  employees order by salary ");
        CriteriaQuery<Employee> criteria10=cb.createQuery(Employee.class);
        root = criteria10.from(Employee.class);
        criteria10.orderBy(cb.asc(root.get("salary")));
        q=session.createQuery(criteria10);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out  employees in descending order by salary ");
        CriteriaQuery<Employee> criteria11=cb.createQuery(Employee.class);
        root = criteria11.from(Employee.class);
        criteria11.orderBy(cb.desc(root.get("salary")));
        q=session.createQuery(criteria11);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out  average of  salary ");
        CriteriaQuery<Double> criteria12=cb.createQuery(Double.class);
        root = criteria12.from(Employee.class);
        criteria12.multiselect(cb.avg(root.get("salary")));
        q=session.createQuery(criteria12);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out  minimum of  salary ");
        CriteriaQuery<Double> criteria13=cb.createQuery(Double.class);
        root = criteria13.from(Employee.class);
        criteria13.multiselect(cb.min(root.get("salary")));
        q=session.createQuery(criteria13);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out  maximum of  salary ");
        CriteriaQuery<Double> criteria14=cb.createQuery(Double.class);
        root = criteria14.from(Employee.class);
        criteria14.multiselect(cb.max(root.get("salary")));
        q=session.createQuery(criteria14);
        results= q.getResultList();
        System.out.println(results);
     
        System.out.println("Find out  sum of  salary ");
        CriteriaQuery<Double> criteria15=cb.createQuery(Double.class);
        root = criteria15.from(Employee.class);
        criteria15.multiselect(cb.sum(root.get("salary")));
        q=session.createQuery(criteria15);
        results= q.getResultList();
        System.out.println(results);

        System.out.println("list those names where salary is 25000");
        CriteriaQuery<String> criteria16=cb.createQuery(String.class);
        root = criteria16.from(Employee.class);
        criteria16.select(root.get("name"));
        criteria16.where(cb.equal(root.get("salary"), 25000.00));
        q=session.createQuery(criteria16);
        results= q.getResultList();
        System.out.println(results);

	 }
}
