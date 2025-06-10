import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node root, last;

    // Insert at the beginning (left side)
    void insertLeft(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;
            last.next = root;
        } else {
            n.next = root;
            root = n;
            last.next = root;
        }
        System.out.println(data + " inserted at left");
    }

    // Insert at the end (right side)
    void insertRight(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;
            last.next = root;
        } else {
            last.next = n;
            last = n;
            last.next = root;
        }
        System.out.println(data + " inserted at right");
    }

    // Delete from the beginning (left side)
    void deleteLeft() {
        if (root == null) {
            System.out.println("List Empty");
        } else if (root == last) {
            System.out.println(root.data + " deleted from left");
            root = last = null;
        } else {
            System.out.println(root.data + " deleted from left");
            root = root.next;
            last.next = root;
        }
    }

    // Delete from the end (right side)
    void deleteRight() {
        if (root == null) {
            System.out.println("List Empty");
        } else if (root == last) {
            System.out.println(root.data + " deleted from right");
            root = last = null;
        } else {
            Node t = root;
            while (t.next != last) {
                t = t.next;
            }
            System.out.println(last.data + " deleted from right");
            last = t;
            last.next = root;
        }
    }

    // Display the list
    void display() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            System.out.print("List: ");
            do {
                System.out.print("| " + t.data + " | -> ");
                t = t.next;
            } while (t != root);
            System.out.println("(back to root)");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circle = new CircularLinkedList();

        circle.insertRight(20);
        circle.insertRight(30);
        circle.display();

        circle.insertLeft(5);
        circle.display();

        circle.deleteLeft();
        circle.display();

        circle.deleteRight();
        circle.display();
    }
}
