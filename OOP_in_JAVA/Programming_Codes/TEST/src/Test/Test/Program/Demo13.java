class base
{
	void disp() // overridden
	{
		System.out.println("base disp");
	}
}
class sub1 extends base   
{
	void disp() // overriding
	{
		System.out.println("sub disp");
	}
}
public class Demo13
{
	public static void main(String args[])
	{
		sub1 s1=new sub1(); 
		s1.disp();
	}
}