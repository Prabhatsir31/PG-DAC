// lambda expression to implement emp interface and define the function

interface emp // functional interface
{
	String wish(String name);
}
public class Demo2
{
	static void disp(emp ref)
	{
		System.out.println("inside disp\t"+ref.getClass().getName());
		System.out.println(ref.wish("Amit"));
	}
	public static void main(String args[])
	{	
		Demo2.disp((String name)->{return "Welcome to our site\t"+name;}); // passing implementation of emp
		

		System.out.println("done");
	}
}










