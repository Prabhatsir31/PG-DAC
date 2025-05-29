// call by value

public class Demo16
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
	int disp1(Demo16 ref)   // Demo16 ref=s1;  // ref refers to that object where "s1" refers
	{
		ref=new Demo16();
		ref.num=200;
		return ref.num;
	}
	public static void main(String args[])
	{
		Demo16 s1=new Demo16();
		s1.setNum(100);
		System.out.println(s1.getNum());   //  100
		// call "disp1" 
		int result=s1.disp1(s1);
		System.out.println(result);  // 200
		System.out.println(s1.getNum());   //  100
	}
}