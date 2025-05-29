class Sample
{
	private int num;
	private static int cnt=10;
	public Sample(int num)
	{
		this.num=num;
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
}
		
public class MyClass8
{
	public static void main(String args[])
	{
		Sample s1=new Sample(100);
		System.out.println(s1.getNum());

		Sample s2=new Sample(200);
		System.out.println(s2.getNum());

		System.out.println(Sample.getCnt());
				
	}
}





