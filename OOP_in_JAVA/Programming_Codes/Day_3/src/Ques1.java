// 1) accept marks from user. if marks are
// 	> 75  display "Distinction"
// 	> =60 and < =75 display "first class"
// 	> =45 and < 60 display "second class"
// 	>=35 and < 45 display "pass class"
// 	<35 display "fail"

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks = sc.nextInt();
        if (marks > 75) {
            System.out.println("Distinction");
        } else if (marks >= 60 && marks <= 75) {
            System.out.println("First Class");
        } else if (marks >= 45 && marks < 60) {
            System.out.println("Second Class");
        } else if (marks >= 35 && marks < 45) {
            System.out.println("Pass Class");
        } else {
            System.out.println("Fail");
        }
    }
}