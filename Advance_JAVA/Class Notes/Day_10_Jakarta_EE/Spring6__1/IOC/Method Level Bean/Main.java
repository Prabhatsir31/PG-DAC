package mypack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("mypack");
		context.refresh(); // org.springframework.context.annotation.AnnotationConfigApplicationContext@5f4da5c3 has not been refreshed yet
		MyBean mbean = context.getBean(MyBean.class);
		System.out.println(mbean.getMessage());
		MyBean1 mbean1=context.getBean(MyBean1.class);
		System.out.println(mbean1.getValue());
		MyBean mbean2 = context.getBean(MyBean.class);
		System.out.println(mbean2.getMessage());

	}

}
