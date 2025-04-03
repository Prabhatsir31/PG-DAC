public class SignedLeftShiftOperatorExample2   
{   
	public static void main(String args[])   
	{   
		int x = -34;   
		System.out.println("x<<2 = " + (x << 2));   
	}  
}  

/*

let's find out binary for -34

first step 
	ignore minus (-) sign

let's find out binary for 34

2	34
	17  0
	8   1
	4   0
	2   0
   	1   0
   	0   1  

0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0   

now let's derive 2's complement of this binary 

for that 1's compliment of above representation would be:

1 1 1 1 1 1 1 1 1 1 0 1 1 1 0 1

add 1 to it.

1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 0      // 2's compliment or binary for -34


now if we shift it to left by 2 , it will be

1 1 1 1 1 1 1      1 0 1 1 1 1 0 0 0
		-256+0+64+32+16+8+0+0+0       =   -136



*/