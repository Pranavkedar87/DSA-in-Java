package Stack;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottomInStack(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAtBottomInStack(s, val);
        s.push(top);
    }
    public static void rev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        rev(s);
        pushAtBottomInStack(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
          
        rev(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
