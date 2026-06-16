package Recursion;

public class printNtoOne {
     public static void printNo(int n){
        if(n != 0){
            printNo(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String args[]){
        printNo(5);
    }
}
