class base
{
	void disp()
	{
		System.out.println("base disp");
	}
}
class sub extends base
{
	static void disp()  // error  overriding method is static
	{
		System.out.println("sub disp");
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		sub s=new sub();
		s.disp();
		base ref=new sub();
		ref.disp();

	}
}