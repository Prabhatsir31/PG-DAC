public class ClientApp2
{
	static void disp()throws MyException
	{
		Calc c=new Calc();
		int result=0;
		result=c.sqr(-9);
		System.out.println(result);
	}
	public static void main(String args[])throws MyException
	{
		disp();
		System.out.println("Done");
	}
}
		