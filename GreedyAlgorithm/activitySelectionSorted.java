package GreedyAlgorithm;

import java.util.*;
import java.util.Comparator;

public class activitySelectionSorted {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int activity[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        Arrays.sort(activity , Comparator.comparingDouble(o -> o[2]));

        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        max = 1;
        ans.add(activity[0][0]);
        int last = activity[0][2];
        for(int i=1;i<end.length;i++){
            if(activity[i][1] >= last){
                ans.add(activity[i][0]);
                last = activity[i][2];
                max++;
            }
        }
        System.out.println("The maximum work "+max);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
