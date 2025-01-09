package _0_OOP._4_Inheritance.Person_Possession;

public class Person {
    private String name;
    private int age;
    private Car car;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Car getCar() {
        return car;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}
class Car {
    private String name;
    private int color;

    public String getName() {
        return name;
    }
    public int getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(int color) {
        this.color = color;
    }
}