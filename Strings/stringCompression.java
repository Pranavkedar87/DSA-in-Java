package Strings;
import java.util.*;
public class stringCompression {
    public static String compress(String s){
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i != s.length()){
            int count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count > 1){
                sb.append(count);
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String args[]){
        System.out.println(compress("abcdd"));
    }
   
}
