package _5_Arrays_ArrayLists;

import java.util.Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,60,2,49,16,28,21};
        int[] ans = new int[arr.length];

//        for (int i = 0; i < arr.length; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i+1; j < ans.length; j++) {
//                if (arr[j] > max){
//                    max = arr[j];
//                }
//            }
//            if (max == Integer.MIN_VALUE ){
//                ans[i] = -1;
//            } else {
//                ans[i] = max;
//            }
//        }

        // Method 1 : Brute Force
//        ans[ans.length-1] = -1;
//        for (int i = 0; i < arr.length-1; i++) {
//            int mx = Integer.MIN_VALUE;
//            for (int j = i+1; j < arr.length ; j++) {
//                mx = Math.max(mx,arr[j]);
//            }
//            ans[i] = mx;
//        }

        int n = ans.length;
        //Method 2 : More Good
        ans[n-1] = -1;
        int currentGreatest = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            ans[i] = currentGreatest;
            currentGreatest = Math.max(currentGreatest,arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
