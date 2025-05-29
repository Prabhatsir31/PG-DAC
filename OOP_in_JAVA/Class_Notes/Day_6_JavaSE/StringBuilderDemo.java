// StringBuilder class is mutable
public class StringBuilderDemo
{
	public static void main(String args[])
	{
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1);
		sb1.append("world");
		System.out.println(sb1);
	}
}
	