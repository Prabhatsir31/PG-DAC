public class StringDemo17
{
	public static void main(String args[])
	{
		String str1="hello world";
		System.out.println(str1.charAt(0));
		
		String str2=str1.concat(" welcome");
		System.out.println("str1 is \t"+str1);
		System.out.println("str2 is \t"+str2);

		int val=str1.compareTo(str2);
		System.out.println("comparison is\t"+val);

		System.out.println(str1.indexOf('e'));

		System.out.println(str1.lastIndexOf('l'));

		System.out.println("Length of str1 is \t"+str1.length());

		String str3=str1.replace('e','i');
		System.out.println(str1);
		System.out.println(str3);

		System.out.println(str1.substring(2));

		String str4="ABCDEFG";
		String str5=str4.toLowerCase();
		System.out.println(str4);
		System.out.println(str5);

		String str6=str1.toUpperCase();
		System.out.println(str1);
		System.out.println(str6);

		String str7="  how are you  ";
		System.out.println(str7);

		String str8=str7.trim();
		System.out.println(str7);
		System.out.println(str8);

	}
}
		