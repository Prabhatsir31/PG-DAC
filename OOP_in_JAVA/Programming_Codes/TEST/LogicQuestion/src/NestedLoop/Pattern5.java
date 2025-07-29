package NestedLoop;

//   1
//  12
// 123

public class Pattern5 {
	public static void main(String args[]) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
