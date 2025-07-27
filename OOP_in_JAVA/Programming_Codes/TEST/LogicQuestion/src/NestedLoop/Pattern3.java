package NestedLoop;

//   1
//  2 2
// 3 3 3

public class Pattern3 {
	public static void main(String args[]) {
		for(int i = 1; i<=3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
