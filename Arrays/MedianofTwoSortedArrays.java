import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int newArray[] = new int[nums1.length+nums2.length];
       for(int i=0;i<(nums1.length+nums2.length);i++){
        if(i < nums1.length){
            newArray[i] = nums1[i];
        }else{
            newArray[i] = nums2[i-nums1.length];
        }
       }
       Arrays.sort(newArray);
       if(newArray.length%2 == 0){
        return ((double)(newArray[newArray.length / 2])+(newArray[(newArray.length / 2)-1]))/2;
       }else{
        return (newArray[(newArray.length/2)]);
       }
    }
    public static void main(String[] args){
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
