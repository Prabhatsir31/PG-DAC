public class trial
{
	trial()
	{
		this(30);
		System.out.println("in def const");
		// this(30); error
	}
	trial(int k)
	{
		this(20,40);
		System.out.println("in 1 param");
	}
	trial(int x,int y)
	{
		System.out.println("in 2 param");
	}
	public static void main(String args[])
	{
		trial t=new trial();
	}
}