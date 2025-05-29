// 14) display prime numbers from 2 to 20

import java.util.*;

public class Ques14 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}