package LinkedList;

public class PalindromeLinkedListByOptimal {
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
        tail.next = newNode;
        tail = newNode;
    }
    public node findMid(node head){
        node slow = head;
        node fast = head;
        //node temp = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkIs(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1
        node temp = findMid(head);
        //step 2
        node prev = null;
        node curr = temp;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //step 3
        node left = head;
        node right = prev;
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String args[]){
        PalindromeLinkedListByOptimal l1 = new PalindromeLinkedListByOptimal();
        l1.createNode(4);
        l1.createNode(6);
         l1.createNode(8);
         l1.createNode(69);
         l1.createNode(4);
        //System.out.println(head.data);
        //System.out.println(tail.data);
        System.out.println(l1.checkIs());
    }
}
