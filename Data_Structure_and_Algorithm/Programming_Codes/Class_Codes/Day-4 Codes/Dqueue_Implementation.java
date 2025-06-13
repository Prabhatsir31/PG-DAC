// import java.util.*;

// public class Dqueue_Implementation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();

//         while (true) {
//             System.out.println("\n--- Menu ---");
//             System.out.println("1. Insert at First");
//             System.out.println("2. Insert at Last");
//             System.out.println("3. Delete First");
//             System.out.println("4. Delete Last");
//             System.out.println("5. Peek First");
//             System.out.println("6. Peek Last");
//             System.out.println("7. Print List");
//             System.out.println("8. Exit");
//             System.out.print("Enter choice: ");
//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1 -> {
//                     System.out.print("Enter element to insert at first: ");
//                     int val = sc.nextInt();
//                     list.addFirst(val);
//                     System.out.println(val + " inserted at beginning.");
//                 }
//                 case 2 -> {
//                     System.out.print("Enter element to insert at last: ");
//                     int val = sc.nextInt();
//                     list.addLast(val);
//                     System.out.println(val + " inserted at end.");
//                 }
//                 case 3 -> {
//                     if (!list.isEmpty()) {
//                         int removed = list.removeFirst();
//                         System.out.println("Deleted from first: " + removed);
//                     } else {
//                         System.out.println("List is empty.");
//                     }
//                 }
//                 case 4 -> {
//                     if (!list.isEmpty()) {
//                         int removed = list.removeLast();
//                         System.out.println("Deleted from last: " + removed);
//                     } else {
//                         System.out.println("List is empty.");
//                     }
//                 }
//                 case 5 -> {
//                     if (!list.isEmpty()) {
//                         System.out.println("First Element: " + list.peekFirst());
//                     } else {
//                         System.out.println("List is empty.");
//                     }
//                 }
//                 case 6 -> {
//                     if (!list.isEmpty()) {
//                         System.out.println("Last Element: " + list.peekLast());
//                     } else {
//                         System.out.println("List is empty.");
//                     }
//                 }
//                 case 7 -> {
//                     if (!list.isEmpty()) {
//                         System.out.println("List: " + list);
//                     } else {
//                         System.out.println("List is empty.");
//                     }
//                 }
//                 case 8 -> {
//                     System.out.println("Exiting...");
//                     sc.close();
//                     return;
//                 }
//                 default -> System.out.println("Invalid choice. Try again.");
//             }
//         }
//     }
// }


// Without Menu-Driven 

import java.util.LinkedList;

public class Dqueue_Implementation {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Insert elements at the beginning and end
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(25);

        // Print the list
        System.out.println("List after insertions: " + list);

        // Peek first and last elements
        System.out.println("First Element: " + list.peekFirst());
        System.out.println("Last Element: " + list.peekLast());

        // Delete first and last elements
        if (!list.isEmpty()) {
            int removedFirst = list.removeFirst();
            System.out.println("Deleted from first: " + removedFirst);
        }

        if (!list.isEmpty()) {
            int removedLast = list.removeLast();
            System.out.println("Deleted from last: " + removedLast);
        }

        // Print the list after deletions
        System.out.println("List after deletions: " + list);
    }
}
