class base
{
	public void disp()
	{
		System.out.println("in base disp");
	}
}
class sub1 extends base
{
	public void disp()
	{
		System.out.println("in sub1 disp");
	}
}
class sub2 extends base
{
	public void disp()
	{
		System.out.println("in sub2 disp");
	}
}
class sub3 extends base
{
	public void disp()
	{
		System.out.println("in sub3 disp");
	}
}
public class Demo39
{

	public static void main(String args[])
	{
		/*create an array of base class having 3 elements
		store all the child class objects in this array.
		traverse the array and invoke disp of sub2 only.*/

		base arr[]=new base[3];
		arr[0]=new sub1();
		arr[1]=new sub2();
		arr[2]=new sub3();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof sub2)
			{
				arr[i].disp();
				break;
			}
		}	
	}
}