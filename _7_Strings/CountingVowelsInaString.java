package _7_Strings;

public class CountingVowelsInaString {
    public static void main(String[] args) {
        String s = "Yash Rahane";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
                    s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'U' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
