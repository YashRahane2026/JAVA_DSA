package _3_Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class StarPyramidnstnsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();

        int nst = 1,nsp = n-1;
        for (int i = 1; i <= n  ; i++) {//Rows
            for (int j = 1; j <= nsp ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= nst ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}
