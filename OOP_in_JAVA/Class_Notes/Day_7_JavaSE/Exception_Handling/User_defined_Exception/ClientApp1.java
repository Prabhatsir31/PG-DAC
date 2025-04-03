public class ClientApp1
{
	static void disp()throws MyException
	{
		Calc c=new Calc();
		int result=0;
		result=c.sqr(-9);
		System.out.println(result);
	}
	public static void main(String args[])
	{
		try
		{
			disp();
		}
		catch(MyException m)
		{
			System.out.println(m);
		}
		System.out.println("Done");
	}
}
		