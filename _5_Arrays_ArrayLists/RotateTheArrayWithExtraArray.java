package _5_Arrays_ArrayLists;
import java.util.Arrays;
public class RotateTheArrayWithExtraArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        int k = 2;
        k = k % n;
        int[] ans = new int[arr.length];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[n-k+i];
        }
        for (int i = k; i < n; i++) {
            ans[i] = arr[i-k];
        }
        System.out.println(Arrays.toString(ans));
    }
}
