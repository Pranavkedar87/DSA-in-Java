package Backtracking;
//Time complexcity O(n * 2^n)
public class findSubset {
    public static void subset(String str,String ans,int i){
        //base
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                 System.out.println(ans);
            }
            return;
        }
        //work
        subset(str, ans+str.charAt(i), i+1);
        subset(str, ans, i+1);
    }
    public static void main(String args[]){
        subset("abc", "", 0);
    }
}
