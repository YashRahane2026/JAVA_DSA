package _11_Recursion;

import java.util.Scanner;

public class PrintIncreasing_AfterCall {
    static void print(int n){
        if(n==0) return; // Base Case
        print(n-1);// Call
        System.out.println(n); // Work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        print(n);
    }
}
