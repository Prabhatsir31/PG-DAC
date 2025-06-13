// Node class definition for singly linked list
class Node {
    int data;       // Data to store in the node
    Node next;      // Pointer to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main LinkedList class
public class LinkedListClass {
    Node root; // Head of the linked list

    // Insert at the beginning (left side)
    void insertLeft(int data) {
        Node n = new Node(data); // Create a new node
        if (root == null) {
            root = n; // First node becomes the root
        } else {
            n.next = root; // Point new node to current root
            root = n;      // Make new node the root
        }
        System.out.println(data + " inserted at left");
    }

    // Insert at the end (right side)
    void insertRight(int data) {
        Node n = new Node(data); // Create a new node
        if (root == null) {
            root = n; // First node becomes the root
        } else {
            Node t = root; // Temporary pointer to traverse
            while (t.next != null) {
                t = t.next; // Move to the end
            }
            t.next = n; // Link the last node to new node
        }
        System.out.println(data + " inserted at right");
    }

    // Delete from the beginning (left side)
    void deleteLeft() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;      // Store current root
            root = root.next;   // Move root to next node
            System.out.println(t.data + " deleted from left");
        }
    }

    // Delete from the end (right side)
    void deleteRight() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            Node t2 = null;

            while (t.next != null) {
                t2 = t;     // t2 trails behind t
                t = t.next; // t moves to end
            }

            if (t2 == null) {
                root = null; // Only one node in list
            } else {
                t2.next = null; // Remove last node
            }

            System.out.println(t.data + " deleted from right");
        }
    }

    // Search for an element in the list
    boolean SearchList(int key) {
        if (root == null) {
            System.out.println("List Empty");
            return false;
        } else {
            Node t = root;
            while (t != null) {
                if (t.data == key) {
                    return true; // Key found
                }
                t = t.next;
            }
        }
        return false; // Key not found
    }

    // Insert a new node after a given reference node
    void insertAfter(int ref, int new_data) {
        if (root == null) {
            System.out.println("List Empty, cannot search anything");
        } else {
            Node t = root;
            while (t != null) {
                if (t.data == ref) {
                    break; // Stop searching
                }
                t = t.next; // Move
            }
            if (t == null) {
                System.out.println(ref + " not found");
            } else { // Found
                Node n = new Node(new_data);
                n.next = t.next; // Link new node to the next node
                t.next = n; // Insert new node after the reference node
                System.out.println(n.data + " inserted after " + ref);
            }
        }
    }

    // Delete a specific element from the list
    void deleteElement(int key) {
        if (root == null) {
            System.out.println("List Empty, cannot search anything");
        } else {
            Node t = root;
            Node t2 = null;
            while (t != null) {
                if (t.data == key) {
                    break; // Stop searching
                }
                t2 = t; // Track previous node
                t = t.next; // Move
            }
            if (t == null) {
                System.out.println(key + " not found");
            } else { // Found
                if (t == root) { // Case 1: Deleting the root
                    root = root.next;
                } else if (t.next == null) { // Case 2: Deleting the last node
                    t2.next = null;
                } else { // Case 3: Deleting a middle node
                    t2.next = t.next;
                }
                System.out.println(t.data + " found and deleted");
            }
        }
    }

    // Sort the linked list using bubble sort
    void sortList() {
        if (root == null) {
            System.out.println("List Empty");
            return; // Exit if the list is empty
        } else {
            for (Node i = root; i != null; i = i.next) { // Outer loop
                for (Node j = i.next; j != null; j = j.next) { // Inner loop
                    if (j.data < i.data) {
                        // Swap values
                        int temp = i.data;
                        i.data = j.data;
                        j.data = temp;
                    }
                }
            }
            System.out.println("List sorted successfully.");
        }
    }

    // Display the linked list
    void printList() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            System.out.print("List: ");
            while (t != null) {
                System.out.print("| " + t.data + " | -> ");
                t = t.next; // Move to next node
            }
            System.out.println("null");
        }
    }

    // Main method for basic testing
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();

        System.out.println();
        list.insertLeft(10);
        list.insertRight(20);
        list.insertLeft(35);
        list.insertRight(45);
        list.insertLeft(5);
        list.deleteElement(20);
        list.insertRight(30);
        list.printList(); 

        list.deleteLeft();
        System.out.println("Searching for 10: " + list.SearchList(10));
        list.deleteRight();
        list.sortList();
        list.printList();
    }
}
