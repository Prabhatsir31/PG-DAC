
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
		System.out.println(emp.super.disp2());
		// System.out.println(super.disp2()); // super reference is illegal in interface context 
		return "in disp2 of emp1";
	}
}
class MyClass implements emp1
{
	// must be public
	public String disp2()
	{
		System.out.println(emp1.super.disp2());
		//System.out.println(super.disp2()); // error: The method disp2() is undefined for the type Object
//System.out.println(emp.super.disp2());  //Illegal reference to super type emp, cannot bypass the more specific direct super type emp1

		return "in overridden method of MyClass";
	}
	public String disp1()
	{
		System.out.println(emp1.super.disp2());
		return "in disp1";
	}
}
public class Demo6_a
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
		