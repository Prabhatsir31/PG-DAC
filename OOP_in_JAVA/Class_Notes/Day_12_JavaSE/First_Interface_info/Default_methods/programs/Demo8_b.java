package trial;
interface emp
{
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
class base
{
	// must be public
	String disp2()
	{
		return "in disp2 of base";
	}
}

class MyClass extends base implements emp  
{
	public String disp2()
	{
		return "in disp2 of MyClass";
	}
}
public class Demo8_b
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp2());
	}
}
		
		
			