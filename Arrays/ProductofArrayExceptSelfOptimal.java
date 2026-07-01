public class ProductofArrayExceptSelfOptimal {
    public static int[] productExceptSelf(int[] nums){
        int ans[] = new int[nums.length];
        ans[0] = 1;
        for(int i=1;i<nums.length;i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int suffix = 1;
        for(int i=nums.length-2;i>=0;i--){
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int ans[] = productExceptSelf(nums);
         for(int i=0;i<ans.length;i++){
           System.out.print(ans[i]+" ");
        }
    }
}
