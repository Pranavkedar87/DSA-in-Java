package math;

public class SubtractProductandSum {
    public static int subtractProductAndSum(int sum,int product,int n){
        if(n == 0){
            return product - sum;
        }
        int lastno = n%10;
        sum +=lastno;
        product *=lastno;
        return subtractProductAndSum(sum,product,n/10);
    }
    public static void main(String args[]){
        System.out.println(subtractProductAndSum(0, 1, 4421));
    }
}
