import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int nums[]){
        int pivot = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            Arrays.sort(nums);
        }else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[pivot] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
            int i = pivot+1;
            int j = nums.length-1;
            while(i <= i){
                 int temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
                 i++;
                 j--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int nums[] = {3,2,1};
        nextPermutation(nums);
    }
}
