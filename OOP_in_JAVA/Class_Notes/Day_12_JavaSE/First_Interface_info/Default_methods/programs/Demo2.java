//  error: Duplicate default methods named disp2 with the parameters () and () are inherited from the types emp1 and emp

interface emp
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp1
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class MyClass implements emp,emp1
{
	public String disp1()
	{
		return "in disp1";
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
		