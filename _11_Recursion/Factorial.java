package _11_Recursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n==1 || n==0) return 1; // Base Case
        return n * fact(n-1); // Call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Your Answer is "+fact(n));
    }
}
