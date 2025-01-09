package _7_Strings.BuiltInStringMethods;

public class _6_LowerUpperCase {
    public static void main(String[] args) {
        String s = "Yash Devidas Rahane";
        //s.toLowerCase(); --> Nothing will happen
        System.out.println(s.toLowerCase());//OR//
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());
    }
}
