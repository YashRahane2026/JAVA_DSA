package _0_OOP._5_Polymorphism.Static_CompileTime;

public class MathUtil {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        mathUtil.add(5,6);
        mathUtil.add(5,6,7);

    }
}
