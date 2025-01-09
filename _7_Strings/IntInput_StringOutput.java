package _7_Strings;

import java.util.Scanner;

public class IntInput_StringOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me any Integer: ");
        int a = sc.nextInt();

        String s = a+"" ;//--> Ans : a+"" <-- therefore String
        System.out.println(s);
    }
}
