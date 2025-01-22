package _14_Stacks;

import java.util.Stack;

public class InsertAtAnyIdx {
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return; // Base case
        int x = st.pop();
        displayRec(st);
        System.out.print(x+" ");
        st.push(x);
    }
    public static void main(String[] args) {
        int idx = 3;
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRec(st);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while (st.size()>idx){
            rt.push(st.pop());
        }//OR...
        //for(int i=1;i<idx;i++){
        //    rt.push(st.pop());
        //}
        st.push(99);
        while (rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
