class MyNumber
{
	private int num;   // instance member or member variable

	// setter and getter

	public void setNum(int k)  // member function
	{
		num=k;
	}
	public int getNum()   // member function
	{
		return num;
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		MyNumber m1=new MyNumber();   // instance or object creation
		// m1.num=150;  // not possible
		m1.setNum(150); 
		System.out.println(m1.getNum());
	}
}






