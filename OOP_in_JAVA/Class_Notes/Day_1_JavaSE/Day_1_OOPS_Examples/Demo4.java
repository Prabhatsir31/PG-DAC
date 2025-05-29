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
public class Demo4
{
	public static void main(String args[])
	{
		MyNumber m1=new MyNumber();   // instance or object creation
		m1.setNum(150); 
		System.out.println(m1.getNum());
		MyNumber m2=new MyNumber();
		m2.setNum(200);
		System.out.println(m2.getNum());
		m1=null;    /* what will happen to object where "m1" refers to ?
			the object to which "m1" was referring to will be marked for Garbage Collection ( provided no other reference referring to that object) and after some time ( depends on JVM implementation) it will be garbage collected.*/
  		System.out.println("done");
	}
}