package _8_Stringbuilders;

public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yash");
        System.out.println(sb);
        sb.append(63);
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        sb.append(" Rahane");
        System.out.println(sb);
        char[] c = {'A','Y','U'};
        sb.append(c);
        System.out.println(sb);

        int[] a = {1,2,3,4};
        sb.append(a);//Does not work Address is appended
        System.out.println(sb);

        StringBuilder t = new StringBuilder(" HELLO");
        sb.append(t);
        System.out.println(sb);
    }
}
