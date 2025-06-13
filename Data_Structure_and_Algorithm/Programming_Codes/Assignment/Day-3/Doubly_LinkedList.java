class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

public class Doubly_LinkedList {
    Node top = null;

    void insertFirst(int val) {
        Node newNode = new Node(val);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top.prev = newNode;
            top = newNode;
        }
        System.out.println(val + " insert at the front.");
    }

    void insertLast(int val) {
        Node newNode = new Node(val);
        if (top == null) {
            top = newNode;
        } else {
            Node temp = top;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println(val + " insert at the end.");
    }

    void deleteFirst() {
        if (top == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println(top.data + " delete from the front.");
            top = top.next;
            if (top != null) top.prev = null;
        }
    }

    void deleteLast() {
        if (top == null) {
            System.out.println("List is empty.");
        } else if (top.next == null) {
            System.out.println(top.data + " delete from the end.");
            top = null;
        } else {
            Node temp = top;
            while (temp.next != null) temp = temp.next;
            System.out.println(temp.data + " delete from the end.");
            temp.prev.next = null;
        }
    }

    void displayForward() {
        if (top == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void displayBackward() {
        if (top == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = top;
        while (temp.next != null) temp = temp.next;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Doubly_LinkedList list = new Doubly_LinkedList();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertFirst(5);
        list.displayForward();
        list.displayBackward();
        list.deleteFirst();
        list.deleteLast();
        list.displayForward();
        list.displayBackward();
    }
}

