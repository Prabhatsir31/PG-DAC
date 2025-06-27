package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
      ApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
      //Car car=context.getBean("car1",Car.class);
      Car car=context.getBean("car2",Car.class);
      System.out.println(car.dispCar());
	}

}
