package _3_Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class NumbeBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();

        for (int i = 1; i <= n+(n-1) ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <= n-1 ; i++) {
            int a = 1;
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(a+++" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" "+" ");
                a++;
            }
            for (int j = 1 ; j <= n-i; j++) {
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}
