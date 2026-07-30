package LinkedList;

public class ReverseLinkedListTypeTwo {
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

    public void createNode(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void rev(int left,int right){
        if(left == right){
            return;
        }
        node tt = head;
        for(int i=1;i<left;i++){
            tt = tt.next;
        }
        node temp = null;
        if(left > 1){
             temp = head;
            for(int i=1;i<left-1;i++){
                temp = temp.next;
            }
        }
        node prev = null;
        node curr = tt;
        node next;
        for(int i=left;i<=right;i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tt.next = curr;
        if(left == 1){
            head = prev;
        }else{
            temp.next = prev;
        }
    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        ReverseLinkedListTypeTwo l1 = new ReverseLinkedListTypeTwo();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(9);
        l1.createNode(12);
        l1.createNode(66);
        l1.createNode(91);
       // System.out.println(head.data);
        l1.printLL();
        l1.rev(2,4);
        System.out.println();
         l1.printLL();
    }
}
