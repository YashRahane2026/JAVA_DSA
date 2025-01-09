package _8_Stringbuilders;

public class PassingStringtoMethods {
    static void change(String s){
        s = "Raghav Garg";
    }
    public static void main(String[] args) {
        String s = "Yash Rahane";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
//No change because Strings are Pass by Value
//Not pass by Reference
