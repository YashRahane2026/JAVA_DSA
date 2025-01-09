package _12_AdvancedSorting.Quick;

public class KthSmallestElement {
    static int ans;
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr,int lo,int hi){
        //Step 1 -> Pivot
        int mid = (lo+hi)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCount = 0;
        for(int i=lo;i<=hi;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        swap(arr,pivotIdx,correctIdx);
        //Step 2 -> Partition
        int i = lo,j = hi;
        while (i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }
    static void quickSelect(int[] arr, int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans = arr[lo];
            return;
        } // not really Req.
        int idx = partition(arr,lo,hi);
        if(idx==k-1){
            ans = arr[idx];
            return;
        }
        if(k-1<idx) quickSelect(arr,lo,idx-1,k);
        else quickSelect(arr,idx+1,hi,k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        int k = 2;
        ans = -1;
        quickSelect(arr,0,n-1,n-k+1); // For Smallest k
        System.out.println(ans);
        print(arr);
    }
}
