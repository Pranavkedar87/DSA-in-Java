package Strings;

public class ReverseWordsinString {
    public static String reverseWords(String s){
        String ans = "";
        String s2 = new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++){
            String word = "";
            while(i < s.length() && s2.charAt(i) != ' '){
                word += s2.charAt(i);
                i++;
            }
            String word2 = new StringBuilder(word).reverse().toString();
            if(word2.length() > 0){
                ans+= ' '+word2; 
            }
        }
        return ans.substring(1);
    }
    public static void main(String args[]){
        String s =  "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
