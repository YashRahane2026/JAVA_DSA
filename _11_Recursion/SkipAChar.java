package _11_Recursion;

public class SkipAChar {
    static void skip_a(String s,int i){
        if(i==s.length()) return;
        if(s.charAt(i)!='a') {
            System.out.print(s.charAt(i));
        }
        skip_a(s,i+1);
    }
    public static void main(String[] args) {
        String s = "Yash Rahane";
        System.out.println(s);
        skip_a(s,0);
    }
}
