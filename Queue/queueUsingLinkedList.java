package Queue;

public class queueUsingLinkedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public static class Queue{
        static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
        static void insert(int data){
            node newnode = new node(data);
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        static int remove(){
            if(head == null){
                return -1;
            }
            if(head.next == null){
                int result = head.data;
                head = tail = null;
                return result;
            }
             node result = head;
             head = head.next;
             result.next = null;
             return result.data;
        }
        static int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
}
}
