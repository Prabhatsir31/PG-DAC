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
		System.out.println("sub1 disp");
	}
	void print()
	{
		System.out.println("sub1 print");
	}
}
public class Demo27
{
	public static void main(String args[])
	{
		base ref=new sub1();  // upcasting
		ref.disp();  // late binding
		ref.print();
	}
}











