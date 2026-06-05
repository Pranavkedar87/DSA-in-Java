// Prefix Sum approach to count subarrays with sum equal to k
public class SubarraySumEqualsK_PrefixSum {
    public static int subarraySum(int[] nums, int k) {
        int prifixArray[] = new int[nums.length];
        int result=0;
        prifixArray[0]=nums[0];
        for(int i=1;i<nums.length;i++){
             prifixArray[i]=prifixArray[i-1]+nums[i]; 
        }
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                int count =0;
                if(start == 0){
                    count = prifixArray[end];
                }else{
                    count = prifixArray[end]-prifixArray[start-1];
                }
                if(count == k){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {1,1,1};
        int k=2;
        int result = subarraySum(nums,k);
        System.out.println(result);
    }
}

