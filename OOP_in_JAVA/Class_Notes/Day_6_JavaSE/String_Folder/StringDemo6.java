/* in the following example "s1==s2" will not be true*/

/* so what do we need to do in order to get the result "true" without changing s1 and s2 syntax ? */

public class StringDemo6
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2=new String("hello");
		
		
		if(s1==s2)
		{
			System.out.println("s1 and s2 are ==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}
		
	}
}