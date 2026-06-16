package Recursion;
public class CheckifArrayIsSorted {
    public static boolean check(int[] nums,int i) {
        if(i == nums.length-1){
            return true;
        }
        if(nums[i] > nums[i+1]){
            return false;
        }
        return check(nums,i+1);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,10};
        System.out.println(check(nums,0));
    }
    
}
