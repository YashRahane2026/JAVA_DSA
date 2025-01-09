package _10_BinarySearch.SearchInRotatedSortedArr;

public class Method1_OnlyMe {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 2;
        int ans = 0;
        int n = arr.length;
        int i = 0,j = 0;
        int pivot = 0;
        while(i<=j){
            if(arr[j]<arr[j+1]){
                i=j;
                j++;
            } else {
                pivot = j;
                break;
            }
        }
        int lo = 0,hi = pivot;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) {
                ans = mid;
                break;
            }
            else if(arr[mid]>target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
        }
        lo = pivot+1;hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) {
                ans = mid;
                break;
            }
            else if(arr[mid]>target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
        }
        System.out.println(ans);
    }
}
