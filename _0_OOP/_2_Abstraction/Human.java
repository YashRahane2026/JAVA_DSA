package _0_OOP._2_Abstraction;

public interface Human {
    void speak();//Abstract method
    void eat();

    default void dance(){
        System.out.println("Human can Dance");
    }

    static void play(){
        System.out.println("Human can Play");
    }
}
/*
Difference of Default and Static and Abstract
*/
