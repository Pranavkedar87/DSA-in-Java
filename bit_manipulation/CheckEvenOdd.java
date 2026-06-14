package bit_manipulation;

public class CheckEvenOdd {
    public static void oddoreven(int n){
        if((n & 1) == 0){
           System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println(5/2);
    }
    
    public static void main(String args[]){
        oddoreven(2);
    }
}
