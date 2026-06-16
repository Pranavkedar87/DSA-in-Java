package Recursion;

public class findFirstOccurance {
    public static int findFirstOccurance(int nums[],int i,int key){
        if(i == nums.length){
            return -1;
        }
        if(nums[i] == key){
            return i;
        }
        return findFirstOccurance(nums, i+1, key);
    }
    public static void main(String args[]){
        int nums[] = {1,3,5,8,7};
        System.out.println(findFirstOccurance(nums,0, 55));
    }
}
