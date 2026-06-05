public class print_subArray {
    public static void main(String args[]){
        int start,end;
        int nums[] = {2,4,6,8,10};
        for(int i=0;i<nums.length;i++){
            start=i;
            System.out.print("["+nums[i]+"] ");
            for(int j=i+1;j<nums.length;j++){
                end=j;
                System.out.print("[ ");
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.print("] ");
            }System.out.println(" ");
        }
    }
}
