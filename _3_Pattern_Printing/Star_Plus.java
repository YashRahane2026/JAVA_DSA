package _3_Pattern_Printing;

import java.util.Scanner;

public class Star_Plus {
    public static void main(String[] args) {
        //for n = Odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        int mid = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==mid || i==mid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
