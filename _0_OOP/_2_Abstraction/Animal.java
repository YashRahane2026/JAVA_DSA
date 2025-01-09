package _0_OOP._2_Abstraction;

abstract class Animal {
    public void eat(){
        System.out.println("Animal is Eating");
    }
    public abstract void sleep();
}
/*
if there is no abstract method still code will work
*/
