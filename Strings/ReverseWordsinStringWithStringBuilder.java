package Strings;

public class ReverseWordsinStringWithStringBuilder {
     public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        //String ans = "";
        String s2 = new StringBuilder(s).reverse().toString();
        StringBuilder word = new StringBuilder("");
        for(int i=0;i<n;i++){
            word.setLength(0);
            //String word = "";
            while(i < n && s2.charAt(i) != ' '){
                word.append(s2.charAt(i));
                i++;
            }
            String word2 = word.reverse().toString();
            if(word.length() > 0){
                ans.append(" ").append(word2);
            }
        }
        return ans.toString().substring(1);
    }
    public static void main(String args[]){
        String s =  "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
