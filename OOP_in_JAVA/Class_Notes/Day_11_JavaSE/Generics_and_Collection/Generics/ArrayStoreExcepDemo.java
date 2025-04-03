import java.util.*;
class base
{
}
class sub extends base
{
}
class sub1 extends base
{
}
public class ArrayStoreExcepDemo 
{
	
	public static void main(String args[])
	{
		base arr[]=new sub[3];
		arr[0]=new sub();
		arr[1]=new sub();
		arr[2]=new sub1();  // here
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}







