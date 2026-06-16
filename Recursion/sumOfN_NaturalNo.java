package Recursion;

public class sumOfN_NaturalNo {
    public static int naturalNo(int n){
        if(n == 1){
            return 1;
        }
         return n + naturalNo(n-1);
    }
    public static void main(String args[]){
        System.out.println(naturalNo(5));
    }
}
