public class RunningSumOfArray {
    public static void runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
         runningSum(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
       // System.out.println(runningSum(nums));
    }
}
