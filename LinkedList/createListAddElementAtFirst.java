package LinkedList;
public class createListAddElementAtFirst {
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
    public static void main(String args[]){
        createListAddElementAtFirst l1 = new createListAddElementAtFirst();
        l1.createNode(4);
        l1.createNode(6);
        System.out.println(head.data);
    }
}
