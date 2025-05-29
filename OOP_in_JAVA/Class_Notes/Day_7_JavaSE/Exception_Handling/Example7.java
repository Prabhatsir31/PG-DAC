/*
finally{} block always executes whether or not exception is raised
*/
public class Example7
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		System.out.println("Array created");
		try
		{
			arr[3]=10;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("In catch\t"+ae);
		}
		finally
		{
			System.out.println("I am always printed");
		}
		System.out.println("Array assigned");
	}
}












