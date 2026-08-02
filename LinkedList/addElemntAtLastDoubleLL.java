package LinkedList;

public class addElemntAtLastDoubleLL {
    public static class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static node head;
    public static node tail;
    public void addLast(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode; 
    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }System.out.println("NULL");
    }
    public static void main(String args[]){
        addElemntAtLastDoubleLL l1 = new addElemntAtLastDoubleLL();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.printLL();
    }
}
