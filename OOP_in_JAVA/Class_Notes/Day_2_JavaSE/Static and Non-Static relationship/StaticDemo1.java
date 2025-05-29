class Sample
{
	int a=100;
	static int b=200;

	void disp1()
	{
		System.out.println(a+"\t"+b);
	}
	static void disp2(Sample ref)
	{
		System.out.println(ref.a+"\t"+b);
	}
}
public class StaticDemo1
{
	public static void main(String args[])
	{
		Sample s1=new Sample();
		Sample.disp2(s1);
		s1.disp1();
	}
}



