package _14_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] ans = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);  
        ans[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
//Method 1 ~ n^2

//for(int i=0;i<n;i++){
//    ans[i] = -1;
//    for(int j=i+1;j<n;j++){
//        if(arr[i]<arr[j]) {
//            ans[i] = arr[j];
//            break;
//        }
//    }
//}