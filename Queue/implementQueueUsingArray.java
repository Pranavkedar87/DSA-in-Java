package Queue;

import Stack.stackUsingLinkedList.stack;

public class implementQueueUsingArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;

            
        }
        static boolean isEmpty(){
            if (rear == -1){
                return true;
            }
            return false;
        }
        static void add(int data){
            if(rear == size-1){
                return; 
            }
            rear++;
            arr[rear] = data;
        }
        static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        static int peek(){
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
