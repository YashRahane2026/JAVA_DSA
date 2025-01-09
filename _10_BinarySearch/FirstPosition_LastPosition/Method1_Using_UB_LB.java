package _10_BinarySearch.FirstPosition_LastPosition;
import java.util.Arrays;
public class Method1_Using_UB_LB {
    static int[] ans(int[] arr,int target){
        int n = arr.length;
        int[] ans = {-1,-1};
        int lo = 0,hi = n-1;
        boolean flag = false;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]==target){
                flag = true;
                break;
            } else if (arr[mid]>target) hi = mid+1;
            else if (arr[mid]<target) lo = mid-1;
        }
        if (flag==false){
            return ans;
        } else {
            lo = 0;hi = n-1;
            int lb = n;
            while (lo<=hi){
                int mid = lo + (hi-lo)/2;
                if (arr[mid]>=target){
                    lb = Math.min(mid,lb);
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            }
            ans[0] = lb;
            lo = 0;hi = n-1;
            int ub = n;
            while (lo<=hi){
                int mid = lo + (hi-lo)/2;
                if (arr[mid]>target){
                    ub = Math.min(mid, ub);
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            }
            ans[1] = ub-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20,30,30,50,60,70};//[2,6]
        int[] answer = ans(arr,20);
        System.out.println(Arrays.toString(answer));
    }
}