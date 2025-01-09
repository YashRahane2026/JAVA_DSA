package _30_CP;

public class SubArrayMax {
    public static void main(String[] args) {
        int[] arr = {2,3,-6,1,2,3,-4,5,-10,6};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        //O(n*n)
        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            for (int end = start; end < n; end++) {
                currentSum += arr[end];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
