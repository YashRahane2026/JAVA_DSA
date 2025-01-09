package _8_Stringbuilders;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbbccdfgg";
        char[] arr = s.toCharArray();
        String ans = "";
        int i = 0,j = 0;

        while (j<arr.length){
            if (arr[i] == arr[j]) j++;
            else {
                ans += arr[i];
                int len = j-i;
                if (len>1) ans += len;
                i = j;
            }
        }
        ans += arr[i];
        int len = j-i;
        if (len>1) ans += len;
        System.out.println(ans);
    }
}
