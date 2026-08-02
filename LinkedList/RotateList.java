package LinkedList;

public class RotateList {
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
     public static int size;

    public void createNode(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public node rotate(node head,int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }
        k =k % size;
        if(k == 0){
            return head;
        }
        node last = head;
        while(last.next.next != null){
            last = last.next;
        }
        for(int i=1;i<=k;i++){
            node temp = last.next;
            last.next = null;
            temp.next = head;
            head = temp;
            last = lastis(head);
        }
        return head;
    }
    public node lastis(node head){
        if(head == null || head.next == null){
            return head;
        }
        while(head.next.next != null){
            head = head.next;
        }
        return head;
    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }System.out.println("NULL");
    }
    public static void main(String args[]){
        RotateList l1 = new RotateList();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(9);
        l1.createNode(3);
        l1.createNode(19);
       // System.out.println(head.data);
        l1.printLL();
        l1.head = l1.rotate(l1.head, 2);
        l1.printLL();
    }
}
