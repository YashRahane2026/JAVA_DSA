package _10_BinarySearch;

import java.util.*;

public class K_Closest_Elements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = 3;
        int k = 3;

        int n = arr.length;
        int lo = 0,hi = n-1;
        int lb = n;
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (arr[mid]>=x){
                lb = Math.min(mid,lb);
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (x<arr[0]){
            for (int i=0;i<k;i++) {
                ans.add(arr[i]);
            }
        }
        if (x>arr[n-1]){
            for (int i=n-1;i>=n-k;i--) {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
        }
        int i = lb-1,j = lb;
        while (k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if (di<=dj){ // if di==dj then add di(Smallest)
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        // if still k is greater than 0
        while (i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while (j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }
}