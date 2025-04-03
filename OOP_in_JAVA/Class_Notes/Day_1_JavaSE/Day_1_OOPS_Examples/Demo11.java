// call by value

public class Demo11
{
	private int num;

	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	void disp1(int k)
	{
		k=200;
	}
	public static void main(String args[])
	{
		Demo11 s1=new Demo11();
		s1.setNum(100);
		System.out.println(s1.getNum());   //  100
		// call "disp1" by passing "num"
		s1.disp1(s1.num);
		System.out.println(s1.getNum());   //  100
	}
}