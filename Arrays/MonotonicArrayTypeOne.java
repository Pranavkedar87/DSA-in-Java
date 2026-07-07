public class MonotonicArrayTypeOne {
    public static boolean isMonotonic(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){
                ans++;
            }
        }
        if(ans == nums.length-1){
            return true;
        }else{
            ans = 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]){
                ans++;
            }
        }
        if(ans == nums.length-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int nums[] = {1,5,2,3};
        System.out.println(isMonotonic(nums));
    }
}
