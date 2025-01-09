package _5_Arrays_ArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArray {
    static void reverse(int[] nums,int i,int j){
        while (i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give k :");
        int k = sc.nextInt();
        k = k%n;
        System.out.println(Arrays.toString(arr));

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
