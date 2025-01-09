package _0_OOP._3_Encapsulation;

public class Boy {
    private String name;
    private Car car;

    public String getName() {
        return name;
    }
    public Car getCar() {
        return car;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}
class Car{
    private String name;
    private String color;
}
