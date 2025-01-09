package _8_Stringbuilders;
//Frequency Arrays
public class charMaxOccurrence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("yashrahane");//Space and Uppercase not allowed
        int[] arr = new int[26];

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int a = (int) ch -97;
            arr[a]++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max){
                char ch = (char)(i+97);
                System.out.println(ch);
                break;
            }
        }
        //char ch = (char) (max+97); // Not working
        //System.out.println(ch);
    }
}
