public class ArrayOfInstance
{
	public static void main(String args[])
	{
		MyClass arr[]=new MyClass[3]; // array of references to MyClass
		
		for(int i=0,j=10;i<arr.length;i++,j+=10)
		{
			arr[i]=new MyClass(j); // object creation
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getNum());
		}
	}
}

class MyClass
{
	int num;
	MyClass(int num)
	{
		this.num=num;
	}
	int getNum()
	{
		return num;
	}
}







