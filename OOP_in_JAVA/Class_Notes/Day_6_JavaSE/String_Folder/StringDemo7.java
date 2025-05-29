/* here we get answer "true" because "equals()" method is overridden inside String class*/

/* But now we need to think the drawback of "equals()" method as compare to == operator

	The drawback is "equals()" method is slow.

	So what can be done to achieve the result "true" without using "equals()" method.
 */

public class StringDemo7
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2=new String("hello");
		
		
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equals");
		}
		else
		{
			System.out.println("s1 and s2 are not equals");
		}
		
	}
}