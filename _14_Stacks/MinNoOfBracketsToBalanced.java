package _14_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinNoOfBracketsToBalanced {
    static int no_Brackets(String s){
        java.util.Stack<Character> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                ans++;
            } else { // ')'
                if(st.size()==0) ans++;
                if(st.peek()=='(') {
                    st.pop();
                    ans--;
                }
            }
        }
        if(st.size()==0) return 0;
        else return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(no_Brackets(str));
    }
}
