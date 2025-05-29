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
abstract class EmpImpl implements emp2 
{
	/*public void disp() // not required
	{
	}*/
}
public class Demo12
{
	public static void main(String args[])
	{
		System.out.println("done");
	}
}