class base
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
}
class sub extends base
{
	int num2=20;
	void disp2()
	{
		System.out.println(num2);
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		sub s1=new sub();
		s1.disp1();
		s1.disp2();
	}
}








