package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		 ApplicationContext context=new ClassPathXmlApplicationContext("inject.xml");  
		    MyClass2 m2=(MyClass2) context.getBean("x");  
		   m2.disp();  

	}

}
