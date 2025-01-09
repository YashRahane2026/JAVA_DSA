package _2_Loops;

import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        int i = 0;
        while (n!=0){
            n = n/10;
            i++;
        }
        System.out.println(i);
    }
}
