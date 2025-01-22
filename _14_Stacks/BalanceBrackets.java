package _14_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
    static boolean checkBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            } else { // ')'
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkBrackets(str));
    }
}
// O/P ->
//  (())()()()()()(((())))
//  true
