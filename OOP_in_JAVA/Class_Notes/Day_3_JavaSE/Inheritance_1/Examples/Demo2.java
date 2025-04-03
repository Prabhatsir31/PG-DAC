// constructor invocation in case of inheritance.
class base
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
	base()
	{
		System.out.println("in base no-arg");
	}
}
class sub extends base
{
	int num2=20;
	void disp2()
	{
		System.out.println(num2);
	}
	sub()
	{
		System.out.println("in sub no-arg");
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		sub s1=new sub();
		s1.disp1();
		s1.disp2();
	}
}










