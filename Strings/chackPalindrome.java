package Strings;

public class chackPalindrome {
    public static boolean check(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt((n-1)-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "madam";
        System.out.println(check(s));
    }
}
