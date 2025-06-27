package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
      ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
      Student student=context.getBean("student",Student.class);
      student.setName("Abc");
      student.setAge(20);
      System.out.println(student);

	}

}
