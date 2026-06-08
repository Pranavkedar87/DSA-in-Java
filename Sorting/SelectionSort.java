public class SelectionSort {
    public static int[] Sort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int spn = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[spn]){
                   spn = j;
                }
            }
            if(spn != i){
                int temp = nums[i];
                nums[i] = nums[spn];
                nums[spn] = temp;
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
