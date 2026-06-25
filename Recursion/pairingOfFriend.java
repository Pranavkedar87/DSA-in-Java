package Recursion;

public class pairingOfFriend {
    public static int countPairings(int n){
        if(n ==1 || n == 2){
            return n;
        }
        return countPairings(n-1) + (n-1) * countPairings(n-2);
    }
    public static void main(String args[]){
        System.out.println(countPairings(3));
    }
}
