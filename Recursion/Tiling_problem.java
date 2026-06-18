package Recursion;

public class Tiling_problem {
    public static int Tile(int n){
        //2 * n
        //base condition
        if(n == 0 || n==1){
            return 1;
        }
        //horizontal
        int fH = Tile(n-2);
        //vertical
        int fV = Tile(n-1);
        
        return fH + fV;
    }
    public static void main(String args[]){
        System.out.println(Tile(4));
    }
}
