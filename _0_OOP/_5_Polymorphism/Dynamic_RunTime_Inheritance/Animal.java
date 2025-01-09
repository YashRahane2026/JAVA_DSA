package _0_OOP._5_Polymorphism.Dynamic_RunTime_Inheritance;

public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is Eating");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is Eating");
    }
}