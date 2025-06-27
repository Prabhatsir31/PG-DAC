package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
        /* Load the welcomeUser.xml to classpath  */
        ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext("account.xml");
        System.out.println("Classpath loaded");
        AccountBean ab=(AccountBean)appContext.getBean("accountbean");
        ab.makeDeposit();
	}

}
