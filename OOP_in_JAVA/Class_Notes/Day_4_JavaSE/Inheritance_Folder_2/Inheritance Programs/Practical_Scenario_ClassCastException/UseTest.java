public class UseTest
{
	public static void main(String args[])
	{
		Test t=new Test();
		//Integer ref=(Integer)t.get(0);

		Object ob=t.get(0);
		if(ob instanceof Integer)
		{
		Integer ref=(Integer)ob;
		System.out.println(ref);
		}
		else
		{
			System.out.println("it does not contain Integer");
		}

		
	}
}