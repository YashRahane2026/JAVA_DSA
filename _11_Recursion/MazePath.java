package _11_Recursion;

import java.util.Scanner;

public class MazePath {
    static int ways(int m,int n){
        if(m==1 || n==1) return 1;
        return ways(m-1,n) + ways(m,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(ways(m,n));
    }
}
