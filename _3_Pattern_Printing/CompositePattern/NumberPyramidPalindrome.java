package _3_Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();

        for (int i = 1; i <= n  ; i++) {//Rows
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
