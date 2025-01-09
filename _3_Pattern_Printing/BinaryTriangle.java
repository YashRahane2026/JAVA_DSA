package _3_Pattern_Printing;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {//rows
            for (int j = 0; j <= i; j++) {//cols
                if (i%2 == 1){
                    if (j%2 == 1) System.out.print(1+" ");
                    else System.out.print(0+" ");
                } else {
                    if (j%2 == 0) System.out.print(1+" ");
                    else System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
