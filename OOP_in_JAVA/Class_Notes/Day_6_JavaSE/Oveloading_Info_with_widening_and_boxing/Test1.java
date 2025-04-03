package core1;
public class Test1
{
	static void disp(int x)
	{
		System.out.println("in int");
	}
	static void disp(short y)
	{
		System.out.println("in short");
	}
	public static void main(String args[])
	{
		byte b=30;
		disp(b);
	}
}
		
/*
Ans:- 

in short

	Primitive widening uses the "smallest" method argument possible.

*/
