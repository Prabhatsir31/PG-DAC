package mypack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // informs Spring IOC that the class is an alternative for spring bean configuration xml file
@ComponentScan(basePackages="mypack")

public class StudentConfig 
{

}
