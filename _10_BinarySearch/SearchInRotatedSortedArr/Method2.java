package _10_BinarySearch.SearchInRotatedSortedArr;

public class Method2 {
    static int bs(int[] arr,int lo,int hi,int target){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
        }
        return -1;
    }
    static int search(int[] arr, int target) {
        int n = arr.length;
        if(n<=2){
            for(int i=0;i<n;i++){
                if(arr[i]==target) return i;
            }
        }
        //Now Find pivot
        int lo = 1,hi = n-2;
        int p = -1; //pivot
        while(lo<=hi){
            int m = lo + (hi-lo)/2; //mid
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                p = m;
                break;
            } else if (arr[m]<arr[m-1] && arr[m]<arr[m+1]){
                p = m-1;
                break;
            } else if (arr[m]>arr[m-1] && arr[m]<arr[m+1]){
                if(arr[m]>arr[n-1]) lo = m-1;
                else hi = m+1;
            }
        }
        if(p==-1){
            return bs(arr,0,n-1,target);
        }
        int left = bs(arr,0,p,target);
        if(left!=-1) return left;
        int right = bs(arr,p+1,n-1,target);
        return right;
    }
    public static void main(String[] args) {
        int[] arr = {3,4};
        int target = 4;
        System.out.println(search(arr,target));
    }
}
