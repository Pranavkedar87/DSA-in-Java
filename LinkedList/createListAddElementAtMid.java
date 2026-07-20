package LinkedList;

public class createListAddElementAtMid {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public void addfirst(int data){
        node newnode = new node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data){
        node newnode = new node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void addmid(int data, int index){
        if(index == 0){
            addfirst(data);
            return;
        }
        node newnode = new node(data);
        int i = 0;
        node temp = head;
        while(i < index-1 && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        temp = null;
        if(newnode.next == null){
            tail = newnode;
        }
    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }System.out.print("NULL");
    }
    public static void main(String args[]){
        createListAddElementAtMid  l1 = new createListAddElementAtMid ();
        l1.addfirst(4);
        l1.addfirst(6);
        l1.addlast(8);
        l1.addlast(99);
        l1.addlast(44);
        l1.addmid(0,2);
        l1.printLL();
        //System.out.println(head.data);
        //System.out.println(tail.data);
    }
}
