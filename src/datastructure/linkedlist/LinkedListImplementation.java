package datastructure.linkedlist;

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    LinkedList addNode(LinkedList list, int data) {
       Node newNode= new Node(data);
       newNode.next=null;

       if(list.head==null){
           list.head = newNode;
       }
       else{
           Node last=list.head;
           while(last.next!=null){
               last = last.next;
           }
           last.next = newNode;
       }
       return list;
    }

    void printAll(LinkedList linkedList){
        Node currNode= linkedList.head;
        while(currNode.next!=null){

            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        if(currNode.next==null)
            System.out.println(currNode.data);
    }
}

public class LinkedListImplementation {

    public static void main(String[] args) {
        LinkedList linkedList =new LinkedList();
        linkedList.addNode(linkedList, 2);
        linkedList.addNode(linkedList, 3);
        linkedList.addNode(linkedList, 4);
        linkedList.addNode(linkedList, 5);
        linkedList.addNode(linkedList, 6);
        linkedList.addNode(linkedList, 7);
        linkedList.addNode(linkedList, 8);

        linkedList.printAll(linkedList);

    }
}
