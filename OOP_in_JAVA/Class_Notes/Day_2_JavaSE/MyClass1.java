public class MyClass1
{
	int num=100;
	void disp()
	{
		System.out.println(this.num);
	}
	public static void main(String args[])
	{
		MyClass1 m1=new MyClass1();
		MyClass1 m2=new MyClass1();
		
		m1.disp();
		m2.disp();
		MyClass1 m3=m1;
		m3.disp();
		m3.num=500;

		m1.disp();
		m2.disp();
		m3.disp();
	}
}











