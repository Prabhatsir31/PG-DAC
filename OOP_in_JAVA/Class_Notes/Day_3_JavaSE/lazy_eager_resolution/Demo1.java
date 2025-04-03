package firstpro;


class A
{
	static
	{
		System.out.println("inside A static block");
	}
}
class B
{
	static
	{
		System.out.println("inside B static block");
	}
}
public class Demo1 
{
	private A ref1=new A();    // lazy resolution
	private static B ref2=new B(); // eager resolution
	public static void main(String[] args) 
	{
		System.out.println("in main");
		new Demo1();  // class A will be loaded now
	}

}

/*
output:

inside B static block
in main
inside A static block
*/
