public class MajorityElement_BruteForce {
    public static int MajorityElement(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > (nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(MajorityElement(nums));
    }
}
