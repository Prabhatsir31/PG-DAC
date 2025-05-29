class MyNumber
{
	private int num;   // instance member or member variable

	// setter and getter

	public void setNum(int num)  // member function
	{
		this.num=num;
	}
	public int getNum()   // member function
	{
		return num;
	}
}
public class Demo8
{
	public static void main(String args[])
	{
		MyNumber m1=new MyNumber();   // instance or object creation
		m1.setNum(150); 
		System.out.println(m1.getNum());
		MyNumber m2=new MyNumber();
		m2.setNum(200);
		System.out.println(m2.getNum());
		MyNumber m3=m2;  // m3 refers to the same object where "m2" refers to
		m3.setNum(500);
		System.out.println(m2.getNum());   // 500
		m2=null;  // no problem for the object since it is still referred by "m3"
		System.out.println(m2.getNum());  // NullPointerException
		
		
	}
}