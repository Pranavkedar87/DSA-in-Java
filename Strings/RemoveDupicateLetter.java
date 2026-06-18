package Strings;
import java.util.*;
public class em {
    public static  String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder("");
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        } 
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                sb.append((char)('a'+i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
       // System.out.println((char)(1+'a'));
        //dd("aabbppzz");
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
}
