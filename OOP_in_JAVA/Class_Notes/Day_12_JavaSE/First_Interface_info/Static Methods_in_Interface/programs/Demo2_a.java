package core1;
//static interface methods can be accessed only with the help of same interface in which they are declared.



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
interface emp2 extends emp1
{
	static void disp1()
	{
		System.out.println("in disp1 of emp2");
	}
}
public class Demo2_a implements emp1
{
	void disp1()
	{
		emp1.disp1();
		System.out.println("in disp1 of Demo2");
	}
	public void disp2() // must be public 
	{
		emp1.super.disp2();
		System.out.println("in disp2 of Demo2");
	}
	public static void main(String args[])
	{
		Demo2_a d=new Demo2_a();
		 d.disp1(); 
		emp1.disp1();
		d.disp2();
		emp2.disp1();
	}
}







	

	