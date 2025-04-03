package trial;


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
class xyz
{
	public String disp2()
	{
		return "in disp2 of xyz";
	}
} 
class MyClass extends xyz implements emp,emp1
{
	String disp2()  // error
	{
		return "in disp2 of MyClass";
	}
	public String disp1()
	{
		return "in disp1";
	}
}
public class Demo3_b
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
			