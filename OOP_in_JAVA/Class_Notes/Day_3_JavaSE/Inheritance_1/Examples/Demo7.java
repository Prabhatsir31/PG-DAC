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
class sub1 extends base    //error
{
	int num2=20;
	void disp2()
	{
		System.out.println(num2);
	}
}
class sub2 extends sub1
{
	int num3=30;
	void disp3()
	{
		System.out.println(num3);
	}
	sub2(int num3)
	{
		this.num3=num3;
	}
}
public class Demo7
{
	public static void main(String args[])
	{
		sub2 s1=new sub2(10); 
		s1.disp1();
		s1.disp2();
		s1.disp3();
	}
}






