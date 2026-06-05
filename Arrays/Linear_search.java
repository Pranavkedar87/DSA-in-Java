//The code is represent a linear search
public class Linear_search{
    public static int search(int nums[], int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {2,5,7,3,6,8};
        int result = search(nums,60);
        if(result == -1){
            System.out.println("The number is not found");
        }else{
            System.out.println("The no is found at index "+result);
        }
    }
}