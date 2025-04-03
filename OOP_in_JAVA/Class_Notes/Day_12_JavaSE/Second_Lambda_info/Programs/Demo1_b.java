
interface emp // functional interface
{
	String wish(String name);
	default void disp()
	{
		System.out.println("in emp disp");
	}
	static void disp1()
	{
		System.out.println("in emp disp1");
	}
}
public class Demo1_b
{
	public static void main(String args[])
	{	
		emp ref=(String name)->{ return "Welcome to our site\t"+name;};
		System.out.println(ref.wish("Sachin"));
		ref.disp();
		System.out.println("Implementation class name is\t"+ref.getClass().getName());

		System.out.println("One more");
emp ref1=(String name)->{ return "Hello\t"+name;};
		System.out.println(ref1.wish("Rahul"));
		System.out.println("Implementation class name is\t"+ref1.getClass().getName());

		
		emp.disp1();
		System.out.println("done");
	}
}




