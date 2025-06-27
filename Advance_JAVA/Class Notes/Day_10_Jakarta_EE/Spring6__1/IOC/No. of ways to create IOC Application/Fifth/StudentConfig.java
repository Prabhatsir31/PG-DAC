package mypack;
// IOC container invokes the method annotated with @Bean
// collects the object which the method returns and
// gives it back to main function whenever main function
// ask for the object

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // informs Spring IOC that the class is an alternative for spring bean configuration xml file
public class StudentConfig 
{
	@Bean    // alternative for @Component on the class Student
	public Student getStudent()
	{
		Student s=new Student();
		return s;
	}

}
