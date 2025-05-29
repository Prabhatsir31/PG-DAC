class base
{
	void disp()
	{
		System.out.println("base disp");
	}
}
class sub1 extends base     
{
	void disp()
	{
		System.out.println("sub disp");
	}
}
public class Demo18
{
	public static void main(String args[])
	{
		sub1 s1=new sub1(); 
		s1.disp();
	}
}