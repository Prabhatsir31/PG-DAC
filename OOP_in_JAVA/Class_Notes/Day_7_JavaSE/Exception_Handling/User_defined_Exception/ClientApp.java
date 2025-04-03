public class ClientApp
{
	public static void main(String args[])
	{
		Calc c=new Calc();
		int result=0;
		try
		{
			result=c.sqr(-9);
			System.out.println(result);
		}
		catch(MyException m)
		{
			System.out.println(m);
		}
		System.out.println("Done");
	}
}
		