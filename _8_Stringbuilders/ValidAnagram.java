package _8_Stringbuilders;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        // abc bca -> T
        // abc bcaa -> F
        String s = "anagram", t = "nagaram";//True
        //if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean ans = Arrays.equals(a,b);
        //OR//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != b[i]) return false;
//        }
        System.out.println(ans);
    }
}
