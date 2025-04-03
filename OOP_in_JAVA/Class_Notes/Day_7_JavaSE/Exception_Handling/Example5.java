// one try , multiple catch blocks.
/* when u define one try and multiple catch, the rule is most specific catch block should precede most generic catch block.
*/
public class Example5
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
			// if i want to perform any specific task in case of AIOOB
			System.out.println(ae);
		}
		catch(Exception ae) 
		{
			System.out.println(ae);
		}
		
		System.out.println("Array assigned");
	}
}












