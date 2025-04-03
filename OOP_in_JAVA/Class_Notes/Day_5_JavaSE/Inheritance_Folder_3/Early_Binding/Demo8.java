class sub extends Demo8
{
	void disp()  
	{
		System.out.println("sub disp");
	}
}
public class Demo8
{
	private void disp()
	{
		System.out.println("Demo8 disp");
	}
	public static void main(String args[])
	{
		Demo8 ref=new sub();
		ref.disp(); // early binding
	}
}