package mypack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfiguration {

	@Bean  // makes MyBean as a component
	public MyBean getMyDAOBean() // gets called only one
	{
		System.out.println("inside getMyDAOBean method");
		return new MyBean();
	}
}
