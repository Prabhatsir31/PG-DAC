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

}
class D extends C implements B  
{
	public void fun()
	{
		System.out.println("D fun");
	}
}
public class Demo14
{
	public static void main(String args[])
	{
		D ob=new D();
		ob.fun(); 
	}
}

