

class Immutable
{
	private int num;

	public Immutable(int num)
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
	public Immutable add(int k)
	{
		return new Immutable(num+k);
	}
}
public class ImmutableDemo
{
	public static void main(String args[])
	{
		Immutable i1=new Immutable(10);
		System.out.println(i1);
		Immutable i2=i1.add(20);
		System.out.println(i1);
		System.out.println(i2);
	}
}
	