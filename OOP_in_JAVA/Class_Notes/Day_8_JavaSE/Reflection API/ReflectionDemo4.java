import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Sample
{
	private int num1=200;
	public int num2=400;
	public Sample()
	{
		
	}
	private void disp1()
	{
		System.out.println("in disp1");
	}
	public void disp2()
	{
		System.out.println("in disp2");
	}
	public int getNum1()
	{
		return num1;
	}
}
public class ReflectionDemo4
{
		public static void main(String args[])
		{
			try
			{
				Class c=Class.forName("Sample");
				
				Method m=c.getDeclaredMethod("disp1",null);
			
				Sample s=new Sample();

				m.setAccessible(true); 

				m.invoke(s,null);
				
				System.out.println("Before modifying\t"+s.getNum1());
				
				Field value = c.getDeclaredField("num1");
				 value.setAccessible(true);  
			      
			    value.set(s,120);
			    
			    System.out.println("After modifying\t"+s.getNum1());

				
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
}

