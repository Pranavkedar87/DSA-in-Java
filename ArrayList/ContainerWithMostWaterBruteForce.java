package ArrayList;
import java.util.*;
public class ContainerWithMostWaterBruteForce {
    public static int mostWater(List<Integer> nums){
        int maxwater = 0;
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                int min = Math.min(nums.get(i),nums.get(j));
                int water = min * (j - i);
                maxwater = Math.max(water,maxwater);
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
        System.out.println('c'-'a');
        System.out.println(mostWater(nums));
    }
}
