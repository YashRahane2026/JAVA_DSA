package _2_Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        //1,2,4,8,16,32,..
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a*=2;
        }
    }
}
