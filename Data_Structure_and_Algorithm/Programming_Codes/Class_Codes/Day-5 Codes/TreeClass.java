import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeClass {
    Node root;

    // Insert into BST (Returns the updated root)
    Node insert(Node r, Node n) {
        if (r == null) {
            return n;
        }

        if (n.data < r.data) {
            if (r.left == null) {
                r.left = n;
                System.out.println(n.data + " inserted in tree (left of " + r.data + ")");
            } else {
                insert(r.left, n);
            }
        } else if (n.data > r.data) {  
            if (r.right == null) {
                r.right = n;
                System.out.println(n.data + " inserted in tree (right of " + r.data + ")");
            } else {
                insert(r.right, n);
            }
        } else {
            System.out.println("Duplicate value " + n.data + " not inserted!");
        }
        return r;
    }

    // Inorder Traversal (Left, Root, Right)
    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    // Preorder Traversal (Root, Left, Right)
    void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }

    // Count Total Nodes
    int countNodes(Node r) {
        return (r == null) ? 0 : 1 + countNodes(r.left) + countNodes(r.right);
        // if(r == null) {
        //     return 0;
        // }
        // return 1 + countNodes(r.left) + countNodes(r.right);
    }

    // Count Leaf Nodes
    int countLeafNodes(Node r) {
        if (r == null) return 0;
        if (r.left == null && r.right == null) return 1;
        return countLeafNodes(r.left) + countLeafNodes(r.right);
    }

    // Calculate Tree Height Correctly
    int height(Node r) {
        return (r == null) ? 0 : 1 + Math.max(height(r.left), height(r.right));
    }

    boolean searchElement(Node r, int key) {
        if (r == null) {
            System.out.println("Not Found");
            return false;
        } else{
            if (key == r.data) {
                System.out.println("Found");
                return true;
            } else {    
                if (key < r.data) 
                    return searchElement(r.left, key);
                else 
                    return searchElement(r.right, key);
            }
        }
    }

    int findSum(Node r) {
        if(r==null)
            return 0;
        return r.data + findSum(r.left) + findSum(r.right);
    }

    // int diameter(Node r) {
    //     if(r == null) {
    //         return 0;
    //     }
    //     return Math.max((height(r.left) + height(r.right) + 1), Math.max(diameter(r.left),diameter(r.right)));
    // }

    // Level Order Traversal (BFS)
    void levelOrder(Node r) {
        if (r == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(r);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (!q.isEmpty()) q.add(null);
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeClass tree = new TreeClass();

        // Insert nodes into BST
        tree.root = tree.insert(tree.root, new Node(2));
        tree.root = tree.insert(tree.root, new Node(1));
        tree.root = tree.insert(tree.root, new Node(10));
        tree.root = tree.insert(tree.root, new Node(20));
        tree.root = tree.insert(tree.root, new Node(5));
        tree.root = tree.insert(tree.root, new Node(7));
        tree.root = tree.insert(tree.root, new Node(6));

        // Traversal Outputs
        System.out.print("\nPreorder Traversal: ");
        tree.preorder(tree.root);

        System.out.print("\nInorder Traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPostorder Traversal: ");
        tree.postorder(tree.root);

        // CountNodes
        System.out.println("\n\nTotal Nodes: " + tree.countNodes(tree.root));

        //Count Leaf Nodes
        System.out.println("\nTotal Leaf Nodes: " + tree.countLeafNodes(tree.root));

        //Height of the 
        System.out.println("\nHeight of Tree: " + tree.height(tree.root));

        System.out.println("\nLevel Order Traversal:");
        tree.levelOrder(tree.root);

        // Test searchElement method
        int keyToSearch = 10;
        System.out.println("\nSearching for key " + keyToSearch + ":");
        boolean found = tree.searchElement(tree.root, keyToSearch);
        System.out.println("Result: " + (found ? "Key found in tree." : "Key not found in tree."));

        System.out.println("\nTree Sum of all node's data: " + tree.findSum(tree.root));
        
        // System.out.println("\nTree Diameter of all node's data: "+tree.diameter(tree.root));


    }
}
