package _11_Recursion;

import java.util.Scanner;

public class GCD_HCF_Rec {
    static int hcf(int a,int b){
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 45;
    } // TC -> O(min(a,b))
    static int gcd(int a,int b){
        if(b%a==0) return a;
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a,b)); // Normal LOOP
        System.out.println(gcd(a,b)); // Rec
    }
}
