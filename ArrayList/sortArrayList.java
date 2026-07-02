package ArrayList;

import java.util.ArrayList;
import java.util.*;

public class sortArrayList {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(4);
        ans.add(5);
        ans.add(2);
        ans.add(3);
        System.out.println(ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
