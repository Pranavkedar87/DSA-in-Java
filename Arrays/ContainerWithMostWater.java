public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0, start = 0, end = height.length-1;
        while(start < end){
            int water = (end - start) * (Math.min(height[start],height[end]));
            max = Math.max(water,max);
            if(Math.min(height[start],height[end]) == height[start]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
