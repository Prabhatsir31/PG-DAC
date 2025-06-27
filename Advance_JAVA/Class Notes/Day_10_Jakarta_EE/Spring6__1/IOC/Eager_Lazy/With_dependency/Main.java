package mypack;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
		  ClassPathXmlApplicationContext mycontext=new ClassPathXmlApplicationContext("injection.xml");
		    System.out.println("After ClassPathContext");
		    ParentBean ic=(ParentBean)mycontext.getBean("a1");
		    System.out.println("After getBean for ParentBean");
		    AnotherBean ab=(AnotherBean)mycontext.getBean("a2");
		    System.out.println("After getBean for AnotherBean");
		    ic.perform();
	}
}
