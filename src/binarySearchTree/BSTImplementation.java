package binarySearchTree;

class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        left = null;
        left = null;
    }
}

class BinarySearchTree {
    Node root;
    public static int level = 0;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertNode(root.left, key);
        } else {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public void printAll() {
        printAllNodes(root);
    }

    private void printAllNodes(Node root) {
        if (root != null) {
            printAllNodes(root.left);
            System.out.println(root.key);
            printAllNodes(root.right);
        }

    }

    public static boolean findNode( Node root, int key) {
        if (root == null) {
            level=0;
            return false;
        }
        if (root.key == key) {
            return true;
        }
        if (findNode(root.left,key)) {
            level++;
            return true;
        }
        if (findNode(root.right, key)){
            level++;
            return true;
        }
        return false;

    }
}


public class BSTImplementation {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(11);
        binarySearchTree.insert(15);
        binarySearchTree.insert(16);
        binarySearchTree.insert(7);
        binarySearchTree.insert(1);
        binarySearchTree.insert(8);
        binarySearchTree.insert(9);
        binarySearchTree.insert(13);
        binarySearchTree.insert(18);
        binarySearchTree.insert(19);
        binarySearchTree.insert(20);
        binarySearchTree.insert(21);

        binarySearchTree.printAll();

        System.out.println("Found? "+binarySearchTree.findNode(binarySearchTree.root, 21) + "Level " + BinarySearchTree.level);


    }

}
