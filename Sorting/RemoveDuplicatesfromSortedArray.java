public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int count[] = new int[max-min+1];
        for(int num : nums){
            count[num - min]++;
        }
        int k = 0;
        for(int i=0;i<count.length;i++){
            if(count[i] != 0){
                nums[k] = i+min;
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int nums[] = {2,2,4,2,4,6,8,10};
        System.out.println(removeDuplicates(nums));
    }
}
