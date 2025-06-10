import java.util.Scanner;

// Node class for LinkedList
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main LinkedList class
public class LinkedListNode_Menu {
    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at beginning: " + data);
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Inserted at end: " + data);
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Inserted at position " + pos + ": " + data);
    }

    void deleteAtBeginning() {
        if (isEmpty()) {
            System.out.println("Underflow: List is empty");
            return;
        }
        System.out.println("Deleted from beginning: " + head.data);
        head = head.next;
    }

    void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Underflow: List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted last node: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        System.out.println("Deleted from end: " + temp.next.data);
        temp.next = null;
    }

    void deleteAtPosition(int pos) {
        if (isEmpty()) {
            System.out.println("Underflow: List is empty");
            return;
        }
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }
        System.out.println("Deleted from position " + pos + ": " + temp.next.data);
        temp.next = temp.next.next;
    }

    boolean search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value)
                return true;
            temp = temp.next;
        }
        return false;
    }

    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("List reversed.");
    }

    void sortList() {
        if (isEmpty() || head.next == null) {
            System.out.println("List is too short to sort.");
            return;
        }

        boolean swapped;
        Node current;
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("List sorted successfully.");
        display();
    }

    void display() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method with menu-driven program
    public static void main(String[] args) {
        LinkedListNode_Menu list = new LinkedListNode_Menu();
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Search");
            System.out.println("8. Sort List");
            System.out.println("9. Count Nodes");
            System.out.println("10. Reverse List");
            System.out.println("11. Display");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter value and position: ");
                    data = sc.nextInt();
                    pos = sc.nextInt();
                    list.insertAtPosition(data, pos);
                    break;
                case 4:
                    list.deleteAtBeginning();
                    break;
                case 5:
                    list.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    break;
                case 7:
                    System.out.print("Enter value to search: ");
                    data = sc.nextInt();
                    System.out.println(list.search(data) ? "Found!" : "Not found.");
                    break;
                case 8:
                    list.sortList();
                    break;
                case 9:
                    System.out.println("Total nodes: " + list.countNodes());
                    break;
                case 10:
                    list.reverse();
                    break;
                case 11:
                    list.display();
                    break;
                case 12:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 12);

        sc.close();
    }
}
