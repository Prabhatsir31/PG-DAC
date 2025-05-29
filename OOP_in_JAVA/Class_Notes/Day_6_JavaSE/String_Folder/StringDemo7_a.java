
public class StringDemo7_a
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2=new String("hello");
		
		
		if(s1==s2.intern())
		{
			System.out.println("s1 and s2 are ==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}
		
	}
}