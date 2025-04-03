class base
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
	base(int num1)
	{
		this.num1=num1;
		System.out.println("in base param");
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
		super(10);
		System.out.println("in sub no-arg");
		// super(10); Error, super has to be on first line
	}
}
public class Demo4
{
	public static void main(String args[])
	{
		sub s1=new sub(); 
		s1.disp1();
		s1.disp2();
	}
}