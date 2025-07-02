package mypack;


import mypack.MyClass;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        BeanFactory bf=new ClassPathXmlApplicationContext("lazy.xml");
        System.out.println("After Context");
        MyClass ob1=(MyClass)bf.getBean("a1");
        System.out.println(ob1.getMessage());
        System.out.println("Creating another bean");
        MyClass ob2=(MyClass)bf.getBean("a1");
        System.out.println(ob2.getMessage());
        if(ob1==ob2)
        {
        	System.out.println("ob1 and ob2 are ==");
        }
        else
        {
        	System.out.println("ob1 and ob2 are not ==");
        }
    }
}











