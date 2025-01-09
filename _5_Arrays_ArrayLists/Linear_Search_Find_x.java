package _5_Arrays_ArrayLists;

import java.util.Scanner;

public class Linear_Search_Find_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Array Size:");
        int n = sc.nextInt();

        System.out.println("Give me Array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Give me Value to Find:");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                System.out.println(i);
            }
        }

    }
}
