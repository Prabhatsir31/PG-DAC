public class Test
{
	public Object get(int i)
	{
		if(i==0)
		{
			return new String();
		}
		else if(i==1)
		{
			return new Integer(100);
		}
		else
		{
			return new Double(3.4);
		}
	}
}
		