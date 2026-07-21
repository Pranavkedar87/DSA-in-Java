package LinkedList;

public class RemoveNthNodeFromEndofList {
  public static class node {
    int data;
    node next;
    public node(int data){
        this.data = data;
        this.next = null;
    }
    }
    public static node head;
    public static int size;

    public void createNode(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public void removeNth(int n){
        if (head == null) {
             return;
        }

        if (n <= 0 || n > size) {
             System.out.println("Invalid position");
        }
        node temp = head;
        if(size-n == 0){
            head = head.next;
            size--;
            return;
        }
        for(int i=1;i<(size - n);i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public static void main(String args[]){
        RemoveNthNodeFromEndofList l1 = new RemoveNthNodeFromEndofList();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(9);
        l1.createNode(5);
        l1.createNode(88);
       // System.out.println(head.data);
        l1.printLL();
        System.out.println();
        l1.removeNth(2);
        l1.printLL();
    }
}
