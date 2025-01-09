package _5_Arrays_ArrayLists;

import java.util.Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] a) {
        a[3] = 45678;
    }
}

//But Here Code Will not Work(Only Pass By Value)

//public static void main(String[] args) {
//    int x = 5;
//    System.out.println(x);   O/P=>5
//    change(x);
//    System.out.println(x);   O/P=>5
//}
//
//public static void change(int a) {
//    a = 45678;
//}