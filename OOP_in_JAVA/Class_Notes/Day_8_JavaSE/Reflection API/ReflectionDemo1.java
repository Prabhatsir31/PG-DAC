import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1
{
	public static void main(String args[])
	{
		Class c=null;
		try {
			c=Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method methods[]=c.getDeclaredMethods();
		for(int i=0;i<methods.length;i++)
		{
			System.out.println(methods[i]);
		}
		System.out.println();
		System.out.println("Let's display constructors");
		Constructor constructors[]=c.getDeclaredConstructors();
		for(int i=0;i<constructors.length;i++)
		{
			System.out.println(constructors[i]);
		}
		System.out.println();
		System.out.println("Let's display fields");
		Field fields[]=c.getDeclaredFields();
		for(int i=0;i<fields.length;i++)
		{
			System.out.println(fields[i]);
		}
	}
}


























