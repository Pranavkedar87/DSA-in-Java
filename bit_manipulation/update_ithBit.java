package bit_manipulation;

public class update_ithBit {
    public static int clearBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
     public static int setBit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int update(int n,int i,int newbit){
        if(newbit == 0){
            return clearBit(n,i);
        }
        else{
            return setBit(n,i);
        }
    }
    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
}
