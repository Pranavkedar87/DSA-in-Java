public class MonotonicArrayTypeThree {
    public static Boolean isMonotonic(int[] nums){
        Boolean inc = true;
        Boolean dec = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                inc = false;
            }
            if(nums[i] > nums[i+1]){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String args[]){
        int nums[] = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
}
