// call by value

public class Demo12
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
	int disp1(int k)
	{
		k=200;
		return k;
	}
	public static void main(String args[])
	{
		Demo12 s1=new Demo12();
		s1.setNum(100);
		System.out.println(s1.getNum());   //  100
		// call "disp1" by passing "num"
		int result=s1.disp1(s1.num);
		System.out.println(result);  // 200
		System.out.println(s1.getNum());   //  100
	}
}