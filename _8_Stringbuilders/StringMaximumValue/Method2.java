package _8_Stringbuilders.StringMaximumValue;

public class Method2 {
    public static void main(String[] args) {
        String[] arr = {"000000000055","222","3333","456712"};
        String maxS = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
    }
    static String max (String a,String b){
        String s = purify(a), t = purify(b);
        if (s.length()>t.length()) return a;
        if (s.length()<t.length()) return b;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)){
                if (s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if (a.length()>=b.length()) return a;
        else return b;
    }
    static String purify (String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') return s.substring(i);
        }
        return s;
    }
}
