package _14_Stacks;

import java.util.Stack;

public class PushAtBottom {
    public static Stack<Integer> pushAtBottomRec(Stack<Integer> st,int x){
        int n = st.pop();
        if(st.size()==0) st.push(x);
        else pushAtBottomRec(st,x);
        st.push(n);
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(pushAtBottomRec(st,22));
    }
}
