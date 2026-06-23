import java.util.Arrays;

public class MaximumGap {
    public static int maximumGap(int[] nums) {
       // int max = Integer.MIN_VALUE;
        int max_diff = Integer.MIN_VALUE;
        if(nums.length <2){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i] > max_diff){
                max_diff = (nums[i+1]-nums[i]);
            }
        }
        return max_diff;
    }
    public static void main(String args[]){
        int nums[] = {3,6,9,1};
        System.out.println(maximumGap(nums));
    } 
}
