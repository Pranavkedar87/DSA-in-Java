package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class pairSumOneObtimal {
     public static boolean pairSum(List<Integer> nums,int target){
        int i = 0;
        int j = nums.size()-1;
        while(i != j){
             if(nums.get(i) + nums.get(j) == target){
                    return true;
            }
            if(nums.get(i) + nums.get(j) < target){
                    i++;
            }else{
                    j--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9); 
        int target = 5;
        System.out.println(pairSum(nums,target));
    }
}
