public class TrappingRainWater {
    public static int calwater(int[] nums){
        int lmax[] = new int[nums.length];
        lmax[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            lmax[i] = Math.max(nums[i],lmax[i-1]);
        }
        int rmax[] = new int[nums.length];
        rmax[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rmax[i] = Math.max(nums[i],rmax[i+1]);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int water = Math.min(lmax[i],rmax[i]);
            count += water - nums[i];
        }
        return count;
    }
    public static void main(String args[]){
        int nums[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(calwater(nums));
    }
}
