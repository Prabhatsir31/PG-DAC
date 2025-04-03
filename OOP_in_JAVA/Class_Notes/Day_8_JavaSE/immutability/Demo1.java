// 1.	Don't provide "setter" methods — methods that modify fields 

class base
{
	private int num;
	public base(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		base b1=new base(100);
		System.out.println(b1.getNum());
	}
}