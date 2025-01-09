package _5_Arrays_ArrayLists;

import java.util.Scanner;

public class Linear_Search_SecMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Array Size:");
        int n = sc.nextInt();

        System.out.println("Give me Array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secmax = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                secmax = temp;
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
