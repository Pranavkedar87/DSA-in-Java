package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class swapNumber {
    public static void main(String args[]){
       // int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        System.out.println(ans);
        int temp = ans.get(1);
        ans.set(1,ans.get(3));
        ans.set(3,temp);
        System.out.println(ans);
    }
}
