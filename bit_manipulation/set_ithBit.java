package bit_manipulation;

public class set_ithBit {
    public static int setBit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int smallestNumber(int n) {
        return ((n&(n-1))*2)-1 ;
    }
    public static void main(String args[]){
        System.out.println(smallestNumber(4));
    }
}
