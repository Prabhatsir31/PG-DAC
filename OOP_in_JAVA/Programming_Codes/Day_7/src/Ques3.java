import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Ques3 {
    public void show1() {
        try {
            show2(); // Call show2
        } catch (MyException e) {
            System.out.println("Caught Exception in show1: " + e.getMessage());
        }
    }

    public void show2() throws MyException {
        show3(); // Call show3
    }

    public void show3() throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Accept a number
        if (number > 10) {
            throw new MyException("Number " + number + " is greater than 10."); // Raise MyException
        } else {
            System.out.println("Number entered: " + number); // Display the number
        }
    }

    public static void main(String[] args) {
        Ques3 demo = new Ques3();
        demo.show1(); // Call show1
    }
}