public class SignedLeftShiftOperatorExample3   
{   
	public static void main(String args[])   
	{   
		int x = -23;   
		System.out.println("x<<2 = " + (x << 2));   
	}  
}  

/*

let's find out binary for -23

first step 
	ignore minus (-) sign

let's find out binary for 23

2	23
	11  1
	5   1
	2   1
	1   0
        0   1  

0 0 0 0 0 0 0 0 0 0 0 1 0 1 1 1 

now let's derive 2's complement of this binary 

1 1 1 1 1 1 1 1 1 1 1 0 1 0 0 1      // binary for -23


now if we shift it to left by 2 , it will be

1 1 1 1 1 1 1     1 1 0 1 0 0 1 0 0
		-256+128+0+32+0+0+4+0+0       =  -92 




*/