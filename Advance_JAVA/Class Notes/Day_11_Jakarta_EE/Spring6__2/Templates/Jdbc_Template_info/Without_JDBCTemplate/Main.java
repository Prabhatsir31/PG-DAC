package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	        CustomerDAO cd=(CustomerDAO)ac.getBean("customerDAO");
	        Customer c1=new Customer();
	        c1.setCustomerId(1);
	        c1.setCustomerName("sachin");
	        c1.setAddress("Mumbai");
	        cd.insertCustomer(c1);
	        System.out.println("Done");
	}
}



