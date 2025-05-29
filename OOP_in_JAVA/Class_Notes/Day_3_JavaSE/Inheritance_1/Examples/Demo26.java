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
}
class sub2 extends sub1
{
}
public class Demo26
{
	public static void main(String args[])
	{
		base ref=new sub2();  // upcasting
		ref.disp();  // late binding
	}
}



