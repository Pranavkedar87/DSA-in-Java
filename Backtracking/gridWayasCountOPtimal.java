package Backtracking;

public class gridWayasCountOPtimal {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int gridWayasCount(int n,int m){
        int ab = fact((n-1+m-1));
        int a = fact(n-1);
        int b = fact(m-1);
        return ab/(a*b);
    }
    public static void main(String args[]){
        System.out.println(gridWayasCount(3, 3));
    }
}
