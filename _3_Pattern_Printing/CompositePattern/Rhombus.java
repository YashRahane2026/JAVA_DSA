package _3_Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();

        for (int i = 1; i <= n  ; i++) {//Rows
            for (int j = 1; j <= n-i ; j++) {//Spaces
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= n; j++) {//Stars
                System.out.print((char)( j+64)+" ");
            }
            System.out.println();
        }
    }
}
