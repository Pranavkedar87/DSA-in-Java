package ArrayList;
import java.util.*;
public class OprationOnArrayList {
    public static void main(String args[]){
        //Create an array list
        List<Integer> ans = new ArrayList<>();
        //add element O(1)
        System.out.println(ans.add(3));
        System.out.println(ans.add(7));
        System.out.println(ans.add(4));
        System.out.println(ans.add(40));
        //get element O(1)
        System.out.println(ans.get(0));
        //Remove element O(n)
        System.out.println(ans.remove(0));
        //print list
        System.out.println(ans);
        //set element O(n)
        System.out.println(ans.set(2,10));
        //print list
        System.out.println(ans);
        //contain element O(n)
        System.out.println(ans.contains(6));
        System.out.println(ans.contains(7));
        //Size of Array List by using size() function
        System.out.println(ans.size());
        //Print by using For loop
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
