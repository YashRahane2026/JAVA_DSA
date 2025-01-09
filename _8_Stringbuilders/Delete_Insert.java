package _8_Stringbuilders;

public class Delete_Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yash Rahane");
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.delete(4,10); // i to j+1
        System.out.println(sb);
        sb.append(" Rahane");
        System.out.println(sb);
        sb.insert(4,63);
        System.out.println(sb);
    }
}
