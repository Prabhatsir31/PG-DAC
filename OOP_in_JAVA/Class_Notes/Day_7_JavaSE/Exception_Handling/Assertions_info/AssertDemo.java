public class AssertDemo
{
	public static void main(String args[])
	{
		System.out.println("Before checking num");
		int num=10;
		assert(num<=10);
		System.out.println("After checking num");

		assert(num>20):"num is not gt 20";
		System.out.println("After checking num");
	}
}