package _10_BinarySearch;

public class CapacityOfShip_forDays {
    static boolean isPossibal(int c,int[] arr,int d){
        int load = 0;
        int D = 1;
        for (int i=0;i<arr.length;i++) {
            if (load+arr[i]<=c){
                load += arr[i];
            } else {
                load = arr[i];
                D++;
            }
        }
        if (D<=d) return true;
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4}; //I/P -> Weights arr
        int d = 3;// I/P -> Days

        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
            mx = Math.max(mx,arr[i]);
        }

        int lo = mx,hi = sum;
        int ans = Integer.MAX_VALUE; // Min_Capacity(Load)
        while (lo<=hi){ // TC -> O(n*log(sum-mx))
            int mid = lo+(hi-lo)/2;
            if (isPossibal(mid,arr,d)){
                ans = Math.min(ans,mid);
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        System.out.println(ans);//min capacity
    }
}