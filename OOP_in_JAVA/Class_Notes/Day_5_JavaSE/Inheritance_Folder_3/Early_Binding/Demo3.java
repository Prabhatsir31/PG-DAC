class base
{
	static void disp()
	{
		System.out.println("base disp");
	}
}
class sub extends base
{
	void disp()  // error     overridden method is static
	{
		System.out.println("sub disp");
	}
}
public class Demo3
{
	public static void main(String args[])
	{
		sub s=new sub();
		s.disp();
		base ref=new sub();
		ref.disp();

	}
}