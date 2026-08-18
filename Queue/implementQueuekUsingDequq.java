package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class implementQueuekUsingDequq {
    public static class Queue{
        static Deque<Integer> q = new LinkedList<>();
        static boolean isEmpty(){
            return q.isEmpty();
        }
        static void push(int data){
            q.addFirst(data);
        }
        static int pop(){
            return q.removeLast();
        }
        static int peek(){
            return q.getLast();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.pop());
        }
    }
}
