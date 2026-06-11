package math;

public class demo {
    public static int steps(int num){
        int result = 0;
        while(num > 0){
            if(num%2 == 0){
                num = num/2;
            }else{
                num = num-1;
            }
            result++;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(steps(8));
    }
}
