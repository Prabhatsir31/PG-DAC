package NestedLoop;

// 1
// 22
// 333

public class Pattern2 {
	public static void main(String args[]) {
		for(int i = 1; i<=3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
