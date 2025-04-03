
public class MyClass12
{
	static
	{
		System.out.println("in MyClass12 first static initializer");
	}
	public static void main(String args[])
	{
		System.out.println("in main");
		new A();		
	}
	
	static
	{
		System.out.println("in MyClass12 second static initializer");
	}
}
class A
{
	static
	{
		System.out.println("in A first static initializer");
	}
}