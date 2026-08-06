package Stack;
import java.util.*;
public class reverseStringUsingStack {
    public static String rev(String str){
        StringBuilder sb = new StringBuilder("");
        Stack<Character> s = new Stack();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        } 
        for(int i=0;i<str.length();i++){
            sb.append(s.pop());
        } 
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "pranav";
        System.out.println(rev(str));
    }
}
