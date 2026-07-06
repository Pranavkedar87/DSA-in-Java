package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class pairSumInRotatedArrayBruteForce {
     public static boolean findpair(List<Integer> nums,int target){
        int start = 0,end = 0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) > nums.get(i+1)){
                start = i+1;
                end = i;   
            }
        }
        while(start != end){
            if(nums.get(start) + nums.get(end) == target){
                return true;
            }else if(nums.get(start) + nums.get(end) < target){
                start = (start+1)%nums.size();
            }else{
                end = (nums.size()+end-1)%nums.size();
            }

        }
        return false;
    }
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(15);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(10); 
        int target = 169;
        System.out.println(findpair(nums,target));
    }
}
