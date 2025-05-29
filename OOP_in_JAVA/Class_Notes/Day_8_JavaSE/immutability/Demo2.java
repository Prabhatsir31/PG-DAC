// 2.If the instance fields include references to mutable objects, don't allow those objects to be changed:
//	Don't provide methods that modify the mutable objects.
 

class MyClass   //  mutable
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
class base   // immutable
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
	public void changeRef()  // do not provide this
	{
		ref.setData(50);
	}
	
}
public class Demo2
{
	public static void main(String args[])
	{
		base b1=new base(100);
		System.out.println(b1.getNum());
		b1.dispRef();
		b1.changeRef(); // Violation of Immutability
		b1.dispRef();
	}
}