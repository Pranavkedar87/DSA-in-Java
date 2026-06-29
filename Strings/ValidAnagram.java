package Strings;

public class ValidAnagram {
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        int sArray[] = new int[26];
        int tArray[] = new int[26];
        for(int i=0;i<s.length();i++){
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(sArray[i] != tArray[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isAnagram("rac", "car"));
    }
}
