public class Largest_no {
    public static int largestNo(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int nums[] = {2,555,7,4,44,99,1};
        int result = largestNo(nums);
        System.out.println("The largest no is "+result);
    }
    
}
