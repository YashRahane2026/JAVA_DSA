package _30_CP.Contests;

import java.util.*;
import java.lang.*;

public class Contest1 {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        if (A==B){
            System.out.println(ans);
        }
        while(A!=B){
            int now = 0;
            if (A<B){
                if(B%2==0) {
                    now = B/2;
                    ans += B/2;
                    B -= now;
                } else {
                    now = (B/2)+1;
                    ans += (B/2)+1;
                    B -= now;
                }
            } else if(A>B) {
                if(A%2==0) {
                    now = A/2;
                    ans += A/2;
                    A -= now;
                } else {
                    now = (A/2)+1;
                    ans += (A/2)+1;
                    A -= now;
                }
            }
            if(A==B){
                System.out.println(ans);
                break;
            }
        }
    }
}
