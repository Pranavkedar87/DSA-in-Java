package ArrayList;
import java.util.*;

public class printListInReverseOrder {
    public static void main(String args[]){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        for(int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }
    }
}
