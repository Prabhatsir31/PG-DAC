package core1;

import java.lang.reflect.Method;

public class Demo 
{
	public static void main(String args[])
	{
		Trial d=new Trial();
		Method m=null;
		try {
			m = d.getClass().getMethod("disp");
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyAnnotation ref=m.getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+ref.getFirst());
		System.out.println("value is: "+ref.getSecond());
	}
}	


	