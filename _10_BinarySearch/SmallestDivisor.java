package _10_BinarySearch;

public class SmallestDivisor {
    static boolean isLess(int mid,int[] arr,int t){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%mid==0) sum += arr[i]/mid;
            else sum += arr[i]/mid + 1;
        }
        if(sum<=t) return true;
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,9,2};
        int t = 6;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int lo = 1,hi = max;
        int small_d = Integer.MAX_VALUE;
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            //now real Binary starts
            if(isLess(mid,arr,t)){
                hi = mid-1;
                small_d = Math.min(small_d,mid);
            } else {
                lo = mid+1;
            }
        }
        System.out.println(small_d);
    }
}
// code after max value using linear
// TLE -> in LeetCode
//....O()
//        int d = 0;
//        int small_d = Integer.MAX_VALUE;
//        for (d=1;d<=max;d++){
//            int sum = 0;
//            for(int i=0;i<n;i++){
//                if (arr[i]%d==0) sum += arr[i]/d;
//                else sum += arr[i]/d + 1;
//            }
//            if (sum<=t){
//                small_d = Math.min(small_d,d);
//            }
//        }
//        System.out.println(small_d);

