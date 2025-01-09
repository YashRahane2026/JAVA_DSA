package _8_Stringbuilders;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hsaY");
        System.out.println(sb.reverse());

        int i = 0,j = sb.length()-1;
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
        System.out.println(sb);
    }
}
