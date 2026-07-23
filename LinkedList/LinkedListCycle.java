package LinkedList;

public class LinkedListCycle {
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
       // tail.next = head;
    }
    public void printLL(){
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    public boolean isPresent(){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        LinkedListCycle l1 = new LinkedListCycle();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(9);
        l1.createNode(5);
        l1.createNode(44);
        l1.createNode(93);
       // System.out.println(head.data);
       // l1.printLL();
       System.out.println(l1.isPresent());
    }
}
