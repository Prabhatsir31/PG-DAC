// finally will be invoked in case of negative value but not invoked in case of positive value as "System.exit" is used inside "try" block.

public class Demo3
{
	void accept(int k)
	{
		if(k<=0)
		{
			throw new RuntimeException("invalid value");
		}
	}
	int disp(int k)
	{ 
		try
		{
			accept(k);
			System.exit(0);
			return 1;
		}
		catch(Exception ex)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String args[])
	{
		Demo3 e=new Demo3();
		//System.out.println(e.disp(5));
		System.out.println(e.disp(-5));
	}
}
				