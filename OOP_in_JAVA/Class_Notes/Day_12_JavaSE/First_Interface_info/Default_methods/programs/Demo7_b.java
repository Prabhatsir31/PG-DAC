interface emp
{
	int k=10; // public static and final
	// private int g=40;  modifier private not allowed
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp1 
{
	String k="hello";
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class MyClass implements emp,emp1
{
	// must be public
	public String disp2()
	{
		System.out.println(emp1.super.disp2());
//System.out.println(emp.super.disp2());  not an enclosing class: emp

		return "in overridden method of MyClass";
	}
	public String disp1()
	{
		return "in disp1";
	}
}
public class Demo7_b
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
		System.out.println("emp data is\t"+emp.k);
		System.out.println("emp1 data is\t"+emp1.k);
		System.out.println("MyClass data is\t"+MyClass.k); // ambiguity error
		//emp.k=20; error
	}
}









