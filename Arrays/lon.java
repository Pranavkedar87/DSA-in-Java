public class lon {
    public static int longno(int nums[]){
        int i = 0;
        int j = i+1;
        int count = 0;
        int max = 0;
        while(i != nums.length-1 && j != nums.length){
            if((nums[i] & nums[j]) == 0){
                System.out.println(i);
                System.out.println(j+"j value");
                max = Math.max(max,j-i);
                j++;
                count++;
            }
            else{
                System.out.println("else body "+i);
                i++;
                j++;
                count = 0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int nums[] = {1,3,8,48,10};
        System.out.println(longno(nums)+"out");
    }
}
