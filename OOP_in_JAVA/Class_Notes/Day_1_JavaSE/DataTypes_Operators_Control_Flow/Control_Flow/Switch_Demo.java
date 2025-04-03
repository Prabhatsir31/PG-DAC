public class Switch_Demo
{
	public static void main(String args[])
	{
		char ch='E';

		switch(ch)  // byte,int,short and char and String
		{
			case 'A': System.out.println("Vowel A");
					break;
			case 'E': System.out.println("Vowel E");
					break;
			case 'I': System.out.println("Vowel I");
					break;
			case 'O': System.out.println("Vowel O");
					break;
			case 'U': System.out.println("Vowel U");
					break;
			default: System.out.println("Not a Vowel");
		}
	}
}