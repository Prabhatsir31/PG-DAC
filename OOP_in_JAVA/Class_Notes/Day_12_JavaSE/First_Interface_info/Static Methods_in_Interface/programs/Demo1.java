interface emp1
{
	static void disp1()
	{
		System.out.println("in disp1 of emp1");
	}
	default void disp2()
	{
		System.out.println("in disp2 of emp1");
	}
}
public class Demo1 implements emp1
{
	void disp1()
	{
		emp1.disp1();
		System.out.println("in disp1 of Demo1");
	}
	public void disp2() // must be public 
	{
		emp1.super.disp2();
		System.out.println("in disp2 of Demo1");
	}
	public static void main(String args[])
	{
		Demo1 d=new Demo1();
		d.disp1();
		d.disp2();
	}
}





	

	