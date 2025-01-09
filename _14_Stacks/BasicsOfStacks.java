package _14_Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        while(st.size()>3){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
