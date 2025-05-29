


/* When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. 
Otherwise, this String object is added to the pool and a reference to this String object is returned. 
 
*/

public class StringDemo9_intern
{
	public static void main(String args[])
	{
	   String s1="hello";
		String s2="world";
		String s3=s1.concat(s2); // what will happen here?
		System.out.println(s3);
		s3.intern(); // what will happen here?

char[] c = {'J', 'A', 'V', 'A'};
 
String s6 = new String(c);
s6.intern(); // what will happen here?

		
	}
}