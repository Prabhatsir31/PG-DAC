package mypack;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		 	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        EmployeeDAO cdi=(EmployeeDAO) ac.getBean("empdao");
	        Employee ref1=new Employee();
	        ref1.setName("aaa");
	        ref1.setSalary(25000);
	        Employee ref2=new Employee();
	        ref2.setName("bbb");
	        ref2.setSalary(35000);
	        Employee ref3=new Employee();
	        ref3.setName("ccc");
	        ref3.setSalary(45000);
	        Employee ref4=new Employee();
	        ref4.setName("ddd");
	        ref4.setSalary(55000);
	        
	        cdi.saveEmployee(ref1);
	        cdi.saveEmployee(ref2);
	        cdi.saveEmployee(ref3);
	        cdi.saveEmployee(ref4);
	        
	        List mylist=cdi.getEmployees();
	        Iterator itr=mylist.iterator();
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }
	   
	       ref3.setName("scott");
	       cdi.updateEmployee(ref3);
	       
	       Employee temp=cdi.getById(3);
	       System.out.println("after getbyid is\t"+temp);
	       
	       cdi.deleteEmployee(ref2);
	       System.out.println("After deleting");
	       
	       mylist=cdi.getEmployees();
	       itr=mylist.iterator();
	       while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }
	       
	       System.out.println("Done with HibernateTemplate");
	}
}
