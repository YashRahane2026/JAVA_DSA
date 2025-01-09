package _6_MultiDimensionalArrays;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Store roll no & marks side by side of 4 Students
//        1 33
//        2 53
//        3 83
//        4 43
        int[][] arr = new int[4][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] ele : arr){
            for (int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
