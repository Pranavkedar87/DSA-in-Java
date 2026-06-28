import java.util.*;
public class threeSumProblem {
    public static void findTriplets(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
       findTriplets(nums);
    }
}
