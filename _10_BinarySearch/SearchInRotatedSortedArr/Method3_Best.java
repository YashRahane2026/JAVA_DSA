package _10_BinarySearch.SearchInRotatedSortedArr;

public class Method3_Best {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 2;
        int n = arr.length;
        int ans = 0;
        int lo = 0,hi = n-1;
        while (lo<=hi){
            int m = lo + (hi-lo)/2;
            if (arr[m]==target){
                ans = m;
                break;
            }
            else if (arr[m]<=arr[hi]) { // i am in right sorted part (m to hi)
                if (arr[m]<=target && target<=arr[hi]) lo = m+1;
                else hi = lo-1;
            } else { // i am in left sorted part (lo to mid)
                if (arr[lo]<=target && target<=arr[m]) hi = m-1;
                else lo = m+1;
            }
        }
        System.out.println(ans);
    }
}
