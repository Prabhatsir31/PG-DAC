
/* functional interface is the one which has only one abstract method. This type of interface, was previously known as a Single Abstract Method type (SAM).
*/

interface emp // functional interface
{
	String wish(String name);
}
public class Demo1
{
	public static void main(String args[])
	{	
		// using anonymous inner class

		emp ref1=new emp()
		{
			public String wish(String name)
			{
				return "Hello\t"+name;
			}
		};
		System.out.println(ref1.wish("Rahul"));
System.out.println("Implementation class name is\t"+ref1.getClass().getName());
System.out.println();

// using lambda expression
		
		emp ref2=(String name)->{ return "Welcome to our site\t"+name;};
		System.out.println(ref2.wish("Sachin"));
		System.out.println("Implementation class name is\t"+ref2.getClass().getName());
	

		System.out.println();
		System.out.println("One more");

emp ref3=(String name)->{ return "Hello\t"+name;};
		System.out.println(ref3.wish("Anil"));
		System.out.println("Implementation class name is\t"+ref3.getClass().getName());
		
		
		System.out.println();
		
		System.out.println("done");
	}
}
	