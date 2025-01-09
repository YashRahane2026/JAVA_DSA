package _8_Stringbuilders;

import java.util.Scanner;

public class Input_setCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me any String :");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        //Raghav
        //sb.charAt(2) = 'a'; //Not Allowed //Error
        sb.setCharAt(0,'M');
        sb.setCharAt(2,'d');
        System.out.println(sb);
    }
}
