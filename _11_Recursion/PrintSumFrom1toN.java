package _11_Recursion;

import java.util.Scanner;

public class PrintSumFrom1toN {
    static int sum(int n){
        if(n<1) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
