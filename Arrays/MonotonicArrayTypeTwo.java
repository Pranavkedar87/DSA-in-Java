public class MonotonicArrayTypeTwo {
    public static Boolean isMonotonic(int[] nums){
        int inc = 0;
        int dec = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){
                inc++;
            }
            if(nums[i] >= nums[i+1]){
                dec++;
            }
        }
        if(inc == nums.length-1 || dec == nums.length-1){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
}
