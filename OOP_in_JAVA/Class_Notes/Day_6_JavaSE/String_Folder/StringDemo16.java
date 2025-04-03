
public class StringDemo16
{
	public static void main(String args[])
	{
		String s1="hello";
		final String s2="hel";
		
		if(s1==(s2+"lo"))  // compiler adds "hel" and "lo"
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		
	}
}