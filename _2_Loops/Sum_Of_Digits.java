package _2_Loops;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        int x = 0;
        int sum = 0;
        while (n!=0){
            x = n%10;
            n = n/10;
            sum += x;
        }
        System.out.println(sum);
    }
}
