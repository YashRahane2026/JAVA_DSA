package _10_BinarySearch;

public class MinimizedMaximumOfProd {
    static boolean isPossible(int mid, int[] arr, int x){
        int store_req = 0;//Units
        for(int i=0;i<arr.length;i++){
            if(arr[i]%mid==0) store_req += arr[i]/mid;
            else store_req += arr[i]/mid + 1;
        }
        if(store_req<=x) return true;
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {15,10,10}; // I/P -> quantities[i]
        int x = 7; // I/P -> No of Stores

        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }

        int lo = 1,hi = mx;
        int minAns = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(mid,arr,x)){
                hi = mid-1;
                minAns = Math.min(minAns,mid);
            } else {
                lo = mid+1;
            }
        }
        System.out.println(minAns);
    }
}
