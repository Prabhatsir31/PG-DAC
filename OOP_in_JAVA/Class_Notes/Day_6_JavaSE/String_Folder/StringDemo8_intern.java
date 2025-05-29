
/* When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned
 
*/

public class StringDemo8_intern
{
	public static void main(String args[])
	{
		// Example 1
		
		String s1="hello";
		String s2=s1.intern();
		System.out.println(s1==s2);
		
		// Example 2
		
		String s3=new String("world");
		String s4=s3.intern();
		
	}
}