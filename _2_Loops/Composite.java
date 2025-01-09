package _2_Loops;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();
        for (int i = 1; i < n-1; i++) {
            if (n%i == 0){
                System.out.println("Composite");
                break;
            } else {
                System.out.println("it should be Prime");
            }
        }
    }
}
