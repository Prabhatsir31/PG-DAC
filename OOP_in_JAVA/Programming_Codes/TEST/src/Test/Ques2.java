// find the largest Prime number less the given number

package Test;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int maxPrime = findLargestPrime(n);
        System.out.println("Largest Prime number less than " + n + " is: " + maxPrime);
    }

    public static int findLargestPrime(int n) {
        int maxPrime = 0;
        for (int i = n - 1; i > 1; i--) {
            if (isPrime(i)) {
                maxPrime = i;
                break;
            }
        }
        return maxPrime;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
