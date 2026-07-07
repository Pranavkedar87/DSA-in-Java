package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MonotonicArrayListTypeTwo {
    public static Boolean isMonotonic(List<Integer> nums){
        int inc = 0;
        int dec = 0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) >= nums.get(i+1)){
                inc++;
            }if(nums.get(i) <= nums.get(i+1)){
                dec++;
            }
        }
        if(inc == nums.size()-1 || dec == nums.size()-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
         nums.add(2);
          nums.add(2);
           nums.add(3);
        System.out.println(isMonotonic(nums));
    }
}
