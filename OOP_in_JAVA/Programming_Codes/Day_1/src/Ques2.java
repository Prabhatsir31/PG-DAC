
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int result;
		switch('+') {
		case ('+'):
			result = a + b;
			System.out.println("Result = " + result);
			break;
		case ('-'):
			result = a - b;
			System.out.println("Result = " + result);
			break;
		case ('*'):
			result = a * b;
			System.out.println("Result = " + result);
			break;
		case ('/'):
			result = a / b;
			System.out.println("Result = " + result);
			break;
			default: 
				System.out.println("invalid");
		}
	}

}
