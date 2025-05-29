package core1;
public class Test3
{
	static void disp(Integer x)
	{
		System.out.println("in Integer");
	}
	static void disp(long x)
	{
		System.out.println("in long");
	}
	public static void main(String args[])
	{
		int num=5;
		disp(num);
	}
}
		


/*
output:

in long

	widening beats boxing
*/