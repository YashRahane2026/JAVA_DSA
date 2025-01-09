package _10_BinarySearch.FirstPosition_LastPosition;

public class Method2_moreGood {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20,30,30,50,60,70};
        int n = arr.length;
        int x = 20;

        int lo = 0,hi = n-1;
        int fp = 0;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]==x){
                if (mid>0 && arr[mid]==arr[mid-1]) hi = mid-1;
                else {
                    fp = mid;break;
                }
            } else if (arr[mid]>x) hi = mid-1;
            else if (arr[mid]<x) lo = mid+1;
        }
        System.out.println(fp);
        lo = 0;hi = n-1;
        int lp = 0;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]==x){
                if (mid+1<n && arr[mid]==arr[mid+1]) lo = mid+1;
                else {
                    lp = mid;break;
                }
            }else if (arr[mid]>x) hi = mid-1;
            else if (arr[mid]<x) lo = mid+1;
        }
        System.out.println(lp);
    }
}
