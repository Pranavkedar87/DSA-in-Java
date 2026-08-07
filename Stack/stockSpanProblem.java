package Stack;

import java.util.Stack;

public class stockSpanProblem {
    public static int[] cal(int[] price){
        int span[] = new int[price.length];
        span[0] = 1;
        Stack<Integer> s = new Stack<>();
         s.push(0);
        for(int i=1;i<price.length;i++){
            while(!s.isEmpty() && price[i] >= price[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i + 1;
            }else{
                int prev = s.peek();
                //s.push(i-prev);
                span[i] = i - prev;
            }
            s.push(i);
        }
        return span;
    }
    public static void main(String args[]){
        int[] price = {100,80,60,70,60,75,80};
        int result[] = cal(price);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
