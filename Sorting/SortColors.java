public class SortColors {
    public static void sortcolor(int nums[]){
        int count[] = new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        } 
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {2,0,2,1,1,0};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        sortcolor(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}
