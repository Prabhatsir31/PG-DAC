package trial;
interface A
{
	default void fun()
	{
		System.out.println("A fun");
	}
}

interface B
{
	default void fun()
	{
		System.out.println("B fun");
	}
}

class C implements A
{
	public void fun()
	{
		System.out.println("C fun");
	}
}
class D extends C implements B  
{
}
public class Demo15
{
	public static void main(String args[])
	{
		D ob=new D();
		ob.fun(); 
	}
}
