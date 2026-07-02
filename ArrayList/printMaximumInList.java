package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class printMaximumInList {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        for(int i=ans.size()-1;i>=0;i--){
            max = Math.max(ans.get(i),max);
        }
        System.out.println(max);
    }
}
