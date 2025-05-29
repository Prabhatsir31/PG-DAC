package trial1;

import trial.MyClass1;
class Sub extends MyClass1
{
	void fun()
	{
		disp();// no error  // through inheritance
		//new MyClass1().disp();// error 
	}
	protected void disp()
	{
		System.out.println("inside overridden disp of sub");
	}
}
class Sub1 extends Sub
{
	void disp2()
	{
		disp(); // disp of MyClass1 if Sub does not override
	//	new Sub().disp(); // error if Sub does not override
	//	new MyClass1().disp(); // error
	}
}
public class MyClass2
{
	public static void main(String[] args)
	{
	//	new Sub().disp(); //error if Sub does not override
		new Sub().fun();
		new Sub1().disp2();
	}
}
