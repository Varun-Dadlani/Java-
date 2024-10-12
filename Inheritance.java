class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void showCar() {
        System.out.println("This is a car");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        car.showCar();
    }
}
