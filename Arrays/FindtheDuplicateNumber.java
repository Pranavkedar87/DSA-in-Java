

public class FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        int count[] = new int[max - min + 1];
        for(int num : nums){
            count[num - min]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i] > 1){
                return i+min;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
