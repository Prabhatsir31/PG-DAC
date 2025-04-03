package trial;
interface A
{
	default void fun()
	{
		System.out.println("A fun");
	}
}
interface B
{
	default void fun()
	{
		System.out.println("B fun");
	}
}
class C implements A
{

}
// error:
//Duplicate default methods named fun with the parameters () and () are inherited from the types A and B
class D extends C implements B  // error
{
	
}
public class Demo13
{
	public static void main(String args[])
	{
		D ob=new D();
		ob.fun(); 
	}
}
