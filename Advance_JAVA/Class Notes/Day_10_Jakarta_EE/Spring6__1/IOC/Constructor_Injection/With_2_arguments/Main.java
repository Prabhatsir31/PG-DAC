package javaapplication2;

import mypack.InjectConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args)
{
    BeanFactory beanfactory=new ClassPathXmlApplicationContext("injection.xml");
    InjectConstructor ic=(InjectConstructor)beanfactory.getBean("a1");
    System.out.println(ic.getMessage());
    System.out.println(ic.getNum());
}
}
