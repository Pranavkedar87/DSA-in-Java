package LinkedList;

public class reverseALL {
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
        }
    }
    public void rev(){
        node prev = null;
        node curr = head;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        reverseALL l1 = new reverseALL();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(9);
        l1.createNode(5);
        l1.createNode(88);
       // System.out.println(head.data);
        l1.printLL();
        System.out.println();
        l1.rev();
        l1.printLL();
    }
}
