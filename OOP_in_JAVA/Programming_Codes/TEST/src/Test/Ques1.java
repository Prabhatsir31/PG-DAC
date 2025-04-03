package Test;
import java.util.*;

public class Ques1 {
    public static void printPattern(int size) {
        
    	// Upper half of the pattern
        for (int i = size; i >= 1; i--) {
            for (int j = i; j <= size; j++) {
                System.out.print(j + " ");
            }
            for (int j = size - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Lower half of the pattern
        for (int i = 2; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print(j + " ");
            }
            for (int j = size - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int size = scanner.nextInt();
        printPattern(size);
        scanner.close();
    }
}