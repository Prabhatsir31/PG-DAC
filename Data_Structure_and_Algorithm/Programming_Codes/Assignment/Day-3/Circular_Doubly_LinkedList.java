public class Circular_Doubly_LinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        System.out.println(data + " inserted at end");
    }

    // Insert at the beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        System.out.println(data + " inserted at beginning");
    }

    // Delete from the beginning
    public void deleteBeginning() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }
        System.out.println(head.data + " deleted from beginning");
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Delete from the end
    public void deleteEnd() {
        if (tail == null) {
            System.out.println("List Empty");
            return;
        }
        System.out.println(tail.data + " deleted from end");
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    // Display list from head to tail
    public void displayForward() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }
        System.out.print("List forward: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Display list from tail to head
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List Empty");
            return;
        }
        System.out.print("List backward: ");
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    public static void main(String[] args) {
        Circular_Doubly_LinkedList cdll = new Circular_Doubly_LinkedList();

        cdll.insertEnd(10);
        cdll.insertBeginning(5);
        cdll.insertEnd(15);
        cdll.insertBeginning(2);

        cdll.displayForward();
        cdll.displayBackward();

        cdll.deleteBeginning();
        cdll.displayForward();

        cdll.deleteEnd();
        cdll.displayForward();
    }
}
