import java.util.*;
public class InbuildSort {
    public static void main(String args[]){
        System.out.println("Before Sorting:");
        int nums[] = {5,3,8,2,1,9};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        } 
        System.out.println("");
        System.out.println("After Sorting:");
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        } 
    } 
}
