public class WrapperDemo1
{
	public static void main(String args[])
	{
		String str="125";
		System.out.println(str);
		str+=10;
		System.out.println(str); // 12510  i.e. concatenation

		str="125";
		// lets convert str into int
		int k=Integer.parseInt(str);
		k+=10;
		System.out.println(k);  // 135
	}
}