
public class StringDemo15
{
	public static void main(String args[])
	{
		String s1=new String("hello");
		
		if(s1==("hel"+"lo"))  // compiler will add "hel" and "lo"
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		
	}
}