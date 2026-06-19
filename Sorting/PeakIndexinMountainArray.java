public class PeakIndexinMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length-1;
       while(start <= end){
        int mid = (start+end)/2;
        if(arr[mid] > arr[mid+1] && arr[mid-1] < arr[mid]){
            return mid;
        }else if(arr[mid] < arr[mid+1]){
            start = mid+1;
        }else{
            end = mid-1;
        }
       } 
       return -1;
    }
    public static void main(String args[]){
        int arr[] = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
