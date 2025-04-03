public class WrapperDemo2
{
	public static void main(String args[])
	{
		// before jdk5
		// convert int to Integer

		int num=5;
		Integer ob1=new Integer(num);
		System.out.println(ob1);  // 5

		// convert Integer to int

		int k=ob1.intValue();
		System.out.println(k);  // 5
	}
}