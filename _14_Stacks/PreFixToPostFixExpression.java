package _14_Stacks;

import java.util.Stack;

public class PreFixToPostFixExpression {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String t = ""+ch;
                st.push(t);
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                String o = ""+ch;
                st.push(v1+v2+o);
            }
        }
        System.out.println(st);
    }
}
