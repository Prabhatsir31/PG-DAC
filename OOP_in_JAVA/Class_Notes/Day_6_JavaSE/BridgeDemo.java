what is bridge method in java?
	or
how does co-variant return type work in java?

class Base
{
	Object disp()
	{
		System.out.println("in Base disp");
		return null;
	}
}
class Sub extends Base
{
	String disp()
	{
		System.out.println("in Sub disp");
		return null;
	}
/*
	Object disp()   // bridge method will be provided by compiler and will be called during runtime
	{
		invoke "String disp()" method of the same class
	}
*/
}
public class BridgeDemo
{
	public static void main(String args[])
	{
		Base ref=new Sub();
		ref.disp();   //  during runtime check the content of "ref" and invoke "Object disp()" method 
			// so during runtime since the content of "ref" is "Sub", "Object disp()" of Sub which is a bridge method gets 			//called which invokes "String disp()" which programmer has defined.

// if we write following statements
		ref=new Base();
		ref.disp();   // Base class "Object disp()" will be called
	}
}