package LinkedList;

public class addElemntAtFristDoubleLL {
    public static class node {
        int data ;
        node next;
        node prev;
        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static node head;
    public void addElemnt(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    public void printll(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        addElemntAtFristDoubleLL l1 = new addElemntAtFristDoubleLL();
        l1.addElemnt(1);
        l1.addElemnt(4);
        l1.addElemnt(7);
        l1.printll();
    }
}
