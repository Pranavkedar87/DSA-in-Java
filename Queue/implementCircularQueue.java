package Queue;

public class implementCircularQueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        static boolean isEmpty(){
            if (rear == -1 && front == -1){
                return true;
            }
            return false;
        }
        static void add(int data){
            if((rear + 1)%size == front){
                return; 
            }
            if(front == -1){
                front = (front + 1)%size;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }
        static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }
        static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
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
