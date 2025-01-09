package _11_Recursion;

public class FunctionCalls {
    public static void mango() {
        System.out.println("Hi, I am in Mango");
    }
    public static void banana(){
        System.out.println("Hi, I am in Banana");
        mango();
    }
    public static void apple() {
        System.out.println("Hi, I am in Apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("Hi, I am in main Method");
        apple();
    }
}
