package _0_OOP._1_ConstructorOverloading;

public class Person {
    String name;
    int age;
    int height;

    public Person(){

    }
    public Person(String name,int age){
        System.out.println("Inside Constructor with 2 args");
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,int height){
        this(name,age);
        System.out.println("Inside Constructor with 3 args");
        this.height = height;
    }
    public void speak(){
        System.out.println("Name : "+age+" Age : "+name+" Height : "+height);
    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void walk(){
        System.out.println("I am Walking");
    }
}
