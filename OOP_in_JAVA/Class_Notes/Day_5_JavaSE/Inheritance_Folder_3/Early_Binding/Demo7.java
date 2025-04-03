class base
{
	private void disp()
	{
		System.out.println("base disp");
	}
}
class sub extends base
{
	void disp()  
	{
		System.out.println("sub disp");
	}
}
public class Demo7
{
	public static void main(String args[])
	{
		base ref=new sub();
		ref.disp(); // error  disp() has private access in base
	}
}











