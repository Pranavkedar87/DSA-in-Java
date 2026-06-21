import java.util.*; 
public class MajorityElement_Optimize {
    public static int MajorityElement(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                count++;
            }else{
                count = 1;
            }
            if(count > nums.length/2){
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
