package _2_Loops;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        int x = 0;
        int r = 0;
        while (n!=0){
            x = n%10;
            r *= 10;
            r += x;
            n = n/10;
        }
        System.out.println(r);
    }
}
