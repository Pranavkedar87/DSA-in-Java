package Stack;

import java.util.Stack;

public class pushAtBottomInStack {
    public static void pushAt(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAt(s,val);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAt(s, 4);
         pushAt(s, 5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
