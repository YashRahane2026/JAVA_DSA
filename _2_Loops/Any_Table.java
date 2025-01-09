package _2_Loops;

import java.util.Scanner;

public class Any_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me Number I  will give you Table of that Number :");
        int x = sc.nextInt();
        int n = x*10;
        for (int i = x; i <= n; i+=x) {
            System.out.println(i);
        }
    }
}
