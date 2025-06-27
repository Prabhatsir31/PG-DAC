package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("mycontext.xml");  
	        Sample ref1 = (Sample) context.getBean("sample");  
		System.out.println(ref1.getClass().getName());
	        System.out.println("calling disp1...");  
	        ref1.disp1();  
	        System.out.println("calling disp2...");  
	        ref1.disp2(); 
	        System.out.println("calling disp3...");  
	        ref1.disp3();  

	}

}
