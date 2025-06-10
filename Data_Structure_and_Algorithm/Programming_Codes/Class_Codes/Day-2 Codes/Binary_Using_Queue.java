import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Using_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("1");

        System.out.println("Binary Number from 1 to " + n + ":");
        for(int i = 0; i <= n; i++) {
            String front = q.remove();
            System.out.print(front + ", ");

            q.add(front + "0");
            q.add(front + "1");
        }
        sc.close();
    }
}