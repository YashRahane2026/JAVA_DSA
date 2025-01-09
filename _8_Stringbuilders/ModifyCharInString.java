package _8_Stringbuilders;

public class ModifyCharInString {
    public static void main(String[] args) {
        String s = "Hello";
        //Heylo
        //Change 2nd index to y
        s = s.substring(0,2) + 'y' +s.substring(3);
        System.out.println(s);
    }
}
