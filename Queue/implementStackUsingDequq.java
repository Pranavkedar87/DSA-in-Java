package Queue;

import java.util.*;

public class implementStackUsingDequq {
    public static class stack{
        static Deque<Integer> s = new LinkedList<>();
        static boolean isEmpty(){
            return s.isEmpty();
        }
        static void push(int data){
            s.addFirst(data);
        }
        static int pop(){
            return s.removeFirst();
        }
        static int peek(){
            return s.getFirst();
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
