package _6_MultiDimensionalArrays;

public class TargetElementTorF {
    public static void main(String[] args) {
        // Don't use 💩 method 1
        //Best Method
        boolean ans = false;
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m = arr.length,n = arr[0].length;
        int target = 20;
        int i = m-1,j = 0;
        while (i>=0 && j<n){
            if (arr[i][j] == target) {
                ans = true;
                break;
            } else if (arr[i][j]>target) {
                i--;
            } else {
                j++;
            }
        }
        System.out.println(ans);
    }
}
