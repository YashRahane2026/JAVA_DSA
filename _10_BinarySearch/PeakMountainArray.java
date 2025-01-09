package _10_BinarySearch;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,40,20,4};
        int lo = 1,hi = arr.length-2;
        int ans = 0;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                ans = mid;
                break;
            }
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
            else hi = mid-1;
        }
        System.out.println(ans);
    }
}
