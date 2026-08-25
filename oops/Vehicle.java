public class Vehicle {
    String brand;
    int speed;

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "yamaha";
        c.speed = 2400;
        c.numberOfDoors = 4;

        System.out.println(c.brand + " " + c.speed + " " + c.numberOfDoors);
    }
}

class Car extends Vehicle {
    int numberOfDoors;
}