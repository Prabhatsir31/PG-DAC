class base
{
	final void disp() 
	{
		System.out.println("base disp");
	}
}
class sub1 extends base   
{
/*	void disp()  // error,can not override final method
	{
		System.out.println("sub disp");
	}*/
}
public class Demo16
{
	public static void main(String args[])
	{
		sub1 s1=new sub1(); 
		s1.disp();
	}
}