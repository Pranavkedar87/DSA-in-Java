package Stack;

import java.util.Stack;

public class NextGreaterElementTwoOptimal {
    public static int[] nextGreaterElements(int[] nums){
        int ans[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums.length;i++){
            //System.out.print(res[i]+" ");
            ans[i] = -1;
        }
        for(int i=(2*nums.length)-1;i>=0;i--){
            while(s.size() > 0 && nums[s.peek()] <= nums[i%nums.length]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i%nums.length] = -1;
            }else{
                ans[i%nums.length] = nums[s.peek()];
            }
            s.push(i%nums.length);
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,3};
        int res[] = nextGreaterElements(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
