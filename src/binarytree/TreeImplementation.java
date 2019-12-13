package binarytree;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int item) {
        this.key = item;
        left = null;
        right = null;
    }
}

public class TreeImplementation {

    static int level = 0;
    static boolean isFound = false;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.right.left.left = new Node(8);
        root.right.left.right = new Node(9);
        root.right.right.left = new Node(10);
        root.right.right.right = new Node(11);

        int key = 9;
        System.out.println(ifNodeExists(root, key));
        System.out.println(level);
    }

    static boolean ifNodeExists(Node root, int key) {

        if (root == null)
            return false;
        if (root.key == key)
            return true;
        if (ifNodeExists(root.left, key)) {
            level++;
            return true;
        }
        if (ifNodeExists(root.right, key)) {
            level++;
            return true;
        }
        return false;
    }
}
