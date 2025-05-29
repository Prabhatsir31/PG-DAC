/*create as many as instances of this class. At the end display how many instances u have created. */

public class MyClass14
{
	int num;
	static int cnt;

// non-static initializer

	{
		cnt++;
	}
	public MyClass14()
	{
		
	}
	public MyClass14(int num)
	{
		this.num=num;
		
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public static int getCnt()
	{
		return cnt;
	}
	public static void main(String args[])
	{
		MyClass14 m1=new MyClass14();
		MyClass14 m2=new MyClass14(200);
		m1.setNum(100);
		System.out.println(m1.getNum());
		System.out.println(m2.getNum());
		System.out.println(MyClass14.getCnt());	
		MyClass14 m3=new MyClass14(300);
		System.out.println(m3.getNum());
		System.out.println(MyClass14.getCnt());		
	}

}
