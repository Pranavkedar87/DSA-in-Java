package ArrayList;
import java.util.*;
import Recursion.sumOfN_NaturalNo;

public class MonotonicArrayListTypeOne {
    public static Boolean isMonotonic(List<Integer> nums){
        int ans = 0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) >= nums.get(i+1)){
                ans++;
            }
        }
        if(ans == nums.size()-1){
            return true;
        }else{
            ans = 0;
        }
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) <= nums.get(i+1)){
                ans++;
            }
        }
        if(ans == nums.size()-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
         nums.add(5);
          nums.add(2);
           nums.add(3);
        System.out.println(isMonotonic(nums));
        
    }
}
