public class MyClass4
{
	int num=100;
	void disp()
	{
		System.out.println(num);
	}
	void fun1(int k)
	{
		k=200;
	}
	public static void main(String args[])
	{
		MyClass4 m1=new MyClass4();
			
		m1.disp();
		m1.fun1(m1.num);
		m1.disp();

		
		
	}
}





