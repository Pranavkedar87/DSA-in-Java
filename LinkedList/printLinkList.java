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
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }System.out.println("NULL");
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
