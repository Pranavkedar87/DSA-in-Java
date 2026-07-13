package LinkedList;

public class printLinkList {
   // package LinkedList;
    public static class node {
    int data;
    node next;
    public node(int data){
        this.data = data;
        this.next = null;
    }
}
    public static node head;
    public static node tail;

    public void createNode(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printLL(){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String args[]){
        printLinkList l1 = new printLinkList();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(9);
       // System.out.println(head.data);
        l1.printLL();
    }
}
