package _8_Stringbuilders;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String s = "yash";
        char[] ch = s.toCharArray();//{'Y','a','s','h'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        // Now with Stringbuilders
        StringBuilder sb = new StringBuilder("yash rahane");
        String b = sb.toString();
        char[] a = b.toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
