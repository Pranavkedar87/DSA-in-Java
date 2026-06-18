import Recursion.findFirstOccurance;

public class FindMissingandRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                min = Math.min(min,grid[i][j]);
                max = Math.max(max,grid[i][j]);
            }
        }
        int count[] = new int[max - min + 1];
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                count[grid[i][j] - min]++;
            }
        }
        int ans[] = new int[2]; 
        for(int i=0;i<count.length;i++){
            if(count[i] == 0){
                ans[1] = i+min;
            }
            if(count[i] == 2){
                ans[0] = i+min;
            }
        }
        if(ans[1] == 0){
            if(min > 1){
                ans[1] = min-1;
            }else{
                 ans[1] = max+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};
        int ans[] = findMissingAndRepeatedValues(grid);
        System.out.println("["+ans[0]+" "+ans[1]+"]");
    }
}
