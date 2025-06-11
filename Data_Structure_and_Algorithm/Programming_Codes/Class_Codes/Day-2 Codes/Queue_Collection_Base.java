import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue_Collection_Base
{
    Queue<Integer> q ;
    Queue_Collection_Base()
    {
        q=new LinkedList<>();
    }
    void enqueue(int e)
    {
        q.add(e);
    }
    int dequeue()
    {
        return q.remove();
    }
    boolean isEmpty()
    {
        return q.isEmpty();
    }
    void printQueue()
    {
        System.out.println("Queue has:"+q);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Queue size: ");
        Queue_Collection_Base queue=new Queue_Collection_Base();
        int choice, element;

        do {
            System.out.println("\n====== Queue Menu ======");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1: // Enqueue
                        System.out.print("Enter element: ");
                        element = sc.nextInt();
                        queue.enqueue(element);
                        System.out.println("Element enqueued.");
                    break;

                case 2: // Dequeue
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty. Cannot Dequeue.");
                    } else {
                        System.out.println("Popped element: " + queue.dequeue());
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty. Nothing to display.");
                    } else {
                        System.out.println("Queue contents (Start to End):");
                        queue.printQueue();
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }

}