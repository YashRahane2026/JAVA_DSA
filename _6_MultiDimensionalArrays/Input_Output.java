package _6_MultiDimensionalArrays;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //Output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //Output For each loop
        for (int[] ele : arr){
            for (int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
