package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
       
        ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext(args[0]);  // dynamically we can configure
  System.out.println("ClassPathXmlApplicationContext instantiated");
        AccountBean ab=(AccountBean)appContext.getBean("accountbean");
        ab.makeDeposit();
	}

}
