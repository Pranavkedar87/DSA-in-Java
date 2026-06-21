public class MajorityElement_MooresVoting {
    public static int MajorityElement(int nums[]){
        int count = 0, ans = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(MajorityElement(nums));
    }
}
