/*
class A
{
	public static A ref=new A();
	static
	{
		System.out.println("in A static block");
	}
	A()
	{
		System.out.println("in A default constructor");
	}
}
*/


class A
{
	static
	{
		System.out.println("in A static block");
	}
	public static A ref=new A();
	
	A()
	{
		System.out.println("in A default constructor");
	}
}

public class DemoApp
{
	public static void main(String args[])
	{
		System.out.println(A.ref);
		System.out.println("in main");
	}
}