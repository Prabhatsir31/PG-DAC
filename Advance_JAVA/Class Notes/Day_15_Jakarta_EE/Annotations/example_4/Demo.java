
public class Demo 
{
	public static void main(String args[])
	{
		Trial d=new Trial();
		MyAnnotation m=d.getClass().getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+m.value());
		

		Sample s=new Sample();
		m=s.getClass().getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+m.value());
	}
}	


	