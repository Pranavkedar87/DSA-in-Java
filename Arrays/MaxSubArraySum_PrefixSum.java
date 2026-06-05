public class MaxSubArraySum_PrefixSum {
    public static int MaxE(int nums[]){
        int prefixArray[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        prefixArray[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixArray[i] = prefixArray[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end =j;
                int count=0;
                if(start == 0){
                    count = prefixArray[end];
                }else{
                    count = prefixArray[end] - prefixArray[start-1];
                }
                if(max < count ){
                    max = count;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int nums[] = {1,-2,6,-1,3};
        int result = MaxE(nums);
        System.out.println("The Max Sub-Array Sum is "+result);
    }
}
