package _2_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        long n = sc.nextInt();
        long f = 1;
        for (long i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
