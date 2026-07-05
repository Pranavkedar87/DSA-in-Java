package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class pairSumOneBruteForce {
     public static boolean mostWater(List<Integer> nums,int target){
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) == target){
                    return true;
                }
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
        int target = 500;
        System.out.println(mostWater(nums,target));
    }
}
