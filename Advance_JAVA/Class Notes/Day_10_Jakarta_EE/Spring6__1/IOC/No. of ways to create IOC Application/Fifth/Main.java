package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
      ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
      Student student=context.getBean("getStudent",Student.class);
      student.setName("Xyz");
      student.setAge(25);
      System.out.println(student);
	}

}
