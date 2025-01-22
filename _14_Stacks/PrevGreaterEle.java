package _14_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class PrevGreaterEle {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] ans = new int[arr.length];
        int n = arr.length;
        java.util.Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        ans[0] = -1;
        for(int i=1;i<n;i++){
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        System.out.println(st);
        System.out.println(Arrays.toString(ans));
    }
}
