package Recursion;

public class RotateArray {
     public static void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return ;
        }
        k = k % nums.length;
        ans(0,nums.length-1,nums);
        ans(0,k-1,nums);
        ans(k,nums.length-1,nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void ans(int start, int end,int nums[]){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    } 
}
