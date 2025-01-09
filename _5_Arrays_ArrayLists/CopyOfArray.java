package _5_Arrays_ArrayLists;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] brr = arr;   //Shallow Copy
        brr[0] = 50;
        System.out.println("Shallow Copy :"+arr[0]);

        //Deep Copy Method 1
        int[] crr = Arrays.copyOf(arr,arr.length);
        crr[0] = 55;
        System.out.println("Deep Copy :"+arr[0]);

        //Deep Copy Method 2
        int[] drr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            drr[i] = arr[i];
        }
        drr[0] = 55;
        System.out.println("Deep Copy :"+arr[0]);
    }
}
