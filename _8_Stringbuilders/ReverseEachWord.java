package _8_Stringbuilders;

public class ReverseEachWord {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("My name is Yash Rahane");
        int n = sb.length();
        int i = 0,j = 0;
        while (j<n){
            if (sb.charAt(j) != ' ') j++;
            else {
                reverse(sb,i,j-1);
                i = j+1;
                j = i;
            }
        }
        reverse(sb,i,j-1);// Last word reverse
        System.out.println(sb);
    }
    static void reverse(StringBuilder sb,int i,int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
    }
}
