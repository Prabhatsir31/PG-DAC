package core1;
public class Test4
{
	static void disp(int x,int y)
	{
		System.out.println("in two ints");
	}
	static void disp(byte ...x)
	{
		System.out.println("in byte var arg");
	}
	public static void main(String args[])
	{

		byte a=3,b=6;
		disp(a,b);
	}
}

/*

output:

in two ints

	Compiler chooses old style

*/		