public class Reverse_array {
    public static void reverse(int nums[]){
        int start=0;
        int end = nums.length-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start = start+1;
            end = end-1; 
        }
    }
    public static void main(String args[]){
        int nums[] = {2,3,4,5,6,7};
        System.out.println("before Reverse Array: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(" ");
        reverse(nums);
        System.out.println("after Reverse Array: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
