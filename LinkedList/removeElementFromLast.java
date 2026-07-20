package LinkedList;

public class removeElementFromLast {
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
    public static int size;
    public void addfirst(int data){
        node newnode = new node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data){
        node newnode = new node(data);
        size++;
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
        size++;
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
    public void removeLast(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = tail = null;
            size--;
            return;
        }
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
       // node temp = head;
       // head = head.next;
        //temp = null;
        size--;
    }
    public static void main(String args[]){
       removeElementFromLast  l1 = new removeElementFromLast();
        l1.addfirst(4);
        l1.addfirst(6);
        l1.addlast(8);
        l1.addlast(99);
        l1.addlast(44);
        l1.addmid(0,2);
        l1.printLL();
        System.out.println();
        System.out.println(l1.size);
        l1.removeLast();
        l1.printLL();
        System.out.println();
         System.out.println(l1.size);
        //System.out.println(head.data);
        //System.out.println(tail.data);
    }
}
