public class MyClass3
{
	static 
	{
		System.out.println("in MyClass3 static 1");
	}
	public static void main(String args[])
	{
		System.out.println("in main 1");
		new A();
	}
	static 
	{
		System.out.println("in MyClass3 static 2");
	}
}
class A
{
	static 
	{
		System.out.println("in A static block 1");
	}
}