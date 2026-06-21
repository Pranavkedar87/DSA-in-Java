package Recursion;

public class findFirstOccurance {
    public static int FindFirstOccurance(int nums[],int i,int key){
        if(i == nums.length){
            return -1;
        }
        if(nums[i] == key){
            return i;
        }
        return FindFirstOccurance(nums, i+1, key);
    }
    public static void main(String args[]){
        int nums[] = {1,3,5,8,7};
        System.out.println(FindFirstOccurance(nums,0, 5));
    }
}
