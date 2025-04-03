package trial;
interface emp
{
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
class base
{
	// must be public
	String disp2()
	{
		return "in disp2 of base";
	}
}
// error : The inherited method base.disp2() cannot hide the public abstract method in emp
class MyClass extends base implements emp  
{

}
public class Demo8_a
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.disp2());
	}
}
		
		
			