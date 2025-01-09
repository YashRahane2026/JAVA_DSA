package _10_BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int x = 30;
        int lo = 0,hi = arr.length-1;
        int ub = arr.length;
        if (x<arr[0]) ub = 0;
        else if (x>arr[hi]) ub = hi;
        else {
            while (lo<=hi){
                int mid = lo + (hi-lo)/2;
                if (arr[mid]>x) {// Here is the only Change >= to >
                    ub = Math.min(ub,mid);
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            }
        }
        System.out.println(ub);
    }
}
