package mypack;
// how to give customized name/s to the bean

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class CarConfig 
{
	@Bean
	public Engine getEngine()
	{
		return new Engine();
	}
	// you can give n number of values as names
	@Bean(name= {"car1","car2"})   
	public Car getCar()
	{
		Car c=new Car(getEngine());
		return c;
	}

}
