package Queue;

import java.util.*;

public class firstUniqueCharacterinString {
    public static void findTheUnique(String s){
        Queue<Character> q = new LinkedList<>();
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            q.add(ch);
            arr[ch - 'a']++;
            while(!q.isEmpty() && arr[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }else{
                System.out.println(q.peek());
            }
        }
    }
    public static void main(String args[]){
        String s =  "leetcode";
        findTheUnique(s);
    }
}
