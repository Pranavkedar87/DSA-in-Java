public class mergeSort {
    public static void sort(int nums[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        sort(nums,si,mid);
        sort(nums,mid+1,ei);

        merge(nums,si,ei,mid);
    }
    public static void merge(int nums[],int si,int ei,int mid){
        int temp[] = new int[ei - si + 1];
        int i = si; //idx for 1st sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0; //idx for temp 
        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        //for leftover part of 1st sorted part 
        while(i <= mid){
            temp[k++] = nums[i++];
        }
         //for leftover part of 2st sorted part 
         while(j <= ei){
            temp[k++] = nums[j++];
        }
        //copy the temp into original array 
        for(k=0 , i=si;k<temp.length;k++,i++){
        nums[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int nums[] = {4,2,4,8,1};
                for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        sort(nums, 0, nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
