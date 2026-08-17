package Queue;
import java.util.*;
public class timeNeededToBuyTickets {
    public static int calTime(int[] tickets,int k){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int sec =0;
        while(true){
            if(tickets[k] == 0){
                break;
            }else if(tickets[q.peek()] != 0){
                int temp = q.remove();
                tickets[temp]--;
                if(tickets[temp] != 0){
                    q.add(temp);
                }
                sec++;
            }
            if(q.isEmpty()){
                break;
            }
        }
        return sec;
    }
    public static void main(String args[]){
        int tickets[] = {2,3,2};
        System.out.println(calTime(tickets, 2));
    }
}
