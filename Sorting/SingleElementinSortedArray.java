public class SingleElementinSortedArray {
    public static int singleNonDuplicate(int[] nums) {
       // int ans =0;
       // for(int i=0;i<nums.length;i++){
            //ans ^= nums[i];
       // }
      //  return ans;
      if(nums.length == 1){
        return nums[0];
      }
      int start = 0;
      int end = nums.length-1;
      while(start <= end){
        int mid = (start + end)/2;
        if(mid == 0 && nums[mid] != nums[mid+1]){
            return nums[mid];
        }
        if(mid == nums.length-1 && nums[mid] != nums[mid-1]){
            return nums[mid];
        }
        if(nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]){
            return nums[mid];
        }
        if(mid%2 == 0){
            if(nums[mid-1] == nums[mid]){
            end = mid-1;
        }else {
            start = mid+1;
        }
        }else{
            if(nums[mid-1] == nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
      }
      return -1;
    }
    public static void main(String args[]){
        int nums[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));

    }
}
