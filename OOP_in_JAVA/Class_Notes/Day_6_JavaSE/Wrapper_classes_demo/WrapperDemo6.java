// from jdk1.5
public class WrapperDemo6
{
	public static void main(String args[])
	{
		int num=100;

		// converting primitive to wrapper
		Integer ob=num;  // autoboxing

		

		// converting wrapper to primitive

		int k=ob;  // unboxing
		System.out.println(k);
	}
}
	