// Linear Search Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
public class FindFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                    start = i;
                    end = i;
                for(int j=start+1;j<nums.length;j++){
                    if(target == nums[j]){
                            end = j;
                    }
                }
                break;
            }
        }
        result[0] = start;
        result[1] = end;
        return result;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3};
        int target = 3;
        int result[] = searchRange(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");

    }
}

