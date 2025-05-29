public class UnSignedRightShiftOperatorExample2   
{   
	public static void main(String args[])   
	{   
		int x = -5;   
		System.out.println("x>>>20 = " + (x >>> 20)); 
	}  
}  

/*
let's find out binary for -5

first step

	ignore minus (-) sign


2   5    
    2   1
    1   0
    0   1


0000000000000000 0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  1

let's find out 2's complement of this number

1111111111111111 1  1  1  1  1  1  1  1  1  1  1  1  1  0  1  1       // binary for  -5


now let's shift it to right ( unsigned right shift ) by 20

00000000000000000000 1    1    1    1    1    1    1    1    1    1    1    1
		            2048+1024+512+ 256+ 128+ 64+  32+  16+   8+   4+   2+   1     =         4095




*/