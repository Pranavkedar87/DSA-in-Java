package Stack;

public class stackUsingLinkedList {
    public static class node {
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class stack{
        static node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            node newnode = new node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
        public static int peek(){
            return head.data;
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
       // System.out.println(s.pop());
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
