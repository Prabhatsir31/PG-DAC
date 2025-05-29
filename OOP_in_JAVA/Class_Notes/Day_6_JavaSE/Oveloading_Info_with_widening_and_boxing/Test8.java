/*

compilation error: ambiguity

You can combine var-args either with widening or boxing , not both.

*/

package core1;
public class Test8
{
	static void disp(long...x)
	{
		System.out.println("in long var args");
	}
	static void disp(Integer...y)
	{
		System.out.println("in Integer var args");
	}

	public static void main(String args[])
	{
		int p=20,q=30;
		disp(p,q);
	}
}
		