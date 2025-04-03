// error :  emp is not a functional interface , The target type of this expression must be a functional interface
 

interface emp // not a functional interface
{
	String wish(String name);
	//String wish1(String name);
	String wish1(int k);
}
public class Demo1_a
{
	public static void main(String args[])
	{	
		emp ref=(String name)->{ return "Welcome to our site\t"+name;};
		System.out.println(ref.wish("Sachin"));
		System.out.println("Implementation class name is\t"+ref.getClass().getName());

		System.out.println("One more");
emp ref1=(String name)->{ return "Hello\t"+name;};
		System.out.println(ref.wish("Rahul"));
		System.out.println("Implementation class name is\t"+ref1.getClass().getName());

		System.out.println("done");
	}
}