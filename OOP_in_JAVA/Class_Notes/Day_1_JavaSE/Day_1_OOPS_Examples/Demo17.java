// call by value

public class Demo17
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
	Demo17 disp1(Demo17 ref)   // Demo17 ref=s1;  // ref refers to that object where "s1" refers
	{
		ref=new Demo17();
		ref.num=200;
		return ref;
	}
	public static void main(String args[])
	{
		Demo17 s1=new Demo17();
		s1.setNum(100);
		System.out.println(s1.getNum());   //  100
		// call "disp1" 
		Demo17 ref1=s1.disp1(s1);  // internally it becomes "Demo17 ref1=ref"
		System.out.println(ref1.getNum());   // 200
		System.out.println(s1.getNum());   //100
	}
}