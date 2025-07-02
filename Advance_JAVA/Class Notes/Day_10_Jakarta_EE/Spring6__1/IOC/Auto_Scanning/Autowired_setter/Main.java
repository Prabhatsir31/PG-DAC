package mypack;
import mypack.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
    	System.out.println("with component scan");
        BeanFactory bf=new ClassPathXmlApplicationContext("tech.xml");
	System.out.println("Before calling getBean");
        Book book=(Book)bf.getBean("mybook");
        System.out.println(book);
    }
}

