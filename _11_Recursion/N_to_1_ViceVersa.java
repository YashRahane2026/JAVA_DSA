package _11_Recursion;

import java.util.Scanner;

public class N_to_1_ViceVersa {
    static void printNto1(int n){
        if(n==0)return;
        System.out.println(n);
        printNto1(n-1);
    }
    static void print1toN(int x,int n){
        if(x>n) return;
        System.out.println(x);
        print1toN(x+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        //printNto1(n);
        print1toN(1,n);
    }
}
