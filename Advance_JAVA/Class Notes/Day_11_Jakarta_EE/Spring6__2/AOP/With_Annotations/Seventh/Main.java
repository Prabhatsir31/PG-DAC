package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("mycontext.xml");  
	        Sample ref1 = (Sample) context.getBean("sample");  
	       System.out.println(ref1.getClass().getName());
	        ref1.setName("abc");  
	        System.out.println(ref1.getName());
	        ref1.setAge(20);
	        System.out.println(ref1.getAge());
	        
	        Sample1 ref2=(Sample1)context.getBean("sample1");
	        System.out.println(ref2.getClass().getName());
	        ref2.setUname("scott");
	        System.out.println(ref2.getUname());
	        ref2.setPwd("tiger");
	        System.out.println(ref2.getPwd());

	}

}
