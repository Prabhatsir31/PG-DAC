package NestedLoop;

// 1
// 2 3
// 4 5 6

public class Pattern4 {
	
	public static void main(String args[]) {
		int num = 1;
		for(int i = 1; i<=3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
