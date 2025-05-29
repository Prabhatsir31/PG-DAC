public class StringDemo5
{
	public static void main(String args[])
	{
		String s1=new String("hello");
		String s2="hello";
		String s3="hello";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s3);

		if(s1.equals(s3))
		{
			System.out.println("s1 and s3 are equals");
		}
		else
		{
			System.out.println("s1 and s3 are not equals");
		}

		if(s1==s3)
		{
			System.out.println("s1 and s3 are ==");
		}
		else
		{
			System.out.println("s1 and s3 are not ==");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}