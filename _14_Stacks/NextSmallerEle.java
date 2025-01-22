package _14_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerEle {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
        int[] ans = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()>arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
