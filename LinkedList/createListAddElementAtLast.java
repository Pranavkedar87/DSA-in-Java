package LinkedList;

public class createListAddElementAtLast {
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
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String args[]){
        createListAddElementAtLast l1 = new createListAddElementAtLast();
        l1.createNode(4);
        l1.createNode(6);
         l1.createNode(8);
        System.out.println(head.data);
        System.out.println(tail.data);
    }
}
