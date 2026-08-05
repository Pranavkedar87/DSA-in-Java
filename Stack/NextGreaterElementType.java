package Stack;
import java.util.*;
public class NextGreaterElementType {
    public static int[] elemnt(int[] nums1, int[] nums2){
        Stack<Integer> s = new Stack<>(); 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(s.size()>0 && nums2[i] >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i],-1); 
            }else{
                map.put(nums2[i],s.peek()); 
            }
            s.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    public static void main(String args[]){
        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};
        int result[] = elemnt(nums1, nums2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
