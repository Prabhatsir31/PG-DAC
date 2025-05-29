// call by value

public class Demo15
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
	void disp1(Demo15 ref)   // Demo15 ref=s1;  // ref refers to that object where "s1" refers
	{
		ref=new Demo15();
		ref.num=200;
	}
	public static void main(String args[])
	{
		Demo15 s1=new Demo15();
		s1.setNum(100);
		System.out.println(s1.getNum());   //  100
		// call "disp1" 
		s1.disp1(s1);
		System.out.println(s1.getNum());   //  100
	}
}