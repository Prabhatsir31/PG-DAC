// 5) accept a number and display its table using 
// 	while
// 	do... while
// 	for

import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Table of " + n + ":");
        // Using while loop
        int i = 1;
        while (i <= 10) {
        	System.out.println("By Using While Loop");
            System.out.println(n + " * " + i + " = " + (n * i));
            i++; 
        }
        // Using do-while loop
        int j = 1;
        System.out.println("By Using do - While Loop");
        do {
            System.out.println(n + " * " + j + " = " + (n * j)); // Print the multiplication result
            j++;
        } while (j <= 10);
        // Using for loop
        System.out.println("By Using For Loop");
        for(int k=1; k<=10; k++) {
        	System.out.println(n + " * " + k + " = " + (n * k)); // Print the multiplication result
        }
    }
}

