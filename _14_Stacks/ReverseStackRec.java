package _14_Stacks;

import java.util.Stack;

public class ReverseStackRec {
    public static void pushAtBottomRec(Stack<Integer> st,int x){
        int n = st.pop();
        if(st.size()==0) st.push(x);
        else pushAtBottomRec(st,x);
        st.push(n);
    }
    public static void reverseRec(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverseRec(st);
        pushAtBottomRec(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverseRec(st);
        System.out.println(st);
    }
}
