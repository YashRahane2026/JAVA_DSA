package _3_Pattern_Printing;

import java.util.Scanner;

public class ABCD_Using_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { //Rows
            for (int j = 1; j <= n; j++) { //Cols
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
