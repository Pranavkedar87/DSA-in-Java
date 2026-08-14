package Queue;
import java.util.*;
public class implementQueueusingStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static class Queue{
        public void insert(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
             while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int remove(){
            return s1.pop();
        }
        public int peek(){
            return s1.peek();
        }
        public boolean isEmpty(){
            return s1.isEmpty();
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
