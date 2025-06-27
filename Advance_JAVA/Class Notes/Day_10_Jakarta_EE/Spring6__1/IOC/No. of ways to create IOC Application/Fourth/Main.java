package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
      ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
      Student student=context.getBean("student",Student.class);
      student.setName("Pqr");
      student.setAge(22);
      System.out.println(student);
	}

}
