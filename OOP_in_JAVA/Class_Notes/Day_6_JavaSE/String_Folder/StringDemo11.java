/* in this code what if we would like to ignore cases */

public class StringDemo11
{
	public static void main(String args[])
	{
		String s1="admin";
		
		String s2="Admin";
		
		System.out.println(s1);
		System.out.println(s2);

		if(s1==s2)
		{
			System.out.println("s1 and s2 are ==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}

		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equals");
		}
		else
		{
			System.out.println("s1 and s2 are not equals");
		}
	}
}