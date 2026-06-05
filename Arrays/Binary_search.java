public class Binary_search {
    public static int search(int nums[],int target){
        int start,end;
        start= 0;
        end = nums.length-1;
        while(start < end){
           int mid = (start+end)/ 2;
           if(nums[mid] == target){
            return mid;
           }else if(target > mid){
            start = mid+1;
           }else{
            end = mid-1;
           }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,3,4,55,77,99};
        int target = 2;
        int result = search(nums,target);
        if(result == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("The target number found at index "+result);
        }
    }
}
