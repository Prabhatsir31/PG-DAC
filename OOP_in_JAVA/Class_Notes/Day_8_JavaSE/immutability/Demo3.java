// 3.If the instance fields include references to mutable objects, don't allow those objects to be changed:
// Don't share references to the mutable objects.
 

class MyClass
{
	private int data;
	public MyClass(int data)
	{
		this.data=data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
}
class base
{
	private int num;
	private MyClass ref=new MyClass(25);
	public base(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public void dispRef()
	{
		System.out.println(ref.getData());
	}
	public MyClass getRef()  // do not provide this
	{
		return ref;
	}
	
}
public class Demo3
{
	public static void main(String args[])
	{
		base b1=new base(100);
		System.out.println(b1.getNum());
		b1.dispRef();
		MyClass ref=b1.getRef(); // Violation of Immutability
		ref.setData(-3);  
		b1.dispRef();
	}
}