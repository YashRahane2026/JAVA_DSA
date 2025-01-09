package _11_Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static List<String> ans = new ArrayList<>();
    static void genParentheses(int n,String s,int open,int close){
        if(n*2==s.length()){
            ans.add(s);
            return;
        }
        if(open<n) genParentheses(n,s+"(",open+1,close);
        if(open>close) genParentheses(n,s+")",open,close+1);
    }
    public static void main(String[] args) {
        genParentheses(3,"",0,0);
        System.out.println(ans);
    }
}
