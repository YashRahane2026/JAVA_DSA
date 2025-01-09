package _11_Recursion;

import java.util.Scanner;

//Generate Binary String without consecutive 1's
public class GenerateBString {
    static void generate(String ans,int n,int i){
        if(n==ans.length()) {
            System.out.println(ans);
            return;
        }
        generate(ans+"0",n,i+1);
        if(i==0) generate(ans+"1",n,i+1);
        if(i>0 && ans.charAt(i-1) != '1') generate(ans+"1",n,i+1);
    } // By Fully me
    static void printString(String s,int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printString(s+"0",n);
            printString(s+"1",n);
        } else {
            printString(s+"0",n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        //generate("",n,0);
        printString("",n);
    }
}
