class base
{
	final void disp()
	{
		System.out.println("base disp");
	}
}
class sub extends base
{
	/*void disp()  Not Possible
	{
		System.out.println("sub disp");
	}*/
}
public class Demo6
{
	public static void main(String args[])
	{
		base ref=new sub();
		ref.disp(); // early binding
	}
}