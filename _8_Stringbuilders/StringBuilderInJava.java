package _8_Stringbuilders;

public class StringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
                        //OR//
        String a = "abc";
        StringBuilder ab = new StringBuilder(a);

        System.out.println(sb.length());//3
        StringBuilder x = new StringBuilder(10);//Capacity
        System.out.println(x.length());//0
        System.out.println(x.capacity());//10

        //By Default StringBuilder capacity
        StringBuilder b = new StringBuilder();
        System.out.println(b.capacity());//16
    }
}
