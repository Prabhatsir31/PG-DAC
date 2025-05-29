class Sample
{
// Compiler provides "default constructor" here

	private int num;
	
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
public class ConstructorDemo1
{
	public static void main(String args[])
	{
		Sample s1=new Sample();  // will invoke "default constructor" provided by compiler
		s1.setNum(200);
		System.out.println(s1.getNum());
	}
}