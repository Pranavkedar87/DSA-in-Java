import java.util.ArrayList;
import java.util.List;

import Strings.stringCompression;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        //int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        //int ans[] = new int[nums.length];
        for(int i=0;i<=nums.length-k;i++){
            int j = i;
            int count = 0;
            int max = Integer.MIN_VALUE;
            while(count < k){
                max = Math.max(nums[j],max);
                j++;
                count++;
            }
            ans.add(max);
        }
        int[] result = new int[ans.size()];

for (int i = 0; i < ans.size(); i++) {
    result[i] = ans.get(i);
}

return result;
}
public static void main(String args[]){
    int nums[] = {1,3,-1,-3,5,3,6,7};
    int ans[] = maxSlidingWindow(nums,3);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
}
}
