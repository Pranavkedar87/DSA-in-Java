package Queue;

public class NextGreaterElementTwoNotOptimal {
    public static int[] nextGreaterElements(int[] nums){
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = -1;
            int j = (i+1)%nums.length;
            while(i != j){
                if(nums[i] < nums[j]){
                    ans[i] = nums[j];
                    break;
                }
                j = (j+1)%nums.length;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,3};
        int res[] = nextGreaterElements(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
