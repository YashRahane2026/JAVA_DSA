package _2_Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        int x = 0;
        for (int i = 2; i < (n-1) ; i++) {
            if (n%i == 0){
                System.out.println("Composite");
                x = 1;
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
        else if (x==0) System.out.println("Prime");
    }
}
