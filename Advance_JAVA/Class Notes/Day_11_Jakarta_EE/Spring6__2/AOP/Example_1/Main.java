package mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aopdemo.xml");
        Product product=(Product)ac.getBean("product");
System.out.println(product.getClass().getName());
        int result=product.multiply(10,20);
        System.out.println("First Result\t"+result);
       
    }
}









