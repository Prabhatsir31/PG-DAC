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
            Node t2 = root;

            while (t.next != null) {
                t2 = t;     // t2 trails behind t
                t = t.next; // t moves to end
            }

            if (t == root) {
                root = null; // Only one node in list
            } else {
                t2.next = null; // Remove last node
            }

            System.out.println(t.data + " deleted from right");
        }
    }

    boolean SearchList(int key) {
        if(root == null) {
            System.out.println("List Empty");
        }
        else {
            Node t = root;
            while(t != null) {
                if(t.data == key) {
                    return true;
                }
                t = t.next;
            }
        }
        return false;
    }

    void insertAfter(int ref,int new_data)
    {
        if (root == null)//root not created but assigned
            System.out.println("List Empty can not search anything");
        else {
              Node t = root;//1
              while (t != null)
              {
                    if (t.data == ref)
                      break;//stop searching
                t = t.next;//move
            }
            if (t == null)
                System.out.println(ref + " not found");
            else//found
            {
                Node n=new Node(new_data);
                n.next=t.next;//1
                t.next=n;//2
                System.out.println(n.data + " Inserted");
            }
        }
    }


    void deleteElement(int key) {
        if (root == null)//root not created but assigned
            System.out.println("List Empty can not search anything");
        else {
            Node t = root;//1
            Node t2 = root;//1
            while (t != null) {
                if (t.data == key)
                    break;//stop searching
                t2 = t;//tail
                t = t.next;//move
            }
            if (t == null)
                System.out.println(key + " not found");
            else//found
            {
                if (t == root)//case 1
                    root = root.next;
                else if (t.next == null)//case 2
                    t2.next = null;
                else//case 3
                    t2.next = t.next;
                System.out.println(t.data + " found and deleted");
            }
        }
    }

    void Sorting() {
        if(root == null || root.next == null) {
            System.out.println("List is too short to sort");
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = root;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // swap values
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("List sorted successfully.");
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

        list.insertLeft(10);
        list.insertRight(20);
        list.insertLeft(5);
        list.deleteElement(20);
        list.insertRight(30);
        list.printList(); 

        list.deleteLeft();
        list.SearchList(10);
        list.deleteRight();
        list.Sorting();
        list.printList();
    }
}
