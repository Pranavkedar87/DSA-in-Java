package Recursion;

public class printOneToN {
    public static void printNo(int n){
        if(n != 0){
            System.out.print(n+" ");
            printNo(n-1);
        }
    }
    public static void main(String args[]){
        printNo(50);
    }
}
