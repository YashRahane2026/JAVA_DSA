package _11_Recursion;

import java.util.Scanner;

public class Power {
    static int pow(int a,int b){ // O(b)
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    static int powLog(int a,int b){ // O(log b)
        if(b==0) return 1;
        int ans = powLog(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==0 || b==0){
            System.out.println("Not Defined");
        } else {
            System.out.println(powLog(a,b));
        }
    }
}
