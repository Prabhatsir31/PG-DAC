package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	        CustomerDAO cd=(CustomerDAO)ac.getBean("customerDAO");
	        Customer c1=new Customer();
	        c1.setCustomerId(1);
	        c1.setCustomerName("aaa");
	        c1.setAddress("Banglore");
	        cd.insertCustomer(c1);
		Customer c2=new Customer();
	        c2.setCustomerId(2);
	        c2.setCustomerName("bbb");
	        c2.setAddress("Mumbai");
	        cd.insertCustomer(c2);
		Customer c3=new Customer();
	        c3.setCustomerId(3);
	        c3.setCustomerName("ccc");
	        c3.setAddress("delhi");
	        cd.insertCustomer(c3);

		List<?> mylist=cd.viewCustomers();
		System.out.println(mylist);
	
	        System.out.println("Done with JDBCTemplate");
	        
	}
}





