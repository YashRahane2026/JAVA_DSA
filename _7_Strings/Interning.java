package _7_Strings;

public class Interning {
    public static void main(String[] args) {
        String s = "Raghav";
        System.out.println(s);
        // Raghav -> Madhav
        //s.charAt(0) = 'M';  //Error
        //s.charAt(2) = 'd';  //Error
        s = "Madhav";
        System.out.println(s);
        String t = "Madhav";//No extra Space is used

        String a = new String("Raghav");//New Raghav is created


    }
}
