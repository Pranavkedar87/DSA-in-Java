public class MaxSubArraySum_kadanesAlgo {
    public static int MaxE(int nums[]){
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs = cs + nums[i];
            if(cs <0 ){
                cs=0;
            }
            max = Math.max(cs,max);
        }
        return max;
    }
    public static void main(String args[]){
        int nums[] = {1,-2,6,-1,3};
        int result = MaxE(nums);
        System.out.println("The Max Sub-Array Sum is "+result);
    }
}
