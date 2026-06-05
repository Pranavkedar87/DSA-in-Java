public class MaxSubArraySum_BruteForce {
    public static int MaxE(int nums[]){
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                int count =0;
                for(int k=start;k<=end;k++){
                    count+=nums[k]; 
                }
                if(count > Max){
                    Max=count;
                }
            }
        }
        return Max;
    }
    public static void main(String args[]){
        int nums[] = {1,-2,6,-1,3};
        int result = MaxE(nums);
        System.out.println(result);
    }
    
}
