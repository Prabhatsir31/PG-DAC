package core1;
public class Test2
{
	static void disp(Integer x)
	{
		System.out.println("in Integer");
	}
	static void disp(int x)
	{
		System.out.println("in int");
	}
	public static void main(String args[])
	{
		int num=5;
		disp(num);
	}
}
	
/*

output:

in int

Boxing has taken a back seat

*/