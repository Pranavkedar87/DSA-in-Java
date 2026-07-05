package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWaterOptimal {
    public static int mostWater(List<Integer> nums){
        int maxwater = 0;
        int start = 0;
        int end = nums.size()-1;
        while(start < end){
            int min =  Math.min(nums.get(start),nums.get(end));
            int water = min * (end - start);
            maxwater = Math.max(water,maxwater);
            if(Math.min(nums.get(start),nums.get(end)) == nums.get(start)){
                start++;
            }else{
                end--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(8);
        nums.add(6);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(8);
        nums.add(3);
        nums.add(7); 
       // System.out.println('c'-'a');
        System.out.println(mostWater(nums));
    }
}
