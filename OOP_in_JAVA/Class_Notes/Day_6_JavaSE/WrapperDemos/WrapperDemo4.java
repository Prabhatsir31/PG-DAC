

public class WrapperDemo4
{
	public static void disp(Object ref)
	{
		System.out.println(ref);
	}
	public static void main(String args[])
	{
		int num=100;
		disp(num);
	}
}

// in the above program what compiler does internally

		disp(new Integer(num));
i.e. compiler first does boxing and then upcasting



