package Strings;

import Recursion.sumOfN_NaturalNo;

public class RemoveAllOccurrencesofSubstring {
    public static String removeOccurrences(String s, String part) {
        while(s.indexOf(part) != -1){
            int start = s.indexOf(part);
            StringBuilder sb = new StringBuilder(s);
            sb.delete(start, start+part.length());
            s = sb.toString();
        }
        return s;
    }
    public static void main(String args[]){
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));
        
    }
}
