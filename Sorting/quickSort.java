public class quickSort {
    public static void sort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partation(arr,si,ei);
        sort(arr,si,pIdx-1); 
        sort(arr,pIdx+1,ei);
    }
    public static int partation(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                int temp = arr[j];
                arr[j] = arr[++i];
                arr[i] = temp;
            }
        }
        arr[ei] = arr[++i];
        arr[i] =  pivot;
        return i;
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
