package _10_BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int x = 25;
        int lo = 0,hi = arr.length-1;
        int lb = arr.length;
        if (x<arr[0]) lb = 0;
        else if (x>arr[hi]) lb = hi;
        else {
            while (lo<=hi){
                int mid = lo + (hi-lo)/2;
                if (arr[mid]>=x) {
                    lb = Math.min(lb,mid);
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            }
        }
        System.out.println(lb);
    }
}
