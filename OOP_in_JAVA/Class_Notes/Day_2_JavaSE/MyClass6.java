public class MyClass6
{
	int num=100;
	void disp()
	{
		System.out.println(num);
	}
	void fun1(MyClass6 ref) // call by value
	{
		ref=new MyClass6();
		ref.num=200;
	}
	public static void main(String args[])
	{
		MyClass6 m1=new MyClass6();
			
		m1.disp();
		m1.fun1(m1);
		m1.disp();

		
		
	}
}





