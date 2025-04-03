/*

This is the “class wins” rule.
The “class wins” rule ensures compatibility with Java 7. If you add default methods to an interface, it has no effect on code that worked before java8.

*/

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
	public String disp2()
	{
		return "in disp2 of base";
	}
}
class MyClass extends base implements emp
{
	void perform()
	{
		System.out.println(emp.super.disp2());
	}
}
public class Demo9
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp2());
		m.perform();
	}
}
		