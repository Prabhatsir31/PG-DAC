interface emp
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp1 extends emp
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class MyClass implements emp1
{
	// must be public
	public String disp2()
	{
		return "in overridden method of MyClass";
	}
	public String disp1()
	{
		return "in disp1";
	}
}
public class Demo5
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
		