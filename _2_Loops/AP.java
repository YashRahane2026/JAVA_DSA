package _2_Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        //1,3,5,7,9,.....
        //an = a+(n-1)d
        //an = 1+(n2-2)
        //an = 2n-1
        Scanner sc = new Scanner(System.in);
        System.out.print("Give:");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i+=2) {
            System.out.println(i);
        }
    }
}

//Q2)4,7,10,13,16
//an = 4+(n-1)3
//an = 3n+1
