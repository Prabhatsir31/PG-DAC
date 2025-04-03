
public class StringDemo12
{
	public static void main(String args[])
	{
		String s1="admin";
		
		String s2="Admin";
		
		System.out.println(s1);
		System.out.println(s2);

		if(s1==s2)   // false
		{
			System.out.println("s1 and s2 are ==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}

		if(s1.equals(s2))  // false
		{
			System.out.println("s1 and s2 are equals");
		}
		else
		{
			System.out.println("s1 and s2 are not equals");
		}

		if(s1.equalsIgnoreCase(s2))   // true
		{
			System.out.println("s1 and s2 are equalsIgnoreCase");
		}
		else
		{
			System.out.println("s1 and s2 are not equalsIgnoreCase");
		}
	}
}