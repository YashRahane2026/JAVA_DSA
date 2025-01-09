package _11_Recursion;

import java.util.Scanner;

public class NthStairPath {
    static int ways(int n){
        if(n<=2) return n;
        return ways(n-1) + ways(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(ways(n));
    }
}
//Me ->

// if(n==0) return 0;
// if(n==2 || n==1) return n;
