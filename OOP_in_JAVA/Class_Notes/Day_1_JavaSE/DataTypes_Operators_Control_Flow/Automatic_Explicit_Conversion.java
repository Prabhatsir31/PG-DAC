package core1;
public class Main {

	public static void main(String[] args) {
		
		// integral types
		byte a=10;
		
		int c=30;
		
		c=a; // automatic conversion
		System.out.println(c);
		
		// a=c; // not possible,explicit cast is needed
		a=(byte)c;  // explicit cast
		System.out.println(a);
		
		c=130; // more than byte range
		a=(byte)c;
		System.out.println(a);
		
		double d=4.8; // automatic cast
		System.out.println(d);
		// float d=3.5;  // not possible bec, 3.5 is by default double
		float e=3.5f;  // explicit cast
		float f=(float)3.5;
		System.out.println(e+"\t"+f);
		
		char ch='A';
		int k=ch;  // char to int
		System.out.println(k);
		
		int num=97;
		char ch1=(char) num;  // int to char
		System.out.println(ch1);
		
		char dd2=100;
		System.out.println(dd2);

		double dd=100.5;
		char ch2=(char) dd;
		System.out.println(ch2);
		
		char ch3='P';
		double dd1=ch3;
		System.out.println(dd1);
		
		boolean val=true;
		//int k=val;  // error, not compatible
		
	}
}
