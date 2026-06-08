public class bubble_sort {
    public static int[] Sort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<(nums.length-i)-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
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
        int result[] = Sort(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        } 
    }
}
