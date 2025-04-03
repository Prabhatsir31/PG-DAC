package trial;
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
// error:
// The default method disp() inherited from emp1 conflicts with another method inherited from emp2
abstract class EmpImpl implements emp1,emp2  // error
{
}
public class Demo10
{
	public static void main(String args[])
	{
		System.out.println("done");
	}
}
		
		
			