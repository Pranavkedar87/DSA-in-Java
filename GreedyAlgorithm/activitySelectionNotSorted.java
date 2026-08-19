package GreedyAlgorithm;

import java.util.ArrayList;

public class activitySelectionNotSorted {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        max = 0;
        ans.add(0);
        int last = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i] >= last){
                ans.add(i);
                last = end[i];
                max++;
            }
        }
        System.out.println("The maximum work "+max);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
