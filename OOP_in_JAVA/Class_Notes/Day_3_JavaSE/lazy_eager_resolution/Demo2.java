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
public class Demo2 
{
	private A ref1=new A();    // lazy resolution
	private static B ref2=new B(); // eager resolution
	public static void main(String[] args) 
	{
		new Demo2();  // class A will be loaded now
		System.out.println("in main");
		new Demo2(); // class A will not be loaded again as
					// classes are loaded only once in Java
		
	}

}
