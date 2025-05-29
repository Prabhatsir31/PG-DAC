class base
{
	base()
	{
		System.out.println("in base no-arg");
	}
}
public class trial1 extends base
{
	trial1()
	{
		this(30);
		System.out.println("in def const");
	}
	trial1(int k)
	{
		this(20,40);
		System.out.println("in 1 param");
	}
	trial1(int x,int y)
	{
		System.out.println("in 2 param");
	}
	public static void main(String args[])
	{
		trial1 t=new trial1();
	}
}
