package _0_VishwaSir.Methods.Method_Overloding;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,double b){
        return (int)(a+b);
    }
    public int add(){
        return 0;
    }
    //.........................
    //Interview Q -> Ans -> NO
//    public int add(int a,int b){
//        return a+b;
//    }
//    public double add(int a,int b){
//        return a+b+0.5;
//    }
}
