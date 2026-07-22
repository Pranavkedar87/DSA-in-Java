package LinkedList;

//import Strings.chackPalindrome;

public class PalindromeLinkedListByUsingString {
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
    public boolean checkIs(){
        if(head == null){
            return true;
        }
        StringBuilder sb = new StringBuilder("");
        while(head != null){
            sb.append(head.data);
            head = head.next;
        }
        int start =0;
        int end = sb.length()-1;
        while(start <= end){
            if(sb.charAt(start) != sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        PalindromeLinkedListByUsingString l1 = new PalindromeLinkedListByUsingString();
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
