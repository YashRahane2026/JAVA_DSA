package _14_Stacks;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        if(arr[0]!=arr[1]) st.push(arr[0]);
        for(int i=1;i<n-1;i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]) st.push(arr[i]);
        }
        if(arr[n-2]!=arr[n-1]) st.push(arr[n-1]);
        int[] ans = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res = remove(arr);
        System.out.println(Arrays.toString(res));
    }
}
