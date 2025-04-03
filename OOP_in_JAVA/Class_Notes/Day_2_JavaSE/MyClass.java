public class MyClass
{
	int num=100;
	void disp()
	{
		System.out.println(this.num);
	}
	void accept(int num)
	{
		this.num=num;
	}
	public static void main(String args[])
	{
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		System.out.println(m1.num+"\t"+m2.num);
		m1.disp();
		m2.disp();
		m1.accept(300);
		m1.disp();
		m2.disp();
	}
}