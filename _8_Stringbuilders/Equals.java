package _8_Stringbuilders;

public class Equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";//a and s both Address same
        String c = new String(s);
        String t = "abc";
        t += "xyz";

        System.out.println(s==a);//True
        System.out.println(s==c);//False
        System.out.println(s==t);//False -> Address in Memory is different

        System.out.println(s.equals(t));//True
        System.out.println(s.equals(t));//True
    }
}
