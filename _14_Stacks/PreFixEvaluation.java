package _14_Stacks;

import java.util.Stack;

public class PreFixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            } else {
                int v1 = st.pop();
                int v2 = st.pop();
                if(ch=='+') st.push(v1+v2);
                else if(ch=='-') st.push(v1-v2);
                else if(ch=='*') st.push(v1*v2);
                else if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.println(st);
    }
}
