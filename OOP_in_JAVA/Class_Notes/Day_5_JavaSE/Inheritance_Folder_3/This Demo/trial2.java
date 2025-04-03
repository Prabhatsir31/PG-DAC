class base
{
	base(int k)
	{
		System.out.println("in base param");
	}
}
public class trial2 extends base
{
	trial2()
	{
		this(30);
		System.out.println("in def const");
	}
	trial2(int k)
	{
		this(20,40);
		System.out.println("in 1 param");
	}
	trial2(int x,int y)
	{
		super(30); // super is required here
		System.out.println("in 2 param");
	}
	public static void main(String args[])
	{
		trial2 t=new trial2();
	}
}