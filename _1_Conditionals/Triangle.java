package _1_Conditionals;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1 :");
        int a = sc.nextInt();
        System.out.print("Enter Side 2 :");
        int b = sc.nextInt();
        System.out.print("Enter Side 3 :");
        int c = sc.nextInt();
        if (a+b>c && b+c>a && c+a>b){
            System.out.println("#Triangle");
        } else {
            System.out.println("Not Triangle");
        }
    }
}
