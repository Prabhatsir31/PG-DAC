

class Mutable
{
	private int num;

	public Mutable(int num)
	{
		this.num=num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	int getNum()
	{
		return num;
	}
	public String toString()
	{
		return "["+num+"]";
	}
	public Mutable add(int k)
	{
		num+=k;
		return this;
	}
}
public class MutableDemo
{
	public static void main(String args[])
	{
		Mutable i1=new Mutable(10);
		System.out.println(i1);
		i1.add(20).add(50).add(100);
		System.out.println(i1);
	}
}
	