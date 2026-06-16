package Recursion;

public class findLastOccurance {
    public static int LastOccurance(int nums[],int i,int key){
        if(i == nums.length){
            return -1;
        }
        int isFound = LastOccurance(nums, i+1, key);
        if(isFound == -1 && nums[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int nums[] = {1,3,5,8,7,5};
        System.out.println(LastOccurance(nums,0, 5));
    }
}
