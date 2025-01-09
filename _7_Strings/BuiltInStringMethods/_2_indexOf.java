package _7_Strings.BuiltInStringMethods;

public class _2_indexOf {
    public static void main(String[] args) {
        String s = "Yash rahane";
        System.out.println(s.indexOf('Y'));
        System.out.println(s.indexOf('a'));//First Index
        System.out.println(s.lastIndexOf('a'));//Last Index
        //if any element not exists then -1 will be the o/p
        System.out.println(s.indexOf('z'));
    }
}
