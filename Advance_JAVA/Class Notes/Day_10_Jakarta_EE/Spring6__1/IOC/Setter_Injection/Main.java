package mypack;

import mypack.InjectSetter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args)
{
    BeanFactory beanfactory=new ClassPathXmlApplicationContext("injection.xml");
    System.out.println("after beanfactory creation");
    InjectSetter ic=(InjectSetter)beanfactory.getBean("a1");
    System.out.println(ic.getMessage());
    System.out.println(ic.getNum());
}
}

