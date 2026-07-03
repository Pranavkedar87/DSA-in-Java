package ArrayList;
import java.util.*;
public class multiDimensionArrayList {
    public static void main(String args[]){
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
          List<Integer> list3 = new ArrayList<>();
        list1.add(1);
         list1.add(2);
          list1.add(3);
           list1.add(4);
            list1.add(5);
        list2.add(2);
         list2.add(4);
          list2.add(6);
           list2.add(8);
            list2.add(10);
        list3.add(3);
         list3.add(5);
          list3.add(7);
           list3.add(9);
            list3.add(11);
        mainList.add(list1);
         mainList.add(list2);
          mainList.add(list3);
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            List<Integer> curr = mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
