package _8_Stringbuilders.StringMaximumValue;

public class MaxValueMethod1 {
    public static void main(String[] args) {
        String[] arr = {"111","222","3333","456712"};
        int mx = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            mx = Math.max(mx,n);
        }
        System.out.println(mx);
    }
}
//Not Valid for very big Numbers like
//1234567892303369265356535
//Exception will occur