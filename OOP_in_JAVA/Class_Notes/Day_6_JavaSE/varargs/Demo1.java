public class Demo1
{
	void disp(int ...set)
	{
		for(int i=0;i<set.length;i++)
		{
			System.out.println(set[i]);
		}
		for(int k:set)  // foreach
		{
			System.out.println(k);
		}
	}
	public static void main(String args[])
	{
		Demo1 d=new Demo1();
		d.disp(10,20);
		System.out.println(".................");
		d.disp(100,200,300,400,500);
	}
}
