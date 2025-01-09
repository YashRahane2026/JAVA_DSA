package _0_OOP._5_Polymorphism.Dynamic_RunTime_Inheritance;

public class App {
    public static void feedAnimal(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();//Runtime
        a1.eat();
        a2.eat();
        a3.eat();
        System.out.println();//OR
        feedAnimal(a2);
    }
}
