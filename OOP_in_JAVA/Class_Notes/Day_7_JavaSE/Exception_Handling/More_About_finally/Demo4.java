// finally will be neither be invoked in case of negative value nor in positive value as "System.exit" is used inside both "try" and "catch" blocks.

public class Demo4
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
			System.exit(0);
			return 2;
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String args[])
	{
		Demo4 e=new Demo4();
		System.out.println(e.disp(5));
		//System.out.println(e.disp(-5));
	}
}
				