// call by value

public class Demo14
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
	void disp1(Demo14 s1)   // Demo14 s1=s1;  // ref refers to that object where "s1" refers
	{
		s1.num=200;
	}
	public static void main(String args[])
	{
		Demo14 s1=new Demo14();
		s1.setNum(100);
		System.out.println(s1.getNum());   //  100
		// call "disp1" 
		s1.disp1(s1);
		System.out.println(s1.getNum());   //  200
	}
}