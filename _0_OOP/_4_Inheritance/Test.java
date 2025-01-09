package _0_OOP._4_Inheritance;

import _0_OOP._4_Inheritance.Bird_Interface.Parrot;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.eat();
        d.speak();
        Animal animal = new Animal();
        //animal.secretMethod(); // Parents don't want to tell something
        //animal.speak();//Not Allowed // Parents always Give no Take
    }
}
