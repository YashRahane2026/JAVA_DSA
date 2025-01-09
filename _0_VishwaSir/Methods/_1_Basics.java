package _0_VishwaSir.Methods;

public class _1_Basics {
    public void checkForNonStatic(){
        System.out.println("Non Static");
        printHello("Here is Non Static");
    }
    public static void printHello(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        printHello("Yash Rahane");
    }
}
