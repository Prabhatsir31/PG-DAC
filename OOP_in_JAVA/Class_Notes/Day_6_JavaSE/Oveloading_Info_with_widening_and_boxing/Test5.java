package core1;
public class Test5
{
	static void disp(Byte x,Byte y)
	{
		System.out.println("in two Bytes");
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

in two Bytes

	boxing beats var-args
*/		