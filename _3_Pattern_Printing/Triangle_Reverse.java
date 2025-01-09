package _3_Pattern_Printing;

import java.util.Scanner;

public class Triangle_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//i=1 -> j=1 to 5
//i=2 -> j=1 to 4
//i=3 -> j=1 to 3
//i=4 -> j=1 to 2
//i=5 -> j=1 to 1

//#// i+Jmax = n+1
//#// Jmax = n+1-i
