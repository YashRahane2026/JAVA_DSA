package _1_Conditionals;

import java.util.Scanner;

public class Quadrant_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1 :");
        int a = sc.nextInt();
        System.out.print("Enter Side 2 :");
        int b = sc.nextInt();
        if (a>0 && b>0){
            System.out.println("First Q");
        } else if (a<0 && b>0) {
            System.out.println("Second Q");
        } else if (a<0 && b<0) {
            System.out.println("Third Q");
        } else if (a>0 && b<0) {
            System.out.println("Fourth Q");
        } else if (a==0 && (b<0 || b>0)){
            System.out.println("on Y axis");
        } else if (a==0 && b==0) {
            System.out.println("Origin");
        } else {
            System.out.println("on X axis");
        }
    }
}
