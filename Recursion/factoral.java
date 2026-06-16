package Recursion;

public class factoral {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        return x * myPow(x,n-1);
    }
    public static void main(String args[]){
        System.out.println(fact(4));
        System.out.println(myPow(2,10));
    }
}
