package _1_Conditionals;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram Age :");
        int r = sc.nextInt();
        System.out.print("Enter Shyam Age :");
        int s = sc.nextInt();
        System.out.print("Enter Ajay Age :");
        int a = sc.nextInt();
        if (r<s){
            if (r<a){
                System.out.println("Ram");
            } else {
                System.out.println("Ajay");
            }
        } else {
            if (s<a){
                System.out.println("Shyam");
            } else {
                System.out.println("Ajay");
            }
        }
    }
}
