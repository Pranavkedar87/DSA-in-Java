package LinkedList;
import java.util.*;
public class LLByInbuildFunction {
    public static void main(String argg[]){
        LinkedList<Integer> ll = new LinkedList<>();
        //add element 
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(66);
        ll.addLast(554);
        //print
        System.out.println(ll);  
        //remove
        ll.removeLast();
        ll.removeFirst();
        //print
        System.out.println(ll);
    }
}
