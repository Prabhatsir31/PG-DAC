//package core1;
interface emp1
{
	void disp1();
}
interface emp2
{
	void disp2(int a,int b);
}
interface emp3
{
	int disp3();
}
interface emp4
{
	boolean disp4(int n);
}
public class Demo6 
{
	public static void main(String args[])
	{
		emp1 ref1=()->{System.out.println("in disp1 of implentation");};
		ref1.disp1();
		emp2 ref2=(int a,int b)->{System.out.println(a+b);};
		ref2.disp2(10,40);
		emp2 ref3=(a,b)->{System.out.println(a-b);};
		ref3.disp2(30, 60);
		emp3 ref4= ()->{return 100;};
		System.out.println(ref4.disp3());
		emp4 ref5=(int n)->{ return(n%2!=0);};
		System.out.println(ref5.disp4(6));
		emp4 ref6=(n)->{return n>10;};
		System.out.println(ref6.disp4(8));
		
	}
}






