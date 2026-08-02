package LinkedList;

public class mergeSort {
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
    //Find mid 
    public node mid(node head){
        node slow = head;
        node fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //paration 
    public node mergeSort(node head){
        //base condition
        if(head == null || head.next == null){
            return head;
        }
        node mid = mid(head);
        node rightnode = mid.next;
        mid.next = null;
        node left = mergeSort(head);
        node right = mergeSort(rightnode);
        return merge(left,right);
    }
    private node merge(node head1,node head2){
        node newList = new node(-1);
        node temp = newList;
        while(head1 != null && head2 != null){
            if(head1.data >= head2.data ){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }else{
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return newList.next;
    }
    public void printLL(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        mergeSort l1 = new mergeSort();
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(2);
        l1.createNode(9);
        l1.createNode(1);
       // System.out.println(head.data);
        l1.printLL();
        l1.head = l1.mergeSort(l1.head);
        System.out.println();
        l1.printLL();
    }
}
