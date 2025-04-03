public class FinalArrayDemo
{
	
	public static void main(String args[])
	{
		final int arr[]=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		// arr=new int[4]; error
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		arr[1]=100; // no problem
		System.out.println("After modifying");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
