package _2_Loops;

public class ASCII_and_Binary {
    public static void main(String[] args) {
        char x = 'a';
        int a;
        while (x <= 'z'){ //x = 'a' should be less than equal to 'z'
            a = (int)x;
            System.out.println(a);
            x++;
        }
    }
}
