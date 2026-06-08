public class InsertionSort {
    public static int[] sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev >= 0 && curr < nums[prev]){
                nums[prev+1] = nums[prev];
                prev--; 
            }
            nums[prev+1] = curr;
        }
        return nums;
    }
    public static void main(String[] args){
        System.out.println("Before Sorting:");
        int nums[] = {5,3,8,2,1,9};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        } 
        System.out.println("");
        System.out.println("After Sorting:");
        int result[] = sort(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        } 
    }
}
