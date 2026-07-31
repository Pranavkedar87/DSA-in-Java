package LinkedList;

public class zigZagTheLL {
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
    public void zigZag(){
        //find the mid
        node slow = head;
        node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow;
        //reverse 2nd half
        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //alt merge zigZag
        node right = prev;
        node left = head;
        node nextL , nextR;
        while(right != null && left != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }

    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        zigZagTheLL l1 = new zigZagTheLL();
        l1.createNode(1);
        l1.createNode(2);
        l1.createNode(3);
        l1.createNode(4);
        l1.createNode(5);
       // System.out.println(head.data);
        l1.printLL();
        l1.zigZag();
        l1.printLL();
    }
}
