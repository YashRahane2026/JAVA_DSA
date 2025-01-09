package _11_Recursion;

import java.util.Scanner;

public class NthStairPath2 {
    static int ways(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        return ways(n-1) + ways(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(ways(n));
    }
}
