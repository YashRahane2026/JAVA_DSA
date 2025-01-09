package _3_Pattern_Printing;

import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) { //rows
            for (int j = 1; j <= n; j++) { //cols
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
