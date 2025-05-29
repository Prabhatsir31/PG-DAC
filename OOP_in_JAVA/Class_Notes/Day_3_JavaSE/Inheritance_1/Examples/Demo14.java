class base
{
	void disp() // overriden
	{
		System.out.println("base disp");
	}
}
class sub1 extends base   
{
	void disp() // overriding
	{
		System.out.println("sub disp");
		super.disp();
	}
}
public class Demo14
{
	public static void main(String args[])
	{
		sub1 s1=new sub1(); 
		s1.disp();
	}
}