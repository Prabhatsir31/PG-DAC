//package trial;
interface emp1
{
	default void disp()
	{
		System.out.println("in emp1 disp");
	}
}
interface emp2
{
	void disp();
}
abstract class EmpImpl implements emp1,emp2  
{
	public void disp()
	{
		System.out.println("inside EmpImp disp");
	}
}
public class Demo11
{
	public static void main(String args[])
	{
		System.out.println("done");
	}
}