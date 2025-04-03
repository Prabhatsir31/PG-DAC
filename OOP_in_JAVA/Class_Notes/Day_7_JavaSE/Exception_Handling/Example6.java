public class Example6
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		System.out.println("Array created");
		try
		{
			arr[4]=10;
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












