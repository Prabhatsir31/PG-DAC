/*create as many as instances of this class. At the end display how many instances u have created. */

public class MyClass13
{
	int num;
	static int cnt;
	public MyClass13()
	{
		cnt++;
	}
	public MyClass13(int num)
	{
		this.num=num;
		cnt++;
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
		MyClass13 m1=new MyClass13();
		MyClass13 m2=new MyClass13(200);
		m1.setNum(100);
		System.out.println(m1.getNum());
		System.out.println(m2.getNum());
		System.out.println(MyClass13.getCnt());	
		MyClass13 m3=new MyClass13(300);
		System.out.println(m3.getNum());
		System.out.println(MyClass13.getCnt());		
	}

}
